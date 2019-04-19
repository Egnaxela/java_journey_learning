/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月16日 下午3:24:15  
 *  
 */  

package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import static net.bytebuddy.matcher.ElementMatchers.named;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月16日 下午3:24:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月16日      Pluto       1.0         1.0 Version  
 */

public class ByteBuddyTest {
	
	@Test
	public void test() throws Exception {
		String str="Hello ByteBuddy";
		DynamicType.Unloaded<Object> unloaded=new ByteBuddy()
				.subclass(Object.class)
				.method(named("str"))
				.intercept(FixedValue.value(str))
				.make();
		Class<? extends Object> clazz=unloaded
				.load(ByteBuddyTest.class.getClassLoader())
				.getLoaded();
		Assert.assertEquals(clazz.newInstance().toString(), str);
		
	}
	
	
    @Test
    public void test2() throws Exception {
        String toString = "hello ByteBuddy";
        String name = "com.joe.ByteBuddyObject";
        DynamicType.Unloaded<Object> unloaded = new ByteBuddy()
                .subclass(Object.class)
                .name("com.joe.ByteBuddyObject")
                .method(named("toString"))
                .intercept(FixedValue.value(toString))
                .make();

        Class<? extends Object> clazz = unloaded
            .load(ByteBuddyTest.class.getClassLoader())
            .getLoaded();
        Assert.assertEquals(clazz.newInstance().toString(), toString);
        Assert.assertEquals(clazz.getName(), name);
    }
    
    
    @Test
    public void test3() throws Exception {
    Class<?> dynamicType = new ByteBuddy()
    		  .subclass(Object.class)
    		  .method(ElementMatchers.named("toString"))
    		  .intercept(FixedValue.value("Hello World!"))
    		  .make()
    		  .load(getClass().getClassLoader())
    		  .getLoaded();
    		 
    assertThat(dynamicType.newInstance().toString(), is("Hello World!"));

    }
}
