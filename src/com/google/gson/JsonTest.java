package com.google.gson;

import java.io.UnsupportedEncodingException;
import java.util.List;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


//http://blog.csdn.net/mingtianhaiyouwo/article/details/51336381
public class JsonTest {  
    @SuppressWarnings({ "static-access", "deprecation", "unchecked" })  
    public static void main(String[] args) throws UnsupportedEncodingException {  
        String JsonContext = new ReadJsonFileUtils().ReadFile("E:\\Apache Commons\\chinese-poetry-json\\authors.tang.json");  
        JSONArray jsonArray = JSONArray.fromObject(JsonContext);  
        /*String s= java.net.URLDecoder.decode(JsonContext, "utf-8"); 
        JSONObject jsonArray = new JSONObject();*/  
  
        int size = jsonArray.size();  
        System.out.println("Size: " + size);  
        for(int  i = 0; i < size; i++){  
            JSONObject jsonObject = jsonArray.getJSONObject(i);  
            System.out.println("[" + i + "]name=" + jsonObject.get("name"));  
            System.out.println("[" + i + "]pdesc=" + jsonObject.get("desc"));  
              
        }  
        List<MorphDynaBean> listObject = jsonArray.toList(jsonArray);  
        for(int i = 0, j = listObject.size(); i < j ; i++){  
            System.out.println(listObject.get(i));  
        }  
        for(MorphDynaBean temp: listObject){  
            System.out.println(temp.get("name"));  
        }  
    }  
}  