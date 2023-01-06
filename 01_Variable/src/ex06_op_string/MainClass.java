package ex06_op_string;

public class MainClass {

	public static void ex01() {
		/*
		   연결 연산
		   문자열과 "+"가 만나면 문자열로 연결된다.
		 */
		
		String str1 = "구디" + "아카데미";
		String str2 = 4 + "달라";
		String str3 = 100 + 10 + "번지";
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
	
	public static void ex02() {
		
		/*
		   모든 타입의 데이터는 빈 문자열("") + 시키면 문자열이 됩니다.
		 */
		
		String str = 100 + "";
		
		/* 
		   원래는 이런 게 있습니다. 
		   String str = String.valueOf(100);
		 */
		
		System.out.println(str);
		
	}
	
	public static void ex03() {

		
		// 문자열의 비교는ㄴ == 또는 !-로 하지 않는다.
		
		String str1 = "hello";
		System.out.println(str1 == "hello");
		
		String str2 = new String("hello");
		System.out.println(str2 == "hello");
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex03();
		
	}

}
