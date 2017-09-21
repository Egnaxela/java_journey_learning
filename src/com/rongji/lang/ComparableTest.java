/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月15日 上午11:25:38  
 *  
 */  

package com.rongji.lang;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月15日 上午11:25:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月15日      吴有根                      1.0         1.0 Version  
 */

public interface ComparableTest<T> {
	
	
	/**
	 * 
	* <p>描述:Effective Chapter3  p53</p>
	* <ul>
	* <li><code>BigDecimal</code></li>
	* </ul>
	* @param o
	* @return
	* @author 
	 */
	public int compareTo(T o);
}
