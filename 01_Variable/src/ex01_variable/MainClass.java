package ex01_variable;

public class MainClass {
	
	// single comment - 주석(설명)
	/* multiple comment - (여러줄 주석) */
	
	/* 
	 1. 프로젝트 : 마음대로.
	 2. 패키지 : 모두 소문자로 작성. 실무에서는 회사 도메인과 앱 이름으로 작성(com.samsung.galaxy)
	 3. 클래스 : 첫글자만 대문자로 작성하고 나머지는 소문자. Upper Camel Case 방식 (HelloWorld)
	 4. 메소드 : 첫글자만 대문자로 작성하고 나머지는 소문자. Lower Camel Case 방식 (helloWorld)
	 5. 변수 : 메소드와 작성 방식 동일
	 6. 상수 : 모두 대문자로 작성. Snake Case 방식 (HEELO_WORLD)
	*/
	
	/* 
	 	main 메소드
	 	1. Java가 실행될 때 main 메소드가 실행된다.
	 	2. 열려있는 main 메소드가 없으면 최근에 실행한 main 메서드를 실행한다.
	 */
	
	
	public static void main(String[] args) {
		
		/* 타입의 구분
		 1.primitive type : 기본타입(소문자로 되어있음) 값을 저장하는 타입.
		 2. reference type : 참조타입(첫 글자가 대문자로 되어있음, 모든 클래스의 타입) 값이 저장된 참조값을 저장하는 타입.
		
		*/

		//논리 타입
		boolean isGood = true;
		boolean isAlive = false;
		
		System.out.println(isGood);
		System.out.println(isAlive);
		
		//실수 타입
		double leftEye = 0.7;
		double rightEye = 1.7;
		System.out.println(leftEye);
		System.out.println(rightEye);

		//char 타입
		char ch1 = '\t'; // 탭으로 건너뛴다.
		char ch2 = '\n'; // 줄바
		char ch3 = '\"'; // \는 이스케이프로 뒤에 오는 문자를 그대로 출력하게 도와준다.
	
		System.out.println(ch3);
		
		//문자열 타입(여러 글자를 의미, 글자 수의 제한이 없음)
		String name = "조우민"; // Java에서 기본 타입과 같은 사용법을 제공.
		System.out.println(name);
		
		//상수 선언하기(final 키워드 사용 - 값의 변경이 불)
		final double PI = 3.141592;
		System.out.println(PI);
	
		
		
		
	}

}
