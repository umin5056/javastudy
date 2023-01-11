package ex04_method_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		// Calculator 객체 선언 
		Calculator calc;
		
		// Calculator 객체 생성
		calc = new Calculator();
		
		// addition 호출
		double result = calc.addition(1.6, 2.7);
		System.out.println(result);

		// addition(double[] numbers) 호출
		double[] arr = {1.1, 2.2, 3.3};
		double result2 = calc.addition(arr);
		System.out.println(result2);
		
	
	}

}
