package ex02_random;

import java.util.Random;

public class Ex02_Random {
	
	/*
	   import
	   1. 어떤 패키지에 속한 클래스인지 명시하는 코드	
	   2. java.util.Random 클래스의 경우 import java.util.Random; 방식으로 사용
	   3. java.util.*; 방식으로 java.util 패키지의 모든 클래스를 import
	   4. import를 생략할 수 있는 경우
	   	   1) java.lang 패키지인 경우
	   	   2) 동일한 패키지에 속한 클래스
	   5. import 방식 : 클래스를 입력할 때 "항상" 자동 완성을 이용한다.	   
	   
	 */

	/*
	   java.lang.Random
	   1. 시드(seed)를 이용해서 난수를 생성한다.
	   2. 기본적으로 현재 시간(0.001초 단위)을 시드(seed)로 사용한다. 
	   3. 동일한 시드(seed)를 사용하면 동일한 난수가 발생한다.
	   
	 */
	
	public static void ex01() {
			
		Random r = new Random();
		
		// 실수 난수 
		
		double randNumber1 = r.nextDouble();
			System.out.println(randNumber1);
		
		// 정수 난수
		int randNumber2 = r.nextInt(); // int 범위 내의 난수 발생
		System.out.println(randNumber2);
		
		int randNumber3 = r.nextInt(4); // 10개 (0 ~ 9) 난수 발생
		System.out.println(randNumber3);
		
	}

	public static void main(String[] args) {
		
		ex01();

		
		
	}

}
