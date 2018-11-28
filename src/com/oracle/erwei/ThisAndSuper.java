package com.oracle.erwei;

public class ThisAndSuper {
	public static void main(String[] args) {
		//Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		System.out.println(p2.name);
	}
}
class Person1{
	private String name;
	public int age;
	
	public Person1(String name){
		// this 第一种用法
		this.name = name;
	}
	
	public Person1(){
		// 调用当前类里的其他构造方法
		// this.name="张三";
		this("张三");
	}

	public int getAge() {
		System.out.println("我被调用了");
		return age;
	}
	public void setAge(int age) {this.age = age;}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
}
class Person2 extends Person1{
	String name;
	public Person2(){
		 //super()代表找到父类中的构造器
		// super()调用父类构造器的写法 只能写在子类构造器的第一行
		super("lisi");
		// super.代表调用父类中的某个方法
		///getAge();
	}
}