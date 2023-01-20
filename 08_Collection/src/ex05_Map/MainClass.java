package ex05_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	/*
		    HashMap
		    1. 하나의 데이터가 2개의 요소로 구성된다.
		    2. 용어 정리
		       1) Entry : 맵에 저장된 하나의 데이터 
		       2) Key	: Entry의 구성 요소, 식별자 역할을 수행 (배열의 인덱스와 같은 역할)
		       3) Value	: Entry의 구성 요소, 실제 데이터 (배열의 요소와 같은 역할)
		    3. 주로 Key는 String을 사용한다. (변수 이름)
		    4. 주로 Value는 Object를 사용한다. (변수에 저장된 값)
			5. Key는 중복이 불가능하고, Value는 중복이 가능하다.
	 */

	public static void ex01() {

		// Person 정보를 HashMap으로 만들기

		Map<String, Object> person = new HashMap<>();

		// 추가
		// put(Key, Value)
		person.put("name", "조우민");
		person.put("age", 26);

		// 수정
		// put(Key, Value)
		person.put("age", 40); // 기존 Key와 동일한 Key값을 전달하면 해당 Key의 Value가 수정된다.

		// 삭제
		// remove(Key) : Map에서 Value를 삭제하고 그 값을 반환한다.
		// int age1 = person.remove("age"); // Object 타입이라 int에 넣을 수 없다.
		int age = (int)(person.remove("age")); // int로 형변환을 하면 int에 넣기가 가능해진다. (다운캐스팅은 수동이기 때문) 
		//		System.out.println("removed age : " +age);

		// 확인
		//		System.out.println(person);

	}

	public static void ex02() {

		Map<String,String> dictionary = new HashMap<>();

		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");

		// Value 가져오기
		// get(Key) : Key에 해당하는 Value를 반환
		String season = dictionary.get("winter");
		System.out.println(season);



	}

	public static void ex03() {

		Map<String,String> dictionary = new HashMap<>();

		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");

		// 1. Key만 모두 가져온 뒤, 해당 Key값을 가진 Value를 가져오
		Set<String> keySet = dictionary.keySet();
		for(String key : keySet) {
			System.out.print(key + " : " + dictionary.get(key) + "\n");
		}

		// 2. Entry를 모두 가져온 뒤, Key와 Value로 분리하기
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public static void ex04() {

		// 제목(title), 저자(author), 가격(price)으로 구성되는 책(book) : HashMap

		Map<String, Object> book1 = new HashMap<String, Object>();

		book1.put("title", "어린왕자");
		book1.put("author", "생텍쥐베리");
		book1.put("price", 10000);

		Map<String, Object> book2 = new HashMap<String, Object>();

		book2.put("title", "흥부놀부");
		book2.put("author", "흥부");
		book2.put("price", 12000);

		Map<String, Object> book3 = new HashMap<String, Object>();

		book3.put("title", "놀부일대기");
		book3.put("author", "놀부");
		book3.put("price", 8000);

		// 책(book) 3권이 저장된 ArrayList

		List<Map<String, Object>> list = new ArrayList<>();

		list.add(book1);
		list.add(book2);
		list.add(book3);

		// for문 순회
//		for(Map<String, Object> map : list) {
//			for(Entry<String, Object> entry : map.entrySet()) {
//				System.out.println(entry);
//			}
//		}

		// List 순회
		for(int i=0, length = list.size(); i<length; i++ ) {				
			// Map 순회
			Map<String, Object> book = list.get(i);
			System.out.println((i+1) + "번째 책의 정보");
			for(Entry<String, Object> entry : book.entrySet()) {
				System.out.println((entry.getKey() + " : " + entry.getValue()));
			}
			System.out.println();

		}

	}


	public static void main(String[] args) {

		ex04();

	}

}
