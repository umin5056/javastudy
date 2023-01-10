package ex01_field;

public class MainClass {

	public static void main(String[] args) {
		
		//User 타입의 객체 선언
		User user1;
		
		//User 타입의 객체 생성
		user1 = new User();
		
		// 객체 user1의 필드 활용
		user1.id = "admin";
		user1.pw = "123456";
		user1.point = 100;
		user1.isVip = false;
		
		// addr 필드 생성 (Address 클래스 타입이기 때문에 반드시 new를 이용해 생성해야한다.
		
		user1.addr = new Address();
		
		user1.addr.postcode = "12345";
		user1.addr.roadAd = "디지털로";
		user1.addr.jibunAd = "가산동";
		
		
		System.out.println("=====user1=====");
		System.out.println("ID : " + user1.id);
		System.out.println("PW : " + user1.pw);
		System.out.println("Pt : " + user1.point);
		System.out.println("Vip : " + user1.isVip);
		System.out.println("Address : " + user1.addr.postcode + " " + user1.addr.roadAd + "(" + user1.addr.jibunAd + ")");
		// 개별 연습 - 객체 user2 생
		
		User user2 = new User();
		
		user2.id = "master";
		user2.pw = "654321";
		user2.point = 1000;
		user2.isVip = true;
		
		user2.addr = new Address();
		
		user2.addr.postcode = "54321";
		user2.addr.roadAd = "디지털로";
		user2.addr.jibunAd = "철산동";
		
		System.out.println("\n" + "=====user2=====");
		System.out.println("ID : " + user2.id);
		System.out.println("PW : " + user2.pw);
		System.out.println("Pt : " + user2.point);
		System.out.println("Vip : " + user2.isVip);
		System.out.println("Address : " + user2.addr.postcode + " " + user2.addr.roadAd + "(" + user2.addr.jibunAd + ")");
		
	}

}
