package ex02_random;

public class Ex01_Math_random {
	
	public static void ex01() {
		
		double randNum = Math.random(); // 범위 : 0.0 <= 난수 < 1.0 
		
		if(randNum < 0.1) {
			// 10% 확률 
			System.out.println("대박");
		}
		else {
			System.out.println("꽝");
		}
	}
	
	public static void ex02() {
		/*
		   난수 범위 지정하는 법
		   Math.random()				0.0 <= n < 1.0
		   Math.random() * 3			0.0 <= n < 3.0
		   (int)(Math.random() * 3)	  	  0 <= n < 3
		   (int)(Math.random() * 3) + 1	  1 <= n < 4
		 */

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++) {
			sb.append((int)(Math.random() * 10));
		}
		
		String code = sb.toString();
		
		System.out.println(code);
		
			}

	public static void main(String[] args) {
		// java.lang.Math 클래스
		
		ex02();
	}

}
