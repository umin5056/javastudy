package ex07_constructor;

public class User {
	
	String id;
	String pw;
	
	User() {
		id = "anonumous";
		pw = "1234";
	}

	User(String UserId, String UserPw) {
		id = UserId;
		pw = UserPw;
	}
	
	void info() {
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}

}
