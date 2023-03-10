package ex01_String;

public class Ex01_String {

	public static void literal() {

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

	public static void stringOject() {

		// 문자열 객체 (ex01의 리터럴과 다름)
		String str1 = new String("hello");
		String str2 = new String("hello");

		/* 문자열 객체는 언제나 새로 생성된다.

        |-------|
   str1 | 0x123 |
        |-------|
   str2 | 0x456 |
        |-------|
        |  ...  |
        |-------|
        |"hello"| 0x123
        |-------|
        |       | 
        |-------|
        |"hello"| 0x456
        |-------|

		 */

		System.out.println(str1 == str2); // 객체의 참조값을 비교했을 때 false가 나옴.

	}

	public static void equals() {

		// equals 메소드 : 문자열을 비교하는 boolean타입 메소드

		// 대소문자도 일치해야함.
		String str1 = "hello";
		String str2 = new String("HELLO");

		if(str1.equals(str2)) {

			System.out.println("str1과 str2는 같은 문자열이다.");

		} else {
			System.out.println("str1과 str2는 다른 문자열이다.");
		}

		// 대소문자는 무시하고 비교.
		if(str1.equalsIgnoreCase(str2)) {

			System.out.println("str1과 str2는 같은 문자열이다.");

		} else {
			System.out.println("str1과 str2는 다른 문자열이다.");

		}

	}

	public static void length() {

		// length 메소드 : 문자열의 길이(글자수)를 반환

		String str = "Hello\nWorld";

		System.out.println(str.length());


	}

	public static void charAt() {

		// charAt 메소드 : 문자열의 특정 인덱스의 문자(char)를 반환.

		String name = "조우민";
		char[] arr = name.toCharArray();

		for(int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);

		}

	}

	public static void substring() {
		/*
		    substring 메소드 : 문자열의 일부 문자열을 반환
		    1. substring(int begin) : 인덱스 begin부터 끝까지 반환
		    2. substring(int begin, int end) : 인덱스 begin부터 end 이전까지 반환(begin ~ end-1)
		 */

		String name = "조우민";

		String familyName = name.substring(0,1);
		String givenName = name.substring(1);

		System.out.println(familyName);
		System.out.println(givenName);

	}

