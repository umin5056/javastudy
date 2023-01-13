package ex04_override;

/*
  	메소드 오버라이드
  	1. method Override
  	2. 부모 클래스의 메소드를 자식 클래스의 메소드로 만드는 것
  	3. 부모 클래스의 메소드를 사용할 수 없기 때문에, 새로운 메소드를 다시 만드는 것
  	4. 자식 클래스가 메소드를 다시 만들 때는 애너테이션 @Override를 추가한다.
  	   (@Override : 오버라이드가 아닐 경우를 잡아준다 ex.오타 등)
  	   
  	   
  	오버로딩과 오버라이딩의 차이
  	- 오버로딩 : 하나의 클래스에서 같은 이름의 메소드가 여러개
  	- 오버라이딩 : 상속 관계인 클래스에서 같은 이름의 메소드가 여러개   
 */

public class Americano extends Espresso	{

	@Override
	public void taste() {
		System.out.println("기가 막히다.");
	}
	
	
}
