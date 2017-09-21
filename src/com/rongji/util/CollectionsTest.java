/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年9月14日 下午7:40:59  
 *  
 */  

package com.rongji.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

import com.google.common.base.Ticker;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年9月14日 下午7:40:59  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年9月14日      吴有根                      1.0         1.0 Version  
 */

public class CollectionsTest {
	
		public static final int DEFAULT_ARRAY_LENGTH = 10 * 1000 * 1000;

		private List<Integer> createList(int arrLength) {
			List<Integer> numbers = Lists.newArrayList();
			for(int i = 0; i < DEFAULT_ARRAY_LENGTH; i++) {
				numbers.add(i);
			}
			Collections.shuffle(numbers);
			return numbers;
		}
		public long testCollectionsSort(List<Integer> numbers) {
			Ticker ticker = Ticker.systemTicker();
			long startTime = ticker.read();
			Collections.sort(numbers, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return Ints.compare(o2, o1);
				}
			});
			//long endTime = ticker.read();
			//System.out.println("[testCollectionsSort]" + (endTime - startTime) / 1000);
			//System.out.println("[testCollectionsSort]" + numbers.toString());
			return (ticker.read() - startTime) / 1000;
		}

		public long testSortedMap(List<Integer> numbers) {
			Ticker ticker = Ticker.systemTicker();
			long startTime = ticker.read();
			TreeSet<Integer> sortedNumberSet = new TreeSet<Integer>(new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return Ints.compare(o2, o1);
				}
			});
			sortedNumberSet.addAll(numbers);
			//long endTime = ticker.read();
			//System.out.println("[testSortedMap]" + (endTime - startTime) / 1000);
			//List<Integer> newNumbers = Lists.newArrayList(sortedNumberSet);
			//System.out.println("[testSortedMap]" + newNumbers.toString());
			return (ticker.read() - startTime) / 1000;
		}

		@Test
		public void testSortMethodCompare() {
			int loopCount = 10;
			long collectionsSortTimeTotalCount = 0;
			long sortedMapTimeTotalCount = 0;
			List<Integer> numbers = createList(DEFAULT_ARRAY_LENGTH);
			for(int i = 0; i < loopCount; i ++) {
				List<Integer> tempNumbers = Lists.newArrayList(numbers);//每次循环使用同样数据
				sortedMapTimeTotalCount += testSortedMap(tempNumbers);//不会改变tempNumbers
				collectionsSortTimeTotalCount += testCollectionsSort(tempNumbers);
			}
			long collectionsSortTimeCount = collectionsSortTimeTotalCount / loopCount;
			long sortedMapTimeCount = sortedMapTimeTotalCount / loopCount;
			System.out.println("[testSortMethodCompare] loopCount = " + loopCount
					+ ",listSize = " + DEFAULT_ARRAY_LENGTH);
			System.out.println("[CollectinSort]" + collectionsSortTimeCount + "微秒");
			System.out.println("[SortedMapSort]" + sortedMapTimeCount + "微秒");
		}

}
