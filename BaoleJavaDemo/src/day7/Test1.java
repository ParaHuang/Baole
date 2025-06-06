package day7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map	->	key-value pair  键值对
//		{key1:value1,key2:value2,key3:value}
		//"name"->"Jack"
		//"age"->18
		Map<String, Object> map = new HashMap<>();	//no order
//		Map<String, Object> map = new TreeMap<>();	//no order
//		Map<String, Object> map = new LinkedHashMap<>();	//add order
		//add value
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", "male");
		map.put("age", 19);
		
		//get value
		String o1 = (String) map.get("name");
		System.out.println(o1);
		int o2 = (int) map.get("age");
		System.out.println(o2);
		
		System.out.println(map.size());
		System.out.println(map.containsKey("name"));
		
		System.out.println(map);
		
		Set<String> set = map.keySet();//获取所有对key，放在一个set中
		for(String key:set) {
			System.out.println(key+"--"+map.get(key));
		}
	}

}
