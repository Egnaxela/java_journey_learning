/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年6月8日 下午7:43:24  
 *  
 */  

package com.rongji.chapter6;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年6月8日 下午7:43:24  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月8日      Eg                      1.0         1.0 Version  
 */

public class WeightTable {

	public static void main(String[] args) {
		double earthWeight=Double.parseDouble(args[0]);
		double mass=earthWeight/Planet.EARTH.surfaceGravity();
		for(Planet p:Planet.values()){
			System.out.printf("Weight On %s is %f%n",p,p.surfaceWeight(mass));
		}
	}
}
