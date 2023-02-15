package ex04_builder;

import ex04_builder.User.Builder;

public class MainClass {

	public static void main(String[] args) {

		User user = User.builder()
						.id("adss")
						.pw("123")
						.build();
		
		System.out.println(user);
		
	}

}
