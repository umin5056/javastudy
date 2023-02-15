package ex05_lombok;

public class MainClass {

	public static void main(String[] args) {

		User user = new User();
		
		user.setId("daa");
		System.out.println(user.getId());
		
		System.out.println(user);
	
		User user2 = User.builder()
						 .id("asdf")
						 .pw("fsafs")
						 .build();
	}

}
