package ex03_date_time;

public class Ex01_System {

	public static void ex01() {

		/*
		   타임스탬프
		   1. 현재 시간을 long 타입의 정수 값으로 가지고 있는 값을 의미한다.
		   2. 1970년 01월 01일 0시부터 1/1000초마다 1씩 증가하고 있는 값이다.

		 */

		long timestamp = System.currentTimeMillis();

		System.out.println(timestamp);
	}

	public static void ex02() {
		
		/*
		   시간 단위
		   second > ms(밀리) > ㎲(마이크로) > ㎱(나노) > ㎰(피코)
		 */
		
		
		
		// 나노타임은 경과되는 시간을 구하기위해 사용한다.
		// 아래 코드는 +연산과 append 메소드의 성능 차이를 확인하는 코드이다.
		
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		
		// 시작 시간
		long nanoTime1 = System.nanoTime();
		
		// 작업수행 
		for(char ch ='A'; ch <='Z'; ch++) {
//			str += ch;
			sb.append(ch);
		}
		
		// 종료 시간
		long nanoTime2 = System.nanoTime();
		
		
		System.out.println("작업수행시간 : " + (nanoTime2 - nanoTime1) + "ns");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
