/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月15日 下午7:01:49  
 *  
 */  

package com.redis;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年10月15日 下午7:01:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月15日      Eg                      1.0         1.0 Version  
 */



/**
 * 
 * ehcache+redis http://git.oschina.net/ld/J2Cache
 * 
 * 注意点：数据过期策略 、存储进redis前使用序列化压缩工具 MsgPack
 * 
 * 
 * 
 */
public class RedisUtil {
	
	/**
	 * 
	 * spring封装了RedisTemplate对象来进行对象redis的各种操作
	 * 支持所有的redis原生的api
	 * 
	 */
	@Autowired
	private RedisTemplate<Serializable,Object> redisTemplate;

	
	/**
	 * 
	* <p>描述:测试redis是否连接成功</p>
	* @return
	* @author Eg
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean ping() {
		String result="";
		try {
			result=(String) redisTemplate.execute(new RedisCallback() {
				public String doInRedis(RedisConnection connection) throws DataAccessException {
					return connection.ping();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return "PONG".equals(result)?true:false;
	}
}
