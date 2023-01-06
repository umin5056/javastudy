package ex02_casting;

public class Ex02_casting {

	public static void main(String[] args) {

		/* 강제 변환
		   1. 큰 크기 -> 작은 크기
		   2. 실수 -> 정수
		*/
		
		int n = 256;
		byte bn = (byte)n; // 변수 n을 byte타입으로 변환
		System.out.println(n);
		System.out.println(bn);
		
		double leftEye = 1.7;
		int iLeftEye = (int)leftEye;
		System.out.println(leftEye);
		System.out.println(iLeftEye);
	}

}
