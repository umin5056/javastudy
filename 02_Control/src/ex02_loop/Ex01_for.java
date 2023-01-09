package ex02_loop;

public class Ex01_for {
	
	/*
	   for문
	   1. 연속된 숫자를 생성하는 반복문 (배열에서 주로 사용)
	   2. 형식
	      for(초기문; 조건문; 증감문) {
	         실행문
	     }    
	   3. 실행 순서 : 초기문 - 조건문 - 실행문 - 증감문
	      이후 반복 : 조건문 - 실행문 - 증감문 - 조건  
	     
	 */

	public static void ex01() {
		
		// 1 ~ 10
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		
	}
	
	public static void ex02() {
		
		// 횟수

		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
	}
	
	public static void ex03() {
		
		for(int a = 10; a > 0; a--) {
			System.out.println(a);
		}
	}
	
	public static void ex04() {
		
		int dan = 2;
		
		for(int a = 2; a < 10; a++) {
				System.out.println(a + " x " + dan + " = " + (a*dan));
		}
		
	}
	
	
	public static void main(String[] args) {

		ex04();
		
	}

}
