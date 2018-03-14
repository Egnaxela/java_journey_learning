/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月14日 上午11:18:28  
 *  
 */  

package org.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.google.gson.Authors;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月14日 上午11:18:28  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月14日      Eg                      1.0         1.0 Version  
 */

public class EntCacheTest {
	private EntgeneratorCacheUtils<String, Authors> cacheUtils = new EntgeneratorCacheUtils<>();

	public static void main(final String[] args) throws Exception {
		final EntCacheTest example = new EntCacheTest();
		final Authors fn = example.getNumber("001");
		Authors fn2 = example.getNumber("002");
	}

	private final EntgeneratorCacheUtils<String, Authors> cache = new EntgeneratorCacheUtils<>();

	public EntCacheTest() {
		Authors authors = new Authors("李白", "唐");
		Authors authors1 = new Authors("李白1", "唐");
		Authors authors2 = new Authors("李白2", "唐");
		Authors authors3 = new Authors("李白3", "唐");
		cache.setValueIfAbsent("00", authors);
		cache.setValueIfAbsent("001", authors1);
		cache.setValueIfAbsent("002", authors2);
		cache.setValueIfAbsent("003", authors3);
	}

	public Authors getNumber(final String index) throws Exception {
		return cache.getValue(index, new Callable<Authors>() {
			@Override
			public Authors call() throws Exception {
				return getNumber(index);
			}
		});
	}
}
