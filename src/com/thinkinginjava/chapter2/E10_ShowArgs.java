/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午3:01:23  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午3:01:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E10_ShowArgs {

	public static void main(String[] args) {
		if(args.length<3) {
			System.out.println("You need 3 args ");
			System.exit(0);//正常终止
		}
		//多个参数 用空格隔开
		System.out.println("args[0]="+args[0]+"\nargs[1]="+args[1]+"\nargs[2]="+args[2]);
	}
}
