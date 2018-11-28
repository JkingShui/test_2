package com.oracle.text;
/**找出两个已知数组中相同的值。int as = {2,3,5};int bs = {5,6,7};*/
public class 相同值 {
	public static void main(String[] args) {
		int[] as = {2,3,5};
		int[] bs = {5,6,7};
		for(int i=0,j=as.length;i<j;i++){
			for(int m=0,n=bs.length;m<n;m++){
				if(as[i] == bs[m]){
					System.out.println(as[i]);
				}
			}
		}
	}
}
