package day6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();
		//值类型
		set.add(new Student("hello"));
		set.add(new Student("hey"));
		set.add(new Student("what"));
		set.add(new Student("hi"));
		set.add(new Student("hello"));
		set.add(new Student("hey"));
		
		System.out.println(set);
		System.out.println(set.size());
		
		Student stu = new Student("Jack");
		stu.equals(stu);
		stu.equals(null);
		stu.equals(12);
	}

}

class Student{
	private String name;

	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	//equals  hashcode
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	
}

