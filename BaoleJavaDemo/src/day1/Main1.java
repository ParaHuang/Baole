package day1;

public class Main1 {

	public static void main(String[] args) {
		//条件语句
		/*
		//python
		if 条件1:
			操作A
		elif 条件2:
			操作B
		elif 条件3:
			操作C
		else:
			操作D
			
			
		//java
		if(条件1){
			操作A
		}else if(条件2){
			操作B
		}else if(条件3){
			操作C
		}else{
			操作D
		}
		*/
		//循环语句
		/*
		 //while
		 //python
		 while 条件：
		 	操作
		 	
		java 
		 while(条件){
		 	操作
		 }
		 
		 //for-i，序号
		 python:
		 for i in range(起点,终点,增量):
		 	操作
		 	
		 java：
		 for(起始值 ; 条件 ; 增量 ){
		 	操作
		 }
		 
		 //python   for-in
		 for e in list/string:
		 	通过e操作list或string的每一个元素/字符
		 
		 
		 //java     for-each
		 */
		
		/*
		python:   match...case...
		match 表达式:
			case 值1:
				操作A
			case 值2:
				操作B
			case 值3:
				操作C
			case _:
				操作D
		
		java：    switch...case...
		switch(表达式){
			case 值1:
				操作A
				break;
			case 值2:
				操作B
				break;
			case 值3:
				操作C
				break;
			default:
				操作D
		}
		*/
		
		//0～5    for i in range(0,5,1): 
		/*
		for(int i=0 ; i<5 ; i++) {
			System.out.println(i);
		}
		
		int user = 2;//2^32
	    if(user == 1) {
	        System.out.println("石头");
	    }else if(user == 2) {
	    	System.out.println("剪刀");
	    }else {
	    	System.out.println("布");
	    }
		*/
		
		int poker = 8;
		//1->一张红桃A
		//2->一张红桃2
		//3->一张红桃3
		//4->一张红桃4
		//....
		//9->一张红桃9
		//10->一张红桃10
		//11->一张红桃J
		//12->一张红桃Q
		//13->一张红桃K
		//其他->无效排面
		switch(poker) {
		case 1:
			System.out.println("一张红桃A");
			break;
		case 2,3,4,5,6,7,8,9,10:
			System.out.println("一张红桃"+poker);
		case 11:
			System.out.println("一张红桃J");
			break;		//防止穿透
		case 12:
			System.out.println("一张红桃Q");
			break;
		case 13:
			System.out.println("一张红桃K");
			break;
		default:
			System.out.println("无效牌面");
		}
		//jdk:java development kit
		
		
	}

}
