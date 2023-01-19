package ex03_throw;

import java.util.Scanner;

public class MainClass {
	
	public static void ex01() {
		
		try {
			
			Integer.parseInt("하핳");
			int a = 4/0;
			System.out.println(a);
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName()); // 예외 클래스 이름 확인
			System.out.println(e.getMessage()); 		// 예외 메세지 내용 확인
		}
		
	}
	
	public static void ex02() {
		
		try {
			
			Integer.parseInt("ghghgh");
			
		} catch(Exception e) {
			
			e.printStackTrace(); // 예외를 추적하는 메소드 (개발 중에는 이것만 사용함)
		}
		
	}
	
	public static void ex03() {
		
		/*
		   throw 
		   1. 예외 객체를 생성하여 직접 던질 수 있다.
		   2. 개발자가 직접 예외를 처리할 때 사용한다.
		 */
		
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			if(age < 0 || age > 100) {
				throw new RuntimeException(age + "살은 불가능합니다.") ;
			}
				
			
			System.out.println(age >= 20 ? "구매 가능 " : "구매 불가능");
			
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
	
	
	public static void main(String[] args) {

		ex03();
		
	}

}
