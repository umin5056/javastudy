package ex02_constructor;

public class User {
	
	private String id;
	private String pw;
	
	public User(String id, String  pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
}
