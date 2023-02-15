package ex03_singleton;

public class MainClass {

	public static void main(String[] args) {

		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		System.out.println(user1 == user2);
		
	}

}
