package ex08_interface;

/*
   인터페이스
   1. 추상 클래스의 한 형태
   2. jdk1.8 이후에는 본문이 있는 메소드는 default, static을 붙여 추가할 수 있다.
   3. 인터페이스는 주로 final 상수, 추상 메소드를 가진다.
   4. 인터페이스의 추상 메소드는 public, abstract를 모두 생략 가능
 */

public interface Person {
	
	// default method (본문이 있는 메소드)
	public default void eat() {
		System.out.println("먹는다.");
	}
	public default void sleep() {
		System.out.println("잔다.");
	}
	
	
	// abstract method (본문이 없는 메소드)
	public void study();

}
