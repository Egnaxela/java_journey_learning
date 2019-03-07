/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午4:37:21  
 *  
 */  

package com.thinkinginjava.chapter3;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午4:37:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E04_Velocity {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("You need 2 numbers");
			Runtime.getRuntime().exit(0);
		}
		System.out.println("velocity:"+Float.parseFloat(args[0])/Float.parseFloat(args[1]));
	}
}
