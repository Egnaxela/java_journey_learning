/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017��5��18�� ����4:20:49  
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
 * Create at:   2017��5��18�� ����4:20:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017��5��18��      Eg                      1.0         1.0 Version  
 */

public class Sort {

	private int[] bucket;
	
	public void bucketSort(int max,int[] args){
		bucket=new int[max];
		
		/**
		 * 
		 * Ͱ�������n����������Ҫ�Ŀռ�Ϊn���������ֵ��m +1
		 * ��Ҫ���������ֵ���η���Ͱ�±�Ϊ��ֵ��Ͱ��
		 * ����Ҫ���������ȫ�����ź������(m+1)��Ͱ��
		 * ����Ͱ�е�ֵ���±����һ�µ�
		 */
		if(args!=null&&args.length>1){
			for(int i=0;i<args.length;i++){
				bucket[args[i]]++;
			}
		}
		
		/**
		 * �������
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
		 * �����ԣ�
		 * Ͱ����ռ�õĿռ䲻��ȷ�������������ֵ��
		 * Ͱ����֧�ָ���
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
			System.out.println(m+" ��2����������");
		}else{
			System.out.println(m+" ����2����������");
		}
	}
	
}
