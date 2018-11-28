package com.oracle.erwei;

import java.util.Arrays;

public class ErWeiShuZu {
	public static void main(String[] args) {
		
		int[][] arrs1 = {{1,2,3},{55,77,44},{1,4}};
		int[][] arrs2 = new int[3][3];
		arrs2[0][0] = 1;
		arrs2[0][1] = 2;
		arrs2[2][1] = 4;
		System.out.println(arrs1);
		System.out.println(arrs2);
		System.out.println(Arrays.toString(arrs1));
		System.out.println(Arrays.toString(arrs2));
		System.out.println(Arrays.deepToString(arrs1));
		System.out.println(Arrays.deepToString(arrs2));
		
		for(int i= 0 ,j =arrs1.length;i<j;i++){
			for( int m = 0 , n=arrs1[i].length;m<n;m++){
				System.out.print(arrs1[i][m] + " ");
			}
		}

	}
}
