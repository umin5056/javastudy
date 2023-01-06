package ex02_casting;

public class Ex01_promotion {

	public static void main(String[] args) {

		/*
		  자동 변환
		  1. 작은 크기 -> 큰 크기
		  2. 정수 -> 실
		 */

		long money = 10000; // 4바이트를 사용한 10000이 8바이트로 프로모션
		System.out.println(money);
		
		double score = 90; // 정수 90을 실수 90.0으로 프로모션
		System.out.println(score);
		
		
		
	}

}
