package ex03_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	/*
	   Set
	   1. 저장된 요소들의 인덱스가 없다. -> 저장 순서가 없다.
	   2. 요소가 중복되지 않는다.
	 */

	public static void ex01() {

		// HashSet 선언 및 생성
		Set<String> set = new HashSet<>();

		// 추가
		set.add("spring");
		set.add("spring");
		set.add("spring");
		set.add("summer");
		set.add("autunm");
		set.add("winter");

		// 제거
		set.remove("winter");


		// 확인
		System.out.println(set);


	}

	public static void ex02() {

		// HashSet 객체의 초기화 (list를 이용해서 초기화)
		Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));

		for(Integer i : set) {

			System.out.println(i);


		}


	}

	public static void ex03() {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));

		// 교집합
		set1.retainAll(set2); // set1에 set2와의 교집합만 저장된다. set1 = {3, 4, 5};

		System.out.println(set1);
		System.out.println(set2);

	}

	public static void ex04() {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));

		// 합집합
		set1.addAll(set2); // set1에 set2의 모든 값이 들어간다. (중복을 Set이라서 알아서 지워짐)

		System.out.println(set1);
		System.out.println(set2);

	}

	public static void ex05() {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));

		// 차집합
		set1.removeAll(set2); // set1에 set2에 없는 요소만 남는다.

		System.out.println(set1);
		System.out.println(set2);


	}

	public static void ex06() {
		
		Set<Integer> lotto = new HashSet<>();
		
		for(int i=0; i<6; i++ ) {
			
			lotto.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(lotto);
		
	}
	

	public static void main(String[] args) {
		ex02();
	}

}
