package com.oracle.oop;

public class Text {
	public static void main(String[] args) {
		// Car 是类型
		// car1 是实例
		// new 关键字
		// Car() 是模版的构造方法
		// 类和实例的关系
		// 实例是通过抽象封装得到类
		// 类通过实例化得到实例
		Car car1 = new Car();
		
		// 获取
		int age = car1.carAge;
		System.out.println(age);
		
		// 设置
		car1.carAge = 20;
		System.out.println(car1.carAge);
		
		car1.canRun();
		car1.canPiaoYi();
		
		String pinpai = car1.getCarPinPai();
		System.out.println(pinpai);
	}
}
