package day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test4 {
	public static void main(String[] args) {
							//Immutable List
		List<String> list = Arrays.asList("Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia", "Sonia", "Tomas", "Tyler", "Chris");
		
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.shuffle(list);
//		
//		for(int i=0 ; i<5 ; i++) {
//			System.out.println(list.get(i));
//		}
		Set<String> set = new HashSet<>();
		Random random = new Random();
		while(set.size()<5) {
			int index = random.nextInt(list.size());
			System.out.println(index);
			set.add(list.get(index));
		}
		System.out.println(set);
	}
}

//list,set,dict,tuple
