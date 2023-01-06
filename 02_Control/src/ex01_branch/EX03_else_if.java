package ex01_branch;

public class EX03_else_if {

	public static void ex01() {

		int score = 60;

		if(score >= 80) {
			System.out.println("상");
		}

		else if(score >= 60)	{
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}

	}

	public static void ex02() {
		
		int score = 40;
		
		if(score > 100 || score < 0) {
			
			System.out.println("잘못된 점수");
			
		} else {
			
			if(score >= 90) {
				System.out.println("수");
			} else if(score >= 80) {
				System.out.println("우");
			} else if(score >= 70) {
				System.out.println("미");
			} else if(score >= 60) {
				System.out.println("양");
			} else {
				System.out.println("가");
			}
		}
		
		
	}
	
	public static void ex03() {
		
		int month = 13;
		
		if(!(1<=month && month <=12)) {
			System.out.println("잘못된 날짜");
		} else if(month ==12 || month < 3) {
			System.out.println("겨울");
		} else if(month < 6) {
			System.out.println("봄");
		} else if(month < 9) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		
		// 선생님이 푸신 방법 (개월을 12로 나눠서 계산)
		
		int mod = month%12;
		
		 if(!(1<=month && month <=12)) {
			System.out.println("잘못된 날짜");
		} else if(mod < 3) {
			System.out.println("겨울");
		} else if(mod < 6) {
			System.out.println("봄");
		} else if(mod < 9) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		
		
	}
	
	public static void ex04() {
		
		int day = 6; //금요일
		int today =day;
		
		int nDay = 10; // 10일 후
		
		day += nDay;
	
		String weekName;
		
		int mod = day % 7;
		
		if(mod == 0) {
			weekName = "토";
		} else if(mod == 1) {
			weekName = "일";
		} else if(mod == 2) {
			weekName = "월";
		} else if(mod == 3) {
			weekName = "화";
		} else if(mod == 4) {
			weekName = "수";
		} else if(mod == 5) {
			weekName = "목";
		} else {
			weekName = "금";
		}
		
		System.out.println("오늘은 " + today +"일이고," +nDay + "일 후의 요일 : " + weekName);
		
		
	}
	
	
	public static void main(String[] args) {

		ex04();

	}
}
