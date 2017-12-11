/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月11日 下午7:19:53  
 *  
 */  

package org.springframework.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月11日 下午7:19:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月11日      Eg                      1.0         1.0 Version  
 */

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyBean bean=(MyBean) bf.getBean("myBean");
		System.out.println(bean.getTestStr());
	}
}
