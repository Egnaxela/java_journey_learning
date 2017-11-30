package com.rongji;

import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;  

/** 
 * 代码行数统计 
 */  
public class StatisticCodeLines {  
      
    public static int normalLines = 0;  //有效程序行数  
    public static int whiteLines = 0;   //空白行数  
    public static int commentLines = 0; //注释行数  
    public static int files=0;//文件个数
      
    public static void main(String[] args) throws IOException{  
        
    	/**
    	 * 总文件个数：5775
    	 * 总空白行数：197455
    	 * 总注释行数：479569
    	 * 总有效代码行数: 1547533
    	 * 总行数：2224557
    	 * 统计时间: 2017-11-30 20:16:42
    	 */
        File file = new File("D://1-NetbeansWork//eciq_apps//src");  
        if (file.exists()) {  
            statistic(file);  
        }  
        System.out.println("总文件个数：" + files); 
        System.out.println("总空白行数：" + whiteLines);  
        System.out.println("总注释行数：" + commentLines);  
        System.out.println("总有效代码行数: " + normalLines);  
        System.out.println("总行数：" + (normalLines + whiteLines + commentLines));  
        System.out.println("统计时间: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }  
      
    private static void statistic(File file) throws IOException {  

        if (file.isDirectory()) {  
            File[] files = file.listFiles();  
            for (int i = 0; i < files.length; i++) {  
                statistic(files[i]);  
            }  
        }  
        if (file.isFile()) {  
            //统计扩展名为java的文件  
            if(file.getName().matches(".*\\.java$")){  
                parse(file);  
            }  
        }  
    }  
      
    public static void parse(File file) {  
        BufferedReader br = null;  
        // 判断此行是否为注释行  
        boolean comment = false;  
        int temp_whiteLines = 0;  
        int temp_commentLines = 0;  
        int temp_normalLines = 0;  
          
        try {  
            br = new BufferedReader(new FileReader(file));  
            String line = "";  
            while ((line = br.readLine()) != null) {  
                line = line.trim();  
                if (line.matches("^[//s&&[^//n]]*$")) {  
                    // 空行  
                    whiteLines++;  
                    temp_whiteLines++;  
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {  
                    // 判断此行为"/*"开头的注释行  
                    commentLines++;  
                    comment = true;  
                } else if (comment == true && !line.endsWith("*/")) {  
                    // 为多行注释中的一行（不是开头和结尾）  
                    commentLines++;  
                    temp_commentLines++;  
                } else if (comment == true && line.endsWith("*/")) {  
                    // 为多行注释的结束行  
                    commentLines++;  
                    temp_commentLines++;  
                    comment = false;  
                } else if (line.startsWith("//")) {  
                    // 单行注释行  
                    commentLines++;  
                    temp_commentLines++;  
                } else {  
                    // 正常代码行  
                    normalLines++;  
                    temp_normalLines++;  
                }  
            }  
            
            files++;
            System.out.println(file.getPath()+" 总行数" + (temp_normalLines + temp_whiteLines + temp_commentLines)+
            		" 有效行数" + temp_normalLines +
            		" ,空白行数" + temp_whiteLines +
            		" ,注释行数" + temp_commentLines);  
              
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (br != null) {  
                try {  
                    br.close();  
                    br = null;  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
      
}  