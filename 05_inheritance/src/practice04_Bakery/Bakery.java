package practice04_Bakery;

// 한 가지 종류의 빵만 판매하는 빵집

public class Bakery {

	// 필드
	private int breadCount;  // 판매하는 빵의 개수
	private int breadPrice;  // 판매하는 빵의 가격
	private int bakeryMoney; // 빵집에 있는 돈

	// 생성자
	public Bakery() {
		
	}
	
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}
	
	// Getter Setter
	public int getBreadCount() {
		return breadCount;
	}
	
	public void setBreadCount(int breadCount) {
		this.breadCount = breadCount;
	}
	
	public int getBreadPrice() {
		return breadPrice;
	}
	
	public void setBreadPrice(int breadPrice) {
		this.breadPrice = breadPrice;
	}
	
	public int getBakeryMoney() {
		return bakeryMoney;
	}
	
	public void setBakeryMoney(int bakeryMoney) {
		this.bakeryMoney = bakeryMoney;
	}
	

	// 판매 메소드
	// 구매자에게 돈을 받는다. 구매자에게 빵과 잔돈을 준다.
	public BreadAndChange sell(int money) {
		
		int sellCount = money/breadPrice;
		
		BreadAndChange bnc = new BreadAndChange(sellCount, money);
		if(sellCount > breadCount) {
			return bnc;
		}
		
		this.bakeryMoney += money;
		
	 	breadCount -= sellCount;
	 	
	 	return bnc;
		
		
	}
	

	// 판매 현황 메소드
	public void info() {
		System.out.println("남은 빵 : " + breadCount + "개");
		System.out.println("현재 돈 : " + bakeryMoney + "원");
	}
	
	
}
