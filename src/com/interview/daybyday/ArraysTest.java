/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月28日 下午11:51:08  
 *  
 */  

package com.interview.daybyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月28日 下午11:51:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月28日      Pluto       1.0         1.0 Version  
 */

public class ArraysTest {
	public static void main(String[] args) {
		
		String[] s=new String[] {"Jake", "World", "Count"};
		List<String> l=Arrays.asList(s);
		System.out.println(l.toArray().getClass().getName());
		System.out.println(l.toArray(new Object[0]).getClass().getName());
		
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(list.toArray().getClass().getName());
	}

}
