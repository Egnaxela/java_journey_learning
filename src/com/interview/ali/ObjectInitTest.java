/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年2月17日 下午3:13:45  
 *  
 */  

package com.interview.ali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年2月17日 下午3:13:45  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年2月17日      Pluto       1.0         1.0 Version  
 */

public class ObjectInitTest {

	@Test
	public void name() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, FileNotFoundException, IOException, ClassNotFoundException {
		String s=Thread.currentThread().getName();
		String classLoader=Thread.currentThread().getContextClassLoader().toString();
		System.out.println(s +"\n"+classLoader);
		//
		Employee e1=new Employee();
		e1.setName("Mike"); e1.setAge(23); e1.setSalary(20000);
		System.out.println(e1);
		
		//
		Class.forName("com.interview.ali.ObjectInitTest").newInstance();
		
		Employee e2= Employee.class.newInstance();
		e2.setName("May"); e2.setAge(24); e2.setSalary(25000);
		System.out.println(e2);
		
		Employee e3= Employee.class.getConstructor().newInstance();
		e3.setName("Mary"); e3.setAge(21); e3.setSalary(35000);
		System.out.println(e3);
		
		//使用clone必须要实现Cloneable接口并重写clone方法
		Employee e4=(Employee)e3.clone();
		e4.setName("Jack"); e4.setAge(20); e4.setSalary(15000);
		System.out.println(e4);
		
		//使用序列化必须要使用Serializable接口
		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("data.obj"));
		outputStream.writeObject(e4);
		outputStream.close();
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("data.obj"));
		Employee e5=(Employee) inputStream.readObject();
		inputStream.close();
		e5.setName("Rose"); e5.setAge(19); e5.setSalary(22000);
		System.out.println(e5);
		

		for(EnumTest e:EnumTest.values()) {
			System.out.println(e);
		}
		
	}
	
}


class Employee implements Cloneable,Serializable{
	
	private static final long serialVersionUID = 5428970513216187221L;
	private String name;
	private int age;
	private float salary;
	
	public Employee(){
		System.out.println("Constructor Called .............");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}


enum EnumTest{

    MON, TUE, WED, THU, FRI, SAT, SUN;
	
}