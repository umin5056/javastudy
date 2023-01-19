package ex02_finally;

import java.util.Scanner;

public class MainClass {
	
	// finally : 항상 마지막에 실행되는 블록으로 생략 가능.

	public static void main(String[] args) {

		Scanner sc = null;
		
		try {
		sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >>>");
		int age = sc.nextInt();
		
		System.out.println(age >=20 ? "주류 구매 가능" : "주류 구매 불가능");
		} catch (Exception e){
			System.out.println("예외 발생");
		} finally {
			sc.close(); // finally는 주로 자원 반납할 때 주로 사용한다.
			
		}
		
	}

}