	public static void indexOf() {

		// indexOf 메소드 : 특정 문자열의 인덱스를 반환.
		// 발견된 첫번째 문자열의 인덱스 정보를 반환. (없을 경우 -1을 반환)

		/*
		   indexOf 사용
		   1. indexOf(String str) : 인덱스 0부터 str 검색
		   2. indexOf(String str, int index) : index부터 str 검색

		 */

		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네";

		int idx1 = slogan.indexOf("걱정"); // 첫번째 걱정 찾기
		int idx2 = slogan.indexOf("걱정", idx1+1); // 두번째 걱정 찾기 (첫 걱정 이후부터 검색)
		int idx3 = slogan.indexOf("걱정", idx2+1); // 세번째 걱정 찾기 (두번째 걱정 이후부터 검색)

		int idx4 = slogan.indexOf("조우민"); // 없는 글자 찾기

		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);


	}

	public static void lastIndexOf() {

		// lastInextOf : 발견되 마지막 문자열의 인덱스 반환 (그 외 indexOf()와 동일함)

		String slogan = "걱정한다고 걱정이 없어지면 걱정이 없겠네";

		int idx1 = slogan.lastIndexOf("걱정"); 
		int idx2 = slogan.lastIndexOf("걱정", idx1-1); 
		int idx3 = slogan.lastIndexOf("걱정", idx2-1); 

		int idx4 = slogan.lastIndexOf("조우민"); 

		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);

	}

	public static void startsWith() {
		
		//startsWith : 문자열이 지정된 정규식 패턴(Regular Expression)으로 시작하면 true 반환
		
		// endsWith : 문자열이 지정된 정규식 패턴(Regular Expression)으로 끝나면 true 반환
		
		// matches : 문자열이 지정된 정규식 패턴(Regular Expression)으로 포함하면 true 반환
		String name = "조우민";
		
		if(name.startsWith("조")) {
			System.out.println("조씨다!");
		} else {
			System.out.println("조씨가 아니다!");
		}
		
		
		if(name.endsWith("민")) {
			System.out.println("민으로 끝난다!");
		} else {
			System.out.println("조씨가 아니다!");
		}
		
	}
	
	public static void contains() {
		
		// contains : 문자열이 지정된 CharSequence(String, char[] 등)를 포함하면 true 반환.
		
		/* 
		     참고 : CharSequence를 구현하는 class 중에 String이 있다. (String이 CharSequence에 포함됨)
		   - public interface CharSequence {  }
		   - public class String implements CharSequence {  }
		 */
		
		String email = "umin@naver.com";
		
		if(email.contains("@")) {
			System.out.println("이메일이 맞다.");
		} else {
			System.out.println("이메일이 아니다.");
		}
		
		
	}
	
	public static void toCase() {
		
		// toUpperCase : 대문자로 변환.
		// toLowerCase : 소문자로 변환.
		
		String str = "I am a boy";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	}
	
	public static void trim() {
		
		// trim : 문자열 앞뒤에 공백(space, tab, enter)을 제거
		
		String str = "   hahahah   hohoho   ";
		
		System.out.println("(" + str + ")");
		System.out.println("(" + str.trim() + ")");
		
		
		
	}
	
	public static void replace() {
		
		/*
		   replace : 기존 문자열을 새로운 문자열로 변환
		   
		   사용법
		   - str.replace(String str1, String str2) 
		     : str에 있는 모든 str1을 str2로 변환
		 */
		
		String str = "best of the best";
		String result = str.replace("best", "worst");
		
		System.out.println(result);
	
		/*
		   replaceAll : 정규식 패턴(Regular Expression)을 만족하는 부분을 변환
		 */
		
		String ip = "61.78.121.242";
		String replacedIp = ip.replace(".", "_"); // 61_78_121_242;
		String replacedIp2 = ip.replaceAll(".", "_"); // (정규식에서 .은 모든 문자를 가르킴)
		
		System.out.println(replacedIp);
		System.out.println(replacedIp2);
		
		
	}
	
	public static void isEmpty() {
		
		// isEmpty : 빈문자열이면 true, 아니면 false 반환
		// 빈문자열 : 문자열의 length가 0인 문자열 ("")
		
		String str = "   ";
		if(str.trim().isEmpty()) {
			System.out.println("빈문자열입니다.");
		}else {
			System.out.println("빈문자열이 아닙니다.");
		}
		
		// isBlank : 빈 문자열이거나, 공백 문자로만 구성되었다면 true, 아니면 false 반환 (jdk 11 이후에서만 사용가능)
		
		if(str.isBlank()) {
			System.out.println("비었다.");
		} else {
			System.out.println("아니다.");
		}
		
		
	}
	
	public static void format() {
		
		// format : 문자열을 지정한 형식으로 반환
		
		// 숫자 형식 지정하기
		
		int num = 1000;
		
		System.out.println(String.format("%o", num)); // %o : 8진수로 표시
		System.out.println(String.format("%d", num)); // %d : 10진수로 표시
		System.out.println(String.format("%x", num)); // %x : 16진수로 표시 (0 ~ 9, a ~ f)
		System.out.println(String.format("%X", num)); // %X : 16진수로 표시 (0 ~ 9, A ~ F)
		
		// 문자열 형식 지정하기
		
		String str = "hi";
		
		System.out.println(String.format("%s", str)); // %s : 문자열로 표시
		
		// 출력 폭 지정하기
		System.out.println(String.format("%10d", num)); // %10d : 10자리로 출력 숫자는 오른쪽 정렬.
		System.out.println(String.format("%-10d", num)); // %-10d : 10자리로 출력 숫자는 왼쪽 정렬.
		System.out.println(String.format("%5s", str)); // %5d : 5자리로 출력 숫자는 오른쪽 정렬.
		System.out.println(String.format("%-5s", str)); // %-5d : 10자리로 출력 숫자는 왼쪽 정렬.
		
		
	}
	
	public static void ex01() {

		
		String url = "https://comic.naver.com/webtoon/detail?titleId=728750&no=192&;weekday=mon";
		
		String requestURI = url.substring(0, url.indexOf("?"));
		
		System.out.println(requestURI);
		
		String params = url.substring(url.indexOf("?")+1);
		
		System.out.println(params);
		
	}
	
	public static void ex02() {

		
		String fullName = "apple.tar.gz";
		
		String fileName = "";

		String extName = "";	// jpg
		
		if(fullName.endsWith(".tar.gz")) {
			
			fileName = fullName.substring(0, fullName.lastIndexOf(".tar.gz")); 
			extName = ".tar.gz";
			
		} else {
		
			fileName = fullName.substring(0, fullName.lastIndexOf("."));  // apple
			extName = fullName.substring(fullName.lastIndexOf("."));
		}
		
		System.out.println(fileName + " " + extName);
		
	}

	
	
	public static void main(String[] args) {

		format();

	}

}
