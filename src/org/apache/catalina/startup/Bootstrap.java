/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月12日 上午10:00:00  
 *  
 */  

package org.apache.catalina.startup;

import java.io.File;

import org.apache.catalina.security.SecurityClassLoad;
import org.apache.log4j.Logger;

/**  
 * Description: Tomcat启动类  
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年10月12日 上午10:00:00  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月12日      Eg                      1.0         1.0 Version  
 */

public final class Bootstrap {
	
	private static Logger log=Logger.getLogger(Bootstrap.class);
	private static Bootstrap daemon=null;
	
	protected ClassLoader commonLoader=null;
	protected ClassLoader catalinaLoader=null;
	
	public void init() throws Exception {
		
		setCatalinaHome();//set catalina.home 
		setCatalinaBase();
		initClassLoaders();
		Thread.currentThread().setContextClassLoader(catalinaLoader);
		SecurityClassLoad.securityClassLoad(catalinaLoader);
	}
	
	private void initClassLoaders() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void setCatalinaBase() {
		if(System.getProperty("catalina.base")!=null)
			return ;
		if(System.getProperty("catalina.home")!=null) {
			System.setProperty("catalina.base", System.getProperty("catalina.home"));
		}else {
			System.setProperty("catalina.base", System.getProperty("user.dir"));
		}
	}
	
	private void setCatalinaHome() {
		if(System.getProperty("catalina.home")!=null) {
			return;
		}
		File bootstrapJar=new File(System.getProperty("user.dir"),"bootstrap.jar");
		if(bootstrapJar.exists()) {
			try {
				System.setProperty("catalina.home", (new File(System.getProperty("user.dir"),"..")).getCanonicalPath());
			} catch (Exception e) {
				System.setProperty("catalina.home", System.getProperty("user.dir"));
			}
		}else {
			System.setProperty("catalina.home", System.getProperty("user.dir"));
		}
	}

	public static void main(String[] args) {
		if(daemon==null) {
			daemon=new Bootstrap();
			try {
				daemon.init();
			}catch (Throwable t) {
				t.printStackTrace();
				return;
			}
		}
	}

}
