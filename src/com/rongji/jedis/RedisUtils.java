/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年6月1日 上午11:39:46  
 *  
 */  

package com.rongji.jedis;

import java.io.Serializable;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import com.util.StringUtils;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年6月1日 上午11:39:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月1日      Eg                      1.0         1.0 Version  
 */

public class RedisUtils {
	
	public static final String Z_CCM_SIMPLELIST_9 = "Z_CCM_SIMPLELIST_9";//公共基础数据
	public static final String Z_BBD_ECIQSIMPLELIST = "Z_BBD_ECIQSIMPLELIST";//公共列表
	public static final String Z_CCM_WORLDDISTRICT = "Z_CCM_WORLDDISTRICT";//世界各国和地区
	public static final String SYS_COMPOUND = "SYS_COMPOUND";//动态字典
	public static final String Z_BBD_CIQ_CODE = "Z_BBD_CIQ_CODE";//产品CIQ编码
	public static final String Z_CCM_SIMPLELIST_5 = "Z_CCM_SIMPLELIST_5";//证单类型相关
	public static final String Z_CCM_SIMPLELIST_7 = "Z_CCM_SIMPLELIST_7";//检验方式
	public static final String Z_CCM_SIMPLELIST_10 = "Z_CCM_SIMPLELIST_10";//天气情况
	public static final String Z_CCM_SIMPLELIST_6 = "Z_CCM_SIMPLELIST_6";//检验依据
	public static final String Z_CCM_SIMPLELIST_4 = "Z_CCM_SIMPLELIST_4";//货物属性类简单型代码
	public static final String SYS_ORGANIZE = "SYS_ORGANIZE";//检验检疫机构

	
	@Autowired
	private RedisTemplate<Serializable, Object> redisTemplate;
	
	
	public void remove(final String...keys ){
		for(String key:keys){
			remove(key);
		}
	}
	
	public void remove(final String key){
		if(exist(key)){
			redisTemplate.delete(key);
		}
	}
	
	public boolean exist(final String key){
		return redisTemplate.hasKey(key);
	}
	
	public void removePattern(final String pattern){
		Set<Serializable> keys=redisTemplate.keys(pattern);
		if(keys.size()>0){
			redisTemplate.delete(keys);
		}
	}
	
	public Object get(final String key){
		Object result=null;
		ValueOperations<Serializable, Object> operations=redisTemplate.opsForValue();
		result=operations.get(key);
		return result;
	}
	
	public Object get(final String key,final String hashKey){
		Object result=null;
		HashOperations<Serializable, Object,Object> operations=redisTemplate.opsForHash();
		result=operations.get(key, hashKey);
		return result;
	}
	
	public String codeToName(final String key,final String hashKey){
		if(StringUtils.isEmpty(key)||StringUtils.isEmpty(hashKey)){
			return "";
		}
		Object result=null;
		HashOperations<Serializable,Object,Object> operations=redisTemplate.opsForHash();
		result=operations.get(key, hashKey);
		return result!=null?String.valueOf(result):"";
	}
}
