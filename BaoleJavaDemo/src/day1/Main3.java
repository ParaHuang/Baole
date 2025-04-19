package day1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main3 {

	public static void main(String[] args) {
		//Random random = new Random();
//		random.nextInt(6);//0~5
		//random.nextInt(1, 11);//1~11
		
		int[] arr = { 11, 55, 77, 33, 99, 22 };
		//{ 66, 55, 77, 33, 99, 22 };
		//  55  66  33  77  22  99
		//
		int max = arr[0];
		for(int i = 1 ; i<arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		//spring
		//boot
		//security
		
		//3大js
		//vue js   , nodejs, reactjs
		
		//merge sort
		//bubble sort
		//select sort
		
		/*
		List<Integer> list = List.of(11, 22, 66, 88, 44, 99);
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		list.forEach(System.out::println);
		*/
	}

}
