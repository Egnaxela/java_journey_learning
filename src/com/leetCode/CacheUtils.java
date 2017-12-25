/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月20日 下午5:50:21  
 *  
 */  

package com.leetCode;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月20日 下午5:50:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月20日      Eg                      1.0         1.0 Version  
 */

public class CacheUtils {

	
	public static void main(String[] args) {
		System.out.println(Thread.class.getName());
		System.out.println(Thread.currentThread().getName());
		ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
		System.out.println(classLoader);
		if(classLoader==CacheUtils.class.getClassLoader()) {
			System.out.println(CacheUtils.class.getClassLoader());
		}
		WebApplicationContext context=new WebApplicationContext() {
			
			@Override
			public Resource getResource(String location) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ClassLoader getClassLoader() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Resource[] getResources(String locationPattern) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void publishEvent(Object arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void publishEvent(ApplicationEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getMessage(String arg0, Object[] arg1, String arg2, Locale arg3) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMessage(String arg0, Object[] arg1, Locale arg2) throws NoSuchMessageException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getMessage(MessageSourceResolvable arg0, Locale arg1) throws NoSuchMessageException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BeanFactory getParentBeanFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsLocalBean(String name) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isTypeMatch(String name, Class<?> targetType) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isPrototype(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getBean(String name, Object... args) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getBean(Class<T> requiredType) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getBean(String name) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getAliases(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsBean(String name) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType)
					throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
					throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons, boolean allowEagerInit) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanNamesForType(Class<?> type) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getBeanDefinitionNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBeanDefinitionCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsBeanDefinition(String beanName) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Environment getEnvironment() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getStartupDate() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ApplicationContext getParent() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getDisplayName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getApplicationName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ServletContext getServletContext() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		if(context instanceof ConfigurableWebApplicationContext) {
			System.out.println("ss");
		}
	}
	
	
}
