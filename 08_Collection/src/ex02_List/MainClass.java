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
		list.set(2, "fall"); // 인덱스 2의 요소를 fall로 수정함.

		// 삭제
		list.remove("frog"); // 삭제할 요소를 전달.
		list.remove(3); // 삭제할 요소의 인덱스를 전달.

		System.out.println(list);
	}

	public static void ex02() {

		// ArrayList 초기화
		List<Integer> list = Arrays.asList(1,2,3,4,5);

		// 리스트 길이
		System.out.println(list.size());

		// 개별 요소 확인
		System.out.println("첫번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(list.size()-1));

		// 리스트 순회
		// 모든 요소의 합계 구하기
		int total =0;
		for(int i : list) {
			total += i;
		}
		System.out.println("합계 : " + total);
	}

	public static void ex03() {

		List<User> userList = new ArrayList<>();

		for(int i=0; i < 3; i++) {

			User user = new User("user","123456");
			userList.add(user);

			System.out.println(userList.get(i));
		}

		// 아이디만 출력하기
		for(int i=0, length = userList.size(); i < length; i++) {
			System.out.println(userList.get(i).getId());
		}
	}


	public static void main(String[] args) {

		ex03();

	}

}
