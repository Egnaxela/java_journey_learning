/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月21日 下午3:13:56  
 *  
 */  

package org.springframework.web.context;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月21日 下午3:13:56  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月21日      Eg                      1.0         1.0 Version  
 */

public class ContextLoaderListener extends ContextLoader implements ServletContextListener {
	
	
	public ContextLoaderListener() {
		
	}
	
	public ContextLoaderListener(WebApplicationContext context) {
		super(context);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		initWebApplicationContext(event.getServletContext());
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		closeWebApplicationContext(event.getServletContext());
		ContextCleanupListener.cleanupAttributes(event.getServletContext());
	}

}
