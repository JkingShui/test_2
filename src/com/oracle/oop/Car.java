package com.oracle.oop;

public class Car {
	// 属性
	private String carPinPai = "大众";
	int carAge = 10;
	
	// void 是代表返回值为void (没有返回值)
	// 所有的属性命名都是静态的
	// 所有的方法命名都是动态的
	public void canRun(){
		System.out.println("i can run");
	}
	public void canPiaoYi(){
		System.out.println("i can piaoYi");
	}
	
	
	
	// get/set
	// shift alt s ----r
	
	//
	public String getCarPinPai(){
		return carPinPai;
	}
	public int getCarAge() {
		return carAge;
	}
	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}
	public void setCarPinPai(String carPinPai) {
		this.carPinPai = carPinPai;
	}
}
