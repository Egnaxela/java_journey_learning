/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月8日 下午6:41:24  
 *  
 */  

package com.google.gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月8日 下午6:41:24  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月8日      Eg                      1.0         1.0 Version  
 */

public class ReadJsonFileUtils {
	public String ReadFile(String Path){  
        BufferedReader reader = null;  
        String laststr = "";  
        try{  
            FileInputStream fileInputStream = new FileInputStream(Path);  
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");  
            reader = new BufferedReader(inputStreamReader);  
            String tempString = null;  
            while((tempString = reader.readLine()) != null){  
                laststr += tempString;  
            }  
            reader.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }finally{  
            if(reader != null){  
                try {  
                    reader.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return laststr;  
    }  
}
