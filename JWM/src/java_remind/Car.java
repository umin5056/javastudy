package java_remind;

public class Car {

	public static void main(String[] args) {

		Parents p = new Parents();
		Child c = new Child();
		
		p.Parent(); // 부모 클래스의 메소드
		
		c.callSuper(); // 자식이 부모의 이름을 호출 (super를 이용)
		
		c.Parent(); // 부모 메소드를 오버라이드해서 변경함
		
	}
}







class Parents {
	// 필드
	protected String name = "부모의 이름";

	public void Parent() {
		System.out.println("부모메소드");
	}

}

class Child extends Parents {
	
	public void callSuper() {
		System.out.println(super.name);
	}

	@Override
	public void Parent() {
		System.out.println("부모메소드를 오버라이드");
	}
	

}
