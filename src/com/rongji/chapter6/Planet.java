/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月8日 下午7:27:34  
 *  
 */  

package com.rongji.chapter6;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月8日 下午7:27:34  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月8日      吴有根                      1.0         1.0 Version  
 */

public enum Planet {
	MERCURY(3.302e+23,2.439e6),
	VENUS(4.869e+24,6.052e6),
	EARTH(5.975e+24,6.378e6);
	
	private final double mass;
	private final double radius;
	private final double surfaceGravity;
	private static  final double G=6.67300E-11;
	
	/**
	 * 
	 */
	Planet(double mass,double radius) {
		this.mass=mass;
		this.radius=radius;
		surfaceGravity=G*mass/(radius*radius);
	}
	
	public double mass(){ return mass; }
	public double radius(){return radius;}
	public double surfaceGravity(){return surfaceGravity;}
	
	public double surfaceWeight(double mass) {
		return mass*surfaceGravity;//F=ma
	}
	
	
}
