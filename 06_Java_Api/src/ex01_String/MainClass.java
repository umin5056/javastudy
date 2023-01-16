package ex01_String;

public class MainClass {
	
	public static void ex01() {
		
		// 문자열 리터럴(Literal)
		String str1 = "hello";
		String str2 = "hello";
		
		/* 문자열 리터럴은 Java에 의해서 최적화되기 때문에
		   동일한 리터럴("hello")을 2번 이상 사용하면 기존에 사용한 리터럴을 재사용한다.
		   ("hello"라는 리터럴이 2개이상 만들어지지 않는다.) 
		   * str1과 str2의 참조값이 동일하고, 해당 참조값에 "hello"가 있다.
		    
		    		
            |-------|
       str1 | 0x123 |
            |-------|
       str2 | 0x123 |
            |-------|
            |  ...  |
            |-------|
            |"hello"| 0x123
            |-------|
		
		 */
		
		System.out.println(str1 == str2); // 참조값을 비교했을 때 true가 나옴. (문자열 비교 아님)
		System.out.println(str1.equals(str2)); // 문자열 비교는 equals를 사용.
		
	}
	

	public static void main(String[] args) {
		
		ex01();
		
	}

}
