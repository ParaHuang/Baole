package day3;


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
	
	//constructor:it's special method
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
	
	//overload:方法同名不同参(参数数量不同，类型不同,顺序不同)
	public Human() {
		
	}
	public Human(int age,String name) {
		
	}
	public Human(String name,int age) {
		
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

	public Human(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//subclass rewrite the method from superclass
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + ", nationality=" + nationality + "]";
	}
	
}	

//>14    record

class Adult extends Human{
	@Override
	public String toString() {
		
		return super.toString()+" this is an adult";
	}
}
class Employee extends Adult{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" this is an Employee";
	}
}







