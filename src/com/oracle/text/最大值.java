package com.oracle.text;

import java.util.Arrays;

/**从数组{1，34，78，23，16，98，28，50，52}中得到最大值；*/
public class 最大值 {
	public static void main(String[] args) {
		int[] arrs = {1,34,78,23,16,98,28,50,52};
		Arrays.sort(arrs);
		System.out.println(arrs[arrs.length-1]);
	}
}
