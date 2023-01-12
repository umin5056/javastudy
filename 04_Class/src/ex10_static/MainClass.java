package ex10_static;

public class MainClass {

	public static void main(String[] args) {

		MyMath myMath = new MyMath();
		
		MyMath yourMath = new MyMath();
		
		// static 요소는 객체로 호출할 수 있느나, 권장하지 않는다.
		
		System.out.println(myMath.PI);
		System.out.println(yourMath.PI);
		
		//static 요소는 클래스를 이용해서 호출하는 것이 권장이다..
		System.out.println(MyMath.PI);
		System.out.println(MyMath.MAX(1.1, 2.2, 3.3));
		System.out.println(MyMath.MIN(1.1, 2.2, 3.3, 4.4, 5.5));
		System.out.println(MyMath.getCircleArea(2));
		
		
		
		
	}

}
