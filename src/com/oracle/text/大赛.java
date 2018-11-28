package com.oracle.text;

import java.util.Scanner;

/**
 * 
 * 有一个程序大赛，三个班级各有四名同学，
 * 挨次利用Scanner录入，计算每个班级参赛学员的平均分*/
public class 大赛 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int[] scores = new int[4];
		// 班级的循环
		for(int i =0;i<3;i++){
			double sum = 0;
			for(int j = 0;j<4;j++){
				System.out.println("请输入第"+(i+1)+"个班级第"+(j+1)+"学生的分数");
				int score = scanner.nextInt();
				sum+=score;
				//scores[i] = score;
			}
			System.out.println("第"+(i+1)+"个班级的平均分是"+(sum/4));
		}
		scanner.close();
		
		
		
	}
}
