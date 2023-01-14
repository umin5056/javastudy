package java_remind;

class CoffeeAndChange {

	String coffee;
	int change;

}

class CoffeeMachine {

	int moneyPot;
	String[] cfArr = {"a", "b", "c"};
	int[] prArr = {100,200,300};

	public CoffeeAndChange buyCoffee(int money, int coffee) {
		CoffeeAndChange cnc = new CoffeeAndChange();

		if(money < prArr[coffee-1]) {
			return cnc;
		}
		
		cnc.change = money - prArr[coffee-1];
		cnc.coffee = cfArr[coffee-1];
		
		moneyPot += money - cnc.change;
		return cnc;
		
	}


}

public class practice {

	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine();

		CoffeeAndChange coffeeAndChange = coffeeMachine.buyCoffee(1000, 3);

		System.out.println("커피 : " + coffeeAndChange.coffee);
		System.out.println("잔돈 : " + coffeeAndChange.change);
		System.out.println("수익 : " + coffeeMachine.moneyPot);


	}

}


