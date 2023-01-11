package ex05_ellipsis;

public class Calculator {

	/*
	  매개변수 생략
	  1. 전달되는 인수의 개수가 정해지지 않았을 때 사용
	  2. 말 줄임표(...)를 활용
	  3. 실제로 배열로 처리된다.
	 */

	double addition(double... numbers) {
		
		double total = 0.0;
		for(double d : numbers) {
			total += d;
		}
		return total;
		
	}
	
}
