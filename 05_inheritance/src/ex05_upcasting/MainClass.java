package ex05_upcasting;

/*
   업캐스팅 (UpCasting)
   1. 자식 클래스 객체를 부모 클래스 타입으로 저장할 수 있다.
   2. 강제로 캐스팅하지 않아도 자동으로 처리된다.
   
   업캐스팅의 장점
   1. 하나의 클래스로 여러개의 객체를 저장할 수 있다.
   2. 부모 타입으로 모든 자식 객체를 저장할 수 있다.	
   
   업캐스팅의 단점
   1. 부모 타입으로 저장되기 때문에 부모 클래스의 메소드만 호출 가능.
      해결법 : 자식 클래스의 메소드를 부모 클래스에 실행문없이 추가한다.
 */

public class MainClass {

	public static void main(String[] args) {
		
		// 부모 객체 선언
		Person person;
		
		// 자식 객체 생성
		person = new Student();
		
		// 메소드
		person.eat();
		person.sleep();
		person.study();
		person.study();
	
		/* 
		   person.study() 동작 경로
		   1. Person person 이므로 Person의 study()를 호출
		   2. study 메소드를 실행하기 위해서 person 객체를 확인
		   3. person = new Student() 이므로 student 클래스의 study 메소드를 가져온다.
		 */
	}
}
