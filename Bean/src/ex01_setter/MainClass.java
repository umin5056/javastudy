package ex01_setter;

public class MainClass {

	public static void main(String[] args) {

		// User 객체(Bean) 생성 - 웹 개발에서 "Bean"은 객체를 의미
		User user = new User();
	
		// setter를 이용한 필드 값 저장
		user.setId("admin");
		user.setPw("123456");
		
		// 필드 값 확인
		System.out.println(user);
		
	}

}
