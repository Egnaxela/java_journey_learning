/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年5月18日 下午4:20:49  
 *  
 */  

package com.rongji.algorithm;

import java.util.UUID;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年5月18日 下午4:20:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年5月18日      Eg                      1.0         1.0 Version  
 */

public class Sort {

	private int[] bucket;
	
	public void bucketSort(int max,int[] args){
		bucket=new int[max];
		
		/**
		 * 
		 * 桶排序对于n个数，所需要的空间为n个数中最大值数m +1
		 * 把要排序的数按值依次放入桶下标为该值的桶中
		 * 这样要排序的数就全部是排好序的在(m+1)多桶中
		 * 这样桶中的值与下标就是一致的
		 */
		if(args!=null&&args.length>1){
			for(int i=0;i<args.length;i++){
				bucket[args[i]]++;
			}
		}
		
		/**
		 * 遍历输出
		 * 
		 * 
		 */
		for(int i=bucket.length-1;i>=0;i--){
			for(int j=0;j<bucket[i];j++){
				System.out.print(i+" ");
			}
		}
		
		/**
		 * <code>System</code>
		 * 局限性：
		 * 桶排序占用的空间不可确定，依赖于最大值数
		 * 桶排序不支持负数
		 */
		
	}
	
	
	@Test
	public void sortTest(){
	  //int a[]={2,4,237,113,11,236,876,12,16};
	  //bucketSort(877,a);
		int b[]={3,1,5,4};
		
		bucketSort(6, b);
	}
	
	@Test
	public void generateKey() {
		for (int i = 0; i < 10; i++) {
			String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");

			System.out.println(uuid);
		}
	}
	
	
	@Test
	public void test1(){
		int m=64;
		if((m&m-1)==0){
			System.out.println(m+" 是2的整数倍数");
		}else{
			System.out.println(m+" 不是2的整数倍数");
		}
	}
	
}
