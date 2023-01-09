package ex01_one_dim;

public class Ex02_reference {
	
	// 참조=주소(1바이트마다 부여된 고유의 16진수 값) - 변수의 위치를 나타내는 값
	
	// 16진수는 0~9, A~F를 이용한 표기법 (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,10...)
	
	// (16진수에서 10은 16이다) - (A가 10)
	
	// 10진수는 그냥 숫자만 적혀있고, 16진수는 앞에 0x가 붙은 다음 표기된다.
	
	public static void ex01() {
		
		int[] arr;
		
		arr = new int[5];

		System.out.println(arr); // 5개 배열 요소의 참조 값
	}

	public static void ex02() {
		
		int[] a = new int[5];
		int[] b;

		b = a; // a와 b의 참조 값이 같으므로 둘 다 같은 요소에 연결되어 있
		
		System.out.println(a);
		System.out.println(b[0]);
		
	}
	
	public static void ex03() {
		
		// 생성된 배열의 크기를 늘이는 방법
		
		// 기존 배열 
		int[] a = new int[5];
		
		// 신규 배열
		int[] b = new int[10];
		
		// 기존 배열 요소 -> 신규 배열 요소
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인.
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {

		ex03();
		
		
	}

}
