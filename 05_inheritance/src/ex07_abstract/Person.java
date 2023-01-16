package ex07_abstract;

/*
   추상메소드(abstract method)
   1. 본문이 없는 메소드
   2. 중괄호를 없애고, 세미콜론을 붙인 후, abstract를 메소드 앞에 붙인다.
  
  
   추상클래스(abstract class)
   1. 추상 메소드를 1개 이상 가진 클래스
   2. abstract를 클래스 앞에 추가한다.
   3. 추상 클래스를 상속받는 클래스는 "반드시 모든 추상 메소드"를 오버라이드 해야 한다.
   4. 추상 클래스는 객체 생성이 불가능한다. (new Person();이 불가능)
      : 본문이 없는 메소드를 가지고 있기 때문에)
 */

public abstract class Person {
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
	public abstract void study(); // 추상메소드(실행문이 없는 메소드)

}
