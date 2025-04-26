package day2;

//OOP：object oriented programming
//Encapsulation:封装，私有属性,公开方法
//Inheritance:继承
//Polymorphism:多态
public class Human {
	//name,age,gender,nationality
	//instance variable
	private String name;				//global variable
	private int age;
	private String gender;
	private String nationality;
	//static final double PI = 3.1415926;//constant
//	public void x() {
//		//pi = 50;
//	}
	
	//constructor
	//1.与类同名
	//2.initialized过程其实就是调用constructor
	//3.在这里为变量赋值
//	public Human(String name,int age) {//local variable
//		System.out.println("constructor");
//		this.name = name;
//		this.age = age;
//	}

	public Human(String name, int age, String gender, String nationality) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
	}
	/*
	 public 返回值类型  方法名(参数列表){
	 	方法体
	 }
	 返回值类型:void / 具体的数据类型
	 */
	//setter and getter
	public void setAge(int age) {
		if(age<0 || age>100) {
			//报错
			throw new RuntimeException();
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}	

//>14    record








