package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

	public static void main(String[] args) {

		/*
		   java.util.UUID
		   1. 전역 고유 식별자(Universal Unique IDentifier)
		   2. 32개의 16진수와 4개의 하이픈(-)으로 구성된 식별 값
		 */
		
		 
		 
			UUID uuid = UUID.randomUUID();
		 
			String str = uuid.toString();
			
			String result = str.replace("-", "");
			
			System.out.println(result);
	}

}
