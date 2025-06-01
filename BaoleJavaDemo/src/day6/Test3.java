package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		//引用转型
		//1.引用的类型会决定你能用什么方法
		//2.对象的类型会决定你到底怎么用
//		List<Integer> list = new ArrayList<Integer>();
		//人类   小明 = new  Chinese();
		
		List<Integer> list = Arrays.asList(12,55,77,99,22);
		//Arrays:工具->array  Integer[],String[]
		//工具->Collection
		Collections.sort(list);
		System.out.println(list);
		
		
		//LinkedList   
		//nodes
		
		//HashSet
		//HashMap
	}

}
