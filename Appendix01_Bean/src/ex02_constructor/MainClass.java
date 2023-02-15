package ex02_constructor;

public class MainClass {

	public static void main(String[] args) {

		// User 객체(Bean) 생성 - 웹 개발에서 "Bean"은 객체를 의미
		User user = new User("admin", "123456");
	
		
		// 필드 값 확인
		System.out.println(user);
		
	}

}
