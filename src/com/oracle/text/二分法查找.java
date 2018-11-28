package com.oracle.text;
import java.util.Arrays;
public class 二分法查找 {
	public static void main(String[] args) {
		int target = 888;
		int[] arrs = {1,2,34,1,45,8,6,18,88,188,7,71,187,17,55};
		/*for(int i=0,j=arrs.length;i<j;i++){
			if(arrs[i] == target){
				System.out.println(i);
				break;
			}
		}*/
		Arrays.sort(arrs);// 对数组进行排序
		//System.out.println(Arrays.toString(arrs));
		int r = Arrays.binarySearch(arrs, 8888);
		System.out.println(r);
		
		
		/*int lowIndex = 0;
		int highIndex = arrs.length - 1;
		int middleIndex = (lowIndex + highIndex)/2;
		while(lowIndex <= highIndex){
			if(target > arrs[middleIndex]){
				lowIndex = middleIndex + 1;
			}else if(target < arrs[middleIndex]){
				highIndex = middleIndex - 1;
			}else{
				System.out.println(middleIndex);
				break;
			}
			middleIndex = (lowIndex + highIndex)/2;
		}*/
		//
	}
}
