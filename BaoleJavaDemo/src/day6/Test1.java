package day6;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		//Collection
		//generic
		ArrayList<Integer> list = new ArrayList<>();
		//append  排队
		list.add(12);
		list.add(33);
		list.add(66);
		list.add(11);
		
		
//		if(!list.contains(66)) {
//			list.add(66);
//		}
		//insert   插队
		list.add(2, 88);//方法重载  overload
		
		//get element by index
//		int x = list.get(2);   
//		Integer y = x;
//		int z = y;
		//for...i
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
		//for-each, enhanced for loop
//		for(类型 变量:list/array/set) {
//			
//		}
		for(int x:list) {
			System.out.println(x);
		}
		
		//remove
		int y = list.remove(0);	//按位置移除
		System.out.println("被移除的是："+y);
		
		
		int z = (int) 3.14;//强转
		
		boolean f = list.remove((Integer)66);
		System.out.println(f);
		
		//获取指定数据第一次出现的位置
		int index = list.indexOf(333);
		System.out.println("第一次位置："+index);
		
		//8大基础数据类型（primitive type）：short  int  long       float  double    boolean    char    byte
		//引用数据类型（reference type）：String，ArrayList，Bird
		
		//Wrapper Class				primitive type
		//Integer			<->		int
		//Double			<->		double
		//Float				<->		float
		//Character			<->		char
		
		
		char c = 'u';			//字符
		String str = "sldjfsldkjfslkdfj索朗多吉弗雷斯科的";//字符串
		//byte   字节
		byte b = 127;		//文件操作，流		
		
		System.out.println(list);
		
	}

}
