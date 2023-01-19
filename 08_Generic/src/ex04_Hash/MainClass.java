package ex04_Hash;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		User user1 = new User("admin","123456");
		User user2 = new User("admin","123456");
		
		Set<User> set = new HashSet<>();
		
		set.add(user1);
		set.add(user2);
		
		System.out.println(set); // User에 equals,hashcode를 오버라이드해야 set에서 객체 중복을 막는다.
		
	}

}
