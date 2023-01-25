package ex06_Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	
	/*
		   Iterator 인터페이스
		   1. 특정 Collection을 순회할 때 사용.
		   2. 주요 메소드
		      1) hasNext()	: 남아있는 요소가 있으면 true 반환
		      2) next()		: 요소를 하나 꺼냄.
	 */
	
	
	public static void ex01() {

		List<String> list = new ArrayList<>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator();
			
		while(itr.hasNext()) {

			System.out.println(itr.next());
			
		}
	}

	public static void ex02() {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(15);
		set.add(25);
		set.add(35);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			 
 	 		System.out.println(itr.next());
			
		}
		
	}
	
	public static void ex03() {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("name", "조우민");
		map.put("age", 27);
		map.put("isAlive", true);
		
		Set<String>	keySet = map.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String Key = itr.next();
			Object Value = map.get(Key);
			System.out.println(Key + "\t: "  + Value);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
