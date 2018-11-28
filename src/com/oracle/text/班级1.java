package com.oracle.text;
import java.util.Scanner;

/**输入班级人数，记录每个人的名字和每个人的分数，
 * 要求最终显示结果为： XX分数是XXX，且本次考试XX考的最好，为XXX分。*/
public class 班级1 {
	public static void main(String[] args) {
		// ctrl shift o
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的班级人数");
		int num = scanner.nextInt();
		String[] names = new String[num];
		int[] scores = new int[num];
		// 循环录入班级人数和分数
		for(int i = 0 ; i < num ; i++ ){
			System.out.println("请输入姓名");
			String name = scanner.next();
			// 把每次接到的姓名放到数组里
			names[i] = name;System.out.println("请输入分数");
			int score = scanner.nextInt();
			// 把每次接到的姓名放到数组里
			scores[i] = score;
		}
		// 负责打印成绩单
		for(int i=0;i<num;i++){
			System.out.println(names[i]+"的分数是" + scores[i]);
		}
		// 最大值
		int first = scores[0];
		for(int i = 0 ; i < num ; i++){
			if(first < scores[i]){
				first = scores[i];
			}
		}
		// 通过分数的最高分 查到哪个同学是这个分数
		int post = -1;
		for(int i=0;i<num;i++){
			if(scores[i] == first){
				post = i;
			}
		}
		System.out.println(names[post] + "的分数最高是" + first + "分");
		scanner.close();
		
		
	}
}
