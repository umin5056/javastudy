package ex04_op_number;

public class MainClass {

	// ex01 메소드 정의
	public static void ex01() {

		int a = 5;
		int b = 2;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b; // 몫
		int mod = a % b; // 나머지
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
	}
	
	// ex02 메소드 정의
	public static void ex02() {
		
		int a = 5;
		int b = 2;
		double div = (double)a/b;
		
		System.out.println(div);
		
	}
	
	// ex03 메소드 정의
	public static void ex03() {
		
		int second = 90;
		int min = second / 60;
		int sec = second % 60;

		System.out.println(min);		
		System.out.println(sec);		
	}
	
	// ex04 메소드 정의
	public static void ex04() {

		// 1 증가 : ++
		// 1 감소 : --
	
		// 전위 연산(pre operator)
		// ++i & --i
		// 변수 i의 값을 1 증가 또는 감소시킨 후에 사용.
		
		int a = 10;
		System.out.println(++a);
		
		// 후위 연산(post operator)
		// i++ & i--
		// 변수 i의 값을 사용한 뒤에 1 증가 또는 감소.
		
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
	}
	
	// ex05 메소드 정의
	public static void ex05() {
		// 대입 연산
		// 등호(=)의 오른쪽 값을 왼쪽으로 보내는 연산
		
		int a;
		
		a = 10;
		System.out.println(a);
		
	}
	
	// ex06 메소드 정의	
	public static void ex06() {
		
		int x = 10;
		int y = 20;
		
		int z;
		
		z = x;
		x = y;
		y = z;
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	// ex07 메소드 정의
	public static void ex07() {
		
		int account = 10000;
		
			account += 5000;
			
			System.out.println(account);
			
			account -= 50000;
			
			System.out.println(account);
		
	}
	
	// ex08 메소드 정의(연습)
	public static void ex08() {
		
		long account = 123456;
		
		// 5% 이자 받으면?
		double after = account*1.05;
		
		System.out.println(after);
		
	}
	
	public static void main(String[] args) {

		ex08(); 

	}

}
