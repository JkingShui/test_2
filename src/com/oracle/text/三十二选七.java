package com.oracle.text;
/**设计程序，要求可以从1到32随机生成不重复的7个数*/
public class 三十二选七 {
	public static void main(String[] args) {
		int[] arrs = new int[32];
		for(int i=0,j=arrs.length;i<j;i++){
			arrs[i] = i+1;
		}
		//System.out.println(Arrays.toString(arrs));
		int temp = 0 ; 
		for(int i = 0 ; i<10000;i++){
			int jb1 = (int)(Math.random()*32);
			int jb2 = (int)(Math.random()*32); 
			temp = arrs[jb1];
			arrs[jb1] = arrs[jb2];
			arrs[jb2] = temp;
		}
		for(int i = 0 ; i<7 ; i++){
			System.out.print(arrs[i]+" ");
		}
	}
}
