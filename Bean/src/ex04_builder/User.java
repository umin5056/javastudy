package ex04_builder;

public class User {
	
	// User 필드(Builder 객체가 가진 값을 받아온다.)
	private String id;
	private String pw;
	
	// User 생성자
	public User(Builder builder) {
		this.id = builder.id;
		this.pw = builder.pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}

	// Builder 객체 반환
	public static Builder builder() {
		return new Builder();
	}
	
	// Builder 클래스 (내부 클래스)
	public static class Builder { 
		
		// Builder 필드 (여기로 값을 전달받아서 User 필드로 전달한다.)
		private String id;
		private String pw;
		
		/* 값을 받아오는 메소드
		   1. 메소드명 == 필드이름
		   2. 메소드 체이닝을 위해서 현재 객체를 반환한다.
		      (체이닝 : 두개의 메소드를 연속으로 사용하는 것 -user.setId("admin").setPw("12345");)
		       원리   : 메소드의 반환 타입을 User로 하고 return this; 하면 다시 메소드를 사용이 가능해진다.
		*/
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder pw(String pw) {
			this.pw = pw;
			return this;
		}

		/* User 객체를 반환
		   Builder 필드 값을 가진 User 객체를 반환
		 */
		
		public User build() {
			return new User(this);
		}
	
	}
}
