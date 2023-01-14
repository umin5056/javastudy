package ex03_method;

public class MainClass {

	
	public static void ex01() {

		// Calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5); // addition 메소드 호출	
		System.out.println("add : " + add);
		
		double sub = calc.sub(5.5, 1.4);
		System.out.println("sub : " + sub);
		
	}
	
	public static void ex02() {

		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		CoffeeAndChange coffeeAndChange = coffeeMachine.buyCoffee(1000, 2);
		
		System.out.println("커피 : " + coffeeAndChange.coffee);
		System.out.println("잔돈 : " + coffeeAndChange.change);
		System.out.println("수익 : " + coffeeMachine.moneyPot);
		
	}
	
	public static void ex03() {
		
		Car car = new Car();
		
		car.addOil(60);
		
		for(int i=0; i<51; i++) {
			car.pushAccel();
		}
		
		System.out.println(car.oilPot);
		
		for(int i=0; i<11; i++)	 {
			car.pushBrake();
		}
		
	}
	
	
	public static void main(String[] args) {

		ex02();
		
		
	}

}
