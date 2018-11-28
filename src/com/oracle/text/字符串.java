package com.oracle.text;

import java.util.Scanner;

/**
 * 利用Scanner输入一个数字串，得到这个数字串中最大值和最小值*/

public class 字符串 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个带逗号的数字串");
		String numStr = scanner.next();
		String[] nums = numStr.split(",");
		
		int first = Integer.valueOf(nums[0]);
		// 求最大值
		for(int i = 0 ,j = nums.length ; i<j ; i++){
			if(first < Integer.valueOf(nums[i])){
				first = Integer.valueOf(nums[i]);
			}
		}
		System.out.println("最大值是" + first);
		// 求最小值
		for(int i = 0 ,j = nums.length ; i<j ; i++){
			if(first > Integer.valueOf(nums[i])){
				first = Integer.valueOf(nums[i]);
			}
		}
		System.out.println("最小值是" + first);
		scanner.close();
	}
}
