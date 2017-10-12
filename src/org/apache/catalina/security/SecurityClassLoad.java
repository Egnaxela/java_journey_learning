/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月12日 上午10:17:28  
 *  
 */  

package org.apache.catalina.security;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年10月12日 上午10:17:28  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月12日      Eg                      1.0         1.0 Version  
 */

public final  class SecurityClassLoad {

    public static void securityClassLoad(ClassLoader loader)
        throws Exception {

        if( System.getSecurityManager() == null ){
            return;
        }
        
        loadCorePackage(loader);
        loadLoaderPackage(loader);
        loadServletsPackage(loader);
        loadSessionPackage(loader);
        loadUtilPackage(loader);
        loadJavaxPackage(loader);
        loadCoyotePackage(loader);
        loadHttp11Package(loader);
        loadTomcatPackage(loader);
    }
    
    
    private final static void loadCorePackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.catalina.";
        loader.loadClass
            (basePackage +
             "core.ApplicationContextFacade$1");
        loader.loadClass
            (basePackage +
             "core.ApplicationDispatcher$PrivilegedForward");
        loader.loadClass
            (basePackage +
             "core.ApplicationDispatcher$PrivilegedInclude");
        loader.loadClass
            (basePackage +
             "core.ContainerBase$PrivilegedAddChild");
        loader.loadClass
            (basePackage +
             "core.StandardWrapper$1");
        loader.loadClass
            (basePackage +
              "core.ApplicationHttpRequest$AttributeNamesEnumerator");
    }
    
    
    private final static void loadLoaderPackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.catalina.loader.";
        loader.loadClass
            (basePackage +
             "ResourceEntry");
        loader.loadClass
            (basePackage +
             "WebappClassLoader$PrivilegedFindResourceByName");
    }
    
    
    private static final void loadServletsPackage(ClassLoader loader)
            throws Exception {
        final String basePackage = "org.apache.catalina.servlets.";
        // Avoid a possible memory leak in the DefaultServlet when running with
        // a security manager. The DefaultServlet needs to load an XML parser
        // when running under a security manager. We want this to be loaded by
        // the container rather than a web application to prevent a memory leak
        // via web application class loader.
        loader.loadClass(basePackage + "DefaultServlet");
    }


    private final static void loadSessionPackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.catalina.session.";
        loader.loadClass(basePackage + "StandardSession");
        loader.loadClass(basePackage + "StandardSession$1");
        loader.loadClass(basePackage + "StandardManager$PrivilegedDoUnload");
    }
    
    
    private final static void loadUtilPackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.catalina.";
        loader.loadClass
            (basePackage + "util.URL");
        loader.loadClass(basePackage + "util.Enumerator");
        loader.loadClass(basePackage + "util.DefaultAnnotationProcessor$1");
        loader.loadClass(basePackage + "util.DefaultAnnotationProcessor$2");
        loader.loadClass(basePackage + "util.DefaultAnnotationProcessor$3");
        loader.loadClass(basePackage + "util.DefaultAnnotationProcessor$4");
    }
    
    
    private final static void loadJavaxPackage(ClassLoader loader)
        throws Exception {
        loader.loadClass("javax.servlet.http.Cookie");
    }
    

    private final static void loadHttp11Package(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.coyote.http11.";
        loader.loadClass(basePackage + "InternalOutputBuffer$1");
        loader.loadClass(basePackage + "InternalOutputBuffer$2");
        loader.loadClass(basePackage + "Constants");
    }
    
    
    private final static void loadCoyotePackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.catalina.connector.";
        loader.loadClass
            (basePackage +
             "RequestFacade$GetAttributePrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetParameterMapPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetRequestDispatcherPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetParameterPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetParameterNamesPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetParameterValuePrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetCharacterEncodingPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetHeadersPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetHeaderNamesPrivilegedAction");  
        loader.loadClass
            (basePackage +
             "RequestFacade$GetCookiesPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetLocalePrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetLocalesPrivilegedAction");
        loader.loadClass
            (basePackage +
             "ResponseFacade$SetContentTypePrivilegedAction");
        loader.loadClass
            (basePackage + 
             "ResponseFacade$DateHeaderPrivilegedAction");
        loader.loadClass
            (basePackage +
             "RequestFacade$GetSessionPrivilegedAction");
        loader.loadClass
            (basePackage +
             "ResponseFacade$1");
        loader.loadClass
            (basePackage +
             "OutputBuffer$1");
        loader.loadClass
            (basePackage +
             "CoyoteInputStream$1");
        loader.loadClass
            (basePackage +
             "CoyoteInputStream$2");
        loader.loadClass
            (basePackage +
             "CoyoteInputStream$3");
        loader.loadClass
            (basePackage +
             "CoyoteInputStream$4");
        loader.loadClass
            (basePackage +
             "CoyoteInputStream$5");
        loader.loadClass
            (basePackage +
             "InputBuffer$1");
        loader.loadClass
            (basePackage +
             "Response$1");
        loader.loadClass
            (basePackage +
             "Response$2");
        loader.loadClass
            (basePackage +
             "Response$3");
    }

    private final static void loadTomcatPackage(ClassLoader loader)
        throws Exception {
        String basePackage = "org.apache.tomcat.";
        loader.loadClass(basePackage + "util.net.SSLSupport$CipherData");
        // Make sure system property is read at this point
        Class<?> clazz = loader.loadClass(
                basePackage + "util.http.FastHttpDateFormat");
        clazz.newInstance();

        // security
        loader.loadClass(basePackage + "util.security.PrivilegedGetTccl");
        loader.loadClass(basePackage + "util.security.PrivilegedSetTccl");
    }
}
