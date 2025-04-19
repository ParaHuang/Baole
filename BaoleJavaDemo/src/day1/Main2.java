package day1;

public class Main2 {
	
	public static void main(String[] args) {
		// ctrl + / 注释
		// ctrl+shift+F 整理格式
		// 数组
		// 定义
		// 数据类型[] 数组名 = {值1,值2,值3,值2};
//		int x = 10;
		int[] arr = { 11, 55, 77, 33, 99, 22 };
		// 操作 数组名[index] index:0~lenght-1
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		//i++,++i		i+=1			i = i+1
		//i--,--i		i-=1 			i = i-1    
		
//							attribute
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.println(i+"--"+arr[i]);
		}
		/*
		//python   for-in
		 for e in list/string:
		 	通过e操作list或string的每一个元素/字符
		 
		 
		 //java     for-each
		 for(数据类型  变量名:list或数组){
		 	通过变量名操作list或数组的每一个元素
		 }  
		  
		*/

		for(int e:arr) {
			System.out.println(e);
		}
		
	}

}













