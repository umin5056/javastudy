package ex05_wrapper;

public class MainClass {

	public static void main(String[] args) {

		/*
		   wrapper class 
		   1. 기본 자료형(Primitive Type)을 참조 자료형(Reference Type)으로 만들어 놓은 클래스.
		   2. 주요 종류 
		      byte		Byte
		      int		Integer
		      long		Long
		      double	Double
		   	  boolean	Boolean
		   	  char		Character
		   3. 용어
		   	  1) Auto Boxing : 기본 자료형 -> 참조 자료형
		   	  2) Auto UnBoxing : 참조 자료형 -> 기본 자료형
		   4. 참조자료형을 요구하는 제네릭에서 주로 사용한다.
		 */
		
		Integer a = 10; // Auto Boxing
		Integer b = 10; // Auto Boxing
		
		int sum = a + b; // Auto UnBoxing
		
		
	}

}
