package ex02_List;

import java.util.*;

public class MainClass {
	
	public static void ex01() {
		
		// 배열 리스트 선언 및 생성
		List<String> list = new ArrayList<>();
		
		// 추가
		list.add("summer"); // 인덱스를 지정 안하면 항상 마지막에 추가된다.
		list.add("autunm");
		list.add("frog");
		list.add("frog");
		list.add("winter");
		list.add(0, "spring"); // 인덱스 0에 추가된다.
		
		// 수정
		list.set(2, "fall");
		
		// 삭제
		list.remove("frog"); // 삭제할 요소를 전달.
		list.remove(3); // 삭제할 요소의 인덱스를 전달.
		
		System.out.println(list);
	}
	
	
	

	public static void main(String[] args) {
		
		ex01();
		
	}

}
