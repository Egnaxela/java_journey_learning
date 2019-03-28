/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月28日 下午7:13:05  
 *  
 */  

package com.designPattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月28日 下午7:13:05  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月28日      Pluto       1.0         1.0 Version  
 */

public class Test {

	public static void main(String[] args) {
		//代理对象
		IUserDao proxy=new UserDaoStaticProxy();
		//执行代理方法
		proxy.save();
		
		
		IUserDao target=new UserDao();
		System.out.println("目标对象:"+target.getClass());
		
		//动态代理对象
		IUserDao proxy2=(IUserDao)new UserDaoDynamicProxy(target).getProxyInstance();
		System.out.println("代理对象:"+proxy2.getClass());
		proxy2.save();
		
	}


}


/**
 * 动态代理
 * 1、动态代理类的源码是在程序运行期间，通过JVM反射等机制动态生成的。
 * 2、代理类和委托类的关系是运行时才确定的。
 * 
 * 使用JDK生成动态代理的前提是目标类必须要实现接口的方法
 * 此时可以使用CGLIB代理，以动态生成的子类继承目标的方式实现，在运行期间动态的在内存中构建一个子类
 * 如：class CglibProxy extends UserDao{ } 
 * 使用cglib代理的前提是目标类不能为final修饰，因为final修饰的类不能被继承嘛
 */
class UserDaoDynamicProxy{
	private Object target;
	
	public UserDaoDynamicProxy(Object target) {
		this.target=target;
	}
	
	//返回对目标对象target代理后的对象
	public Object getProxyInstance() {
		Object proxy=Proxy.newProxyInstance(
		target.getClass().getClassLoader(),
		target.getClass().getInterfaces(),
		new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//获取当前执行方法的方法名
				String methodName=method.getName();
				
				//方法的返回值
				Object result=null;
				if("find".equals(methodName)) {
					result=method.invoke(target, args);
				}else {
					System.out.println("开启事务......");
					result=method.invoke(target, args);
					System.out.println("提交事务......");
					
				}
				return result;
			}
		});
		
		return proxy;
	}
} 




/**
 * 
 * 静态代理
 * 1、目标对象必须要实现接口
 * 2、代理对象必须要实现与目标对象一样的接口
 * 
 * 缺点:一旦接口中增加方法，相应的 代理类和实现目标类都要实现对应的方法，增加了代码的维护成本
 * 
 */
class UserDaoStaticProxy implements IUserDao{

	//代理对象需先维护一个目标对象
	private IUserDao target=new UserDao();
	
	@Override
	public void save() {
		System.out.println("代理操作:开启事务...........");
		target.save();
		System.out.println("代理操作:提交事务...........");
	}

	@Override
	public void find() {
		System.out.println("代理操作:开启事务...........");
		target.find();
		System.out.println("代理操作:提交事务...........");
	}
	
}



//目标对象
class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("保存用户............");
	}

	@Override
	public void find() {
		System.out.println("查询用户.............");
	}
	
}


//接口
interface IUserDao{
	void save();
	void find();
}