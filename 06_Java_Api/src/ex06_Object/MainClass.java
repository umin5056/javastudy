package ex06_Object;

public class MainClass {
	
	/*
		   java.lang.Object 클래스
		   1. 모든 클래스의 최상위 슈퍼 클래스 (최고 조상)
		   2. 별도의 슈퍼 클래스를 명시하지 않는 경우 Object 클래스 슈퍼 클래스이다.
		   3. 모든 것을 저장할 수 있는 만능 타입
		   4. Object 타입으로 저장된 객체는 Object 클래스의 메소드만 호출할 수 있으므로
		      다시 원래 객체 타입으로 캐스팅해서 사용해야 한다.
		
		   Object 클래스의 주요 메소드
		   1. equals   - 동등 비교할 때 사용하는 메소드
		   			   - 동등 비교하는 참조값을 비교
		   			   - 객체의 값으로 동등 비교를 수행하기 위해서는 오버라이드해야 한다.
		   			   
		   2. toString - 문자열로 변환할 때 사용하는 메소드   
		   			   - 객체이름 + @ + 참조값 형식으로 변환
		   			   - 원하는 형식으로 변경하려면 오버라이드해야 한다.
	 */

	public static void ex01() {
		
		Object person = new Person(); // Object는 모든 객체를 저장할 수 있다.
		
		
		if(person instanceof Person) {
			((Person) person).eat();	// Object객체는 항상 캐스팅해야 한다.
			((Person) person).sleep();
		}
		
	}
	
	public static void ex02() {
		
		// name이 같으면 같은 Person으로 처리하기로 한 시스템
		
		Person person1 = new Person("조우민");
		Person person2 = new Person("조우민");
		
		if(person1.equals(person2)) {
			System.out.println("같은 사람입니다.");
		} else  {
			System.out.println("다른 사람입니다.");
		}

		String str = new String("12");
		String str2 = new String("12");
		
		System.out.println(str.equals(str2)); // 값 비교
		System.out.println(str == str2);	// 참조 	비교
		// String의 equals는 값을 비교하고 Object의 equals는 참조 비교? (String에서 equals는 다른 값으로 오버라이드 된 것인가?
		
	}
	
	public static void ex03() {
		
		Person p = new Person("whdnals");
		
		System.out.println(p.toString()); 

		System.out.println(p); // toString 메소드는 호출을 생략함.
		
		
	}
	
	public static void main(String[] args) {
		
		ex02();
		
	}

}
