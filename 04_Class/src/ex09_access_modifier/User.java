package ex09_access_modifier;

public class User {

    /*
	   접근 제어 지시자 (Access Modifier)
	   1. private 	: 클래스 내부에서만 접근
	   2. default 	: 동일한 패키지에서만 접근
	   3. protected : 동일한 패키지 또는 상속 관계의 클래스에서만 접근
	   4. public	: 접근 제한 없음
	   
	   정보 은닉 (Information Hiding)
	   1. 클래스의 내부 정보를 외부에 노출하지 않는 것
	   2. 클래스의 내부 정보는 "필드"를 의미
	   3. 모든 "필드"는 private으 처리한다.
	   4. "메소드"는 public으로 처리한다.
	   5. "필드"에 접근하기 위해서는 "메소드"를 이용해야 한다.
	   
	*/
	
	// 필드
	private String id;
	private String pw;
	
	// 메소드
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}
	
	
	
	
}
