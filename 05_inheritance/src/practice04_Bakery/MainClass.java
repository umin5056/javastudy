package practice04_Bakery;

public class MainClass {

	public static void main(String[] args) {
		
		Customer customer = new Customer(20000);  // 10000원을 가진 구매자
		
		Bakery tourLesJours = new Bakery(10, 1200, 10000);  // 빵 10개, 빵 하나 1000원, 10000원 가지고 있음
		Bakery parisBaguette = new Bakery(10, 500, 10000);  // 빵 10개, 빵 하나 500원, 10000원 가지고 있음
		
		customer.buy(tourLesJours, 10000);  // tourlesjours에서 5000원어치 빵 구입
		customer.buy(parisBaguette, 1800); // parisbaguette에서 5000원어치 빵 구입
		
		customer.info();
		tourLesJours.info();
		parisBaguette.info();
		
	}

}
