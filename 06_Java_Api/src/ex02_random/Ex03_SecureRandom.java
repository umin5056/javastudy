package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	public static void main(String[] args) {

		// java.seruity.SecureRandom
		
		SecureRandom sr = new SecureRandom();
		
		// 정수 난수
		for(int i=0; i< 10; i++) {
			
			int dice = sr.nextInt(6) + 1; // 1~6 사이의 범위
			
			System.out.println(dice);
			
		}
		
		
	}

}
