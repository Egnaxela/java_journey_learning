package com.rongji;
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;  

/** 
 * 代码行数统计 
 */  
public class CodeCounter {  

    /** 
     * 代码行数统计 
     */  
    public static void main(String[] args) {  
//        String file = CodeCounter.class.getResource("/").getFile();  
//        String path = file.replace("target/test-classes", "src");  
    	String  path="D://1-NetbeansWork//eciq_common//src";
    	/**
    	 * 统计文件：5775
    	 * 代码行数：1545495
    	 * 注释行数：481607
    	 * 空白行数：197455
    	 */
    //	String  path2="D://1-NetbeansWork//eciq_common//src";
    	
        ArrayList<File> al = getFile(new File(path));  
        for (File f : al) {  
            if (f.getName().matches(".*\\.java$")){ // 匹配java格式的文件  
                count(f);  
                System.out.println(f);  
            }  
        }  
        System.out.println("总统计文件: " + files);
        System.out.println("总空白行数: " + blankLines); 
        System.out.println("总注释行数: " + commentLines);  
        System.out.println("总有效代码行数: " + codeLines); 
        System.out.println("总行数: " + (codeLines+commentLines+blankLines)); 
        System.out.println("统计时间: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }  
      
    static long files = 0;  
    static long codeLines = 0;  
    static long commentLines = 0;  
    static long blankLines = 0;  
    static ArrayList<File> fileArray = new ArrayList<File>();  
      
    /** 
     * 获得目录下的文件和子目录下的文件 
     * @param f 
     * @return 
     */  
    public static ArrayList<File> getFile(File f) {  
        File[] ff = f.listFiles();  
        for (File child : ff) {  
            if (child.isDirectory()) {  
                getFile(child);  
            } else  
                fileArray.add(child);  
        }  
        return fileArray;  

    }  

    /** 
     * 统计方法 
     * @param f 
     */  
    private static void count(File f) {  
        BufferedReader br = null;  
        boolean flag = false;  
        try {  
            br = new BufferedReader(new FileReader(f));  
            String line = "";  
            while ((line = br.readLine()) != null) {  
                line = line.trim(); // 除去注释前的空格  
                if (line.matches("^[ ]*$")) { // 匹配空行  
                    blankLines++;  
                } else if (line.startsWith("//")) {  
                    commentLines++;  
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {  
                    commentLines++;  
                    flag = true;  
                } else if (line.startsWith("/*") && line.endsWith("*/")) {  
                    commentLines++;  
                } else if (flag == true) {  
                    commentLines++;  
                    if (line.endsWith("*/")) {  
                        flag = false;  
                    }  
                } else {  
                    codeLines++;  
                }  
            }  
            files++;  
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