/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年8月8日 下午2:09:01  
 *  
 */  

package com.rongji.lang;

import java.util.Random;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年8月8日 下午2:09:01  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月8日      吴有根                      1.0         1.0 Version  
 */

public class WorldTest {

	public static void main(String[] args) {
		System.out.println(randomString(-229985452)+' '+randomString(-147909649));
	}
	
	public static String randomString(int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }


}
