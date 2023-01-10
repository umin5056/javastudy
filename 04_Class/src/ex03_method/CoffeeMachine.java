package ex03_method;

public class CoffeeMachine {

	// 필드
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마키아또"};
	int[] prices = {900, 1500, 2000};

	// 메소드
	CoffeeAndChange buyCoffee(int money, int choice) {

		CoffeeAndChange cnc = new CoffeeAndChange();

		String coffee = menu[choice-1];
		int price = prices[choice-1];

		// 돈이 부족하면 그대로 돈 반환
		if(money < price) {

			cnc.change = money;

			return cnc;
		} 


		moneyPot += price;

		cnc.coffee = coffee;
		cnc.change = money - price;

		return cnc;

	}

}
