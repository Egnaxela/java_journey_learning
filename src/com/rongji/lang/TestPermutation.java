/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      ���и�  
 * @version:     1.0
 * Createdate:   2017��5��22�� ����7:06:07  
 *  
 */  

package com.rongji.lang;

public class TestPermutation {

	public static void recuresivePermutation(char array[],int start,int end){
		if(start==end){
			for(int i=0;i<=end;i++){
				System.out.print(array[i]);
			}
			System.out.println();
		}else{
			for(int j=start;j<=end;j++){
				swap(array,j,start);
				recuresivePermutation(array,start+1,end);
				swap(array,j,start);
				
			}
		}
	}
	
	
	public static void swap(char[] array,int left,int right){
		char temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}
	
	public static void main(String[] args) {
		String target="abcdefg";
		recuresivePermutation(target.toCharArray(), 0, target.length()-1);
	}
	
}
