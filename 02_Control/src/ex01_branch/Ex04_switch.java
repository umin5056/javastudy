package ex01_branch;

public class Ex04_switch {


	/*
		   switch(표현식) {

		   case 값1 : 실행문

		   case 값2 : 실행문
		   ...
		   default : 실행문 (default는 if문의 esle와 같다)


		   }

		   표현식의 결과로 사용 가능한 타입
		   - int
		   - String

		   표현식의 결과로 사용할 수 없는 타입
		   - boolean
		   - double

	 */


	public static void ex01() {

		int month = 1;

		switch (month) {

		case 12 :
		case 1 : 
		case 2 : System.out.println("겨울"); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("봄"); break;
		case 6 :
		case 7 :
		case 8 : System.out.println("여름	"); break;
		default : System.out.println("가을");


		}

	}

	
	public static void ex02() {

		int day = 13;

		String weekName;

		switch(day % 7) {
		case 0: weekName = "토"; break;
		case 1: weekName = "일"; break;  
		case 2: weekName = "월"; break;
		case 3: weekName = "화"; break;
		case 4: weekName = "수"; break;
		case 5: weekName = "목"; break;
		default : weekName = "금";

		}
		System.out.println(day + "일은 " +weekName+"요일이다." );
	}

	public static void ex03() {

		int score = 0;

		int result = score/10;

		if(score < 0 || score >100) {
			System.out.println("잘못된 점수");
			return;
		} 
		switch(result) {
		case 10 : 
		case 9 : System.out.println("수"); break;
		case 8 : System.out.println("우"); break;
		case 7 : System.out.println("미"); break;
		case 6 : System.out.println("양"); break;
		default : System.out.println("가");

		}
	}

	public static void ex04() {

		int month = 5;


		// 내가 푼 방
		if(month < 1 || 12 < month) {
			System.out.println("잘못된 개월");
			return;
		} else {

			switch(month) {
			case 1 : 
			case 2 : 
			case 3 : System.out.println("1분기"); break;
			case 4 : 
			case 5 : 
			case 6 : System.out.println("2분기"); break;
			case 7 : 
			case 8 : 
			case 9 : System.out.println("3분기"); break;
			default : System.out.println("4분기");

			}
		}

		// 반복을 이용한 방법 
		if(month < 1 || 12 < month) {
			System.out.println("잘못된 개월");
			return;
		} 

		switch((month -1) / 3) {
		case 0 : System.out.println("1분기"); break;
		case 1 : System.out.println("2분기"); break;
		case 2 : System.out.println("3분기"); break;
		default : System.out.println("4분기");
		}
		
		// 반복, 조건을 이용하지 않은 방법
		System.out.println((month-1) / 3 + 1 + "분기");
	}

	public static void main(String[] args) {

		ex04();		

	}

}
