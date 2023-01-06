package ex01_branch;

public class Ex01_if {

	public static void ex01() {

		// if문

		int score = 80;

		if(score >= 60)
			System.out.println("합격");

		if(score < 60)
			System.out.println("불합격");
	}


	public static void ex02() {

		/*
		   if문의 중괄호
		   1. 실행문이 1개인 경우 생략 가능.
		   2. 실행문이 2개 이상인 경우 필요.
		 */

		int score = 60;

		if(score >= 60) {
			
			System.out.println("합격");
			System.out.println("축하합니다.");
		}

		if(score < 60) {
			
			System.out.println("불합격");
			System.out.println("보충수업니다.");
		}
	}
	public static void main(String[] args) {

		ex02();
		
	}

}
