package day3;

import java.util.Random;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(gcd(1071,462));

//		Human h1 = new Human(null, 0, null, null);
		Human h2 = new Human();
		System.out.println(h2);
		System.out.println();
		
		Adult a1 = new Adult();
		System.out.println(a1);
		System.out.println();
		
		Employee e1 = new Employee();
		System.out.println(e1);
		System.out.println();
		
		Random random = new Random();
//		int x = random.nextInt();
//		int x = random.nextInt(5);		//0~bound-1
		int x = random.nextInt(1,5);	//origin ~ bound-1
	
		System.out.println(x);
	}
	
	public static int gcd(int n,int m) {
		int r0 = n%m;
		if(r0 == 0) {	//退出条件
			return m;
		}
		return gcd(m,r0);
	}
	
}



