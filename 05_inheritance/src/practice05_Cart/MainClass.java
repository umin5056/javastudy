package practice05_Cart;

public class MainClass {

	public static void main(String[] args) {

		Customer c = new Customer(10000, 500);
		
		c.addToCart(new Meat(1,"돼지고기",5000));
		c.addToCart(new Pizza(2,"고구마피",3000));
		c.addToCart(new Noodle(3,"누들",1000));
		
		System.out.println(c.buy());
		
		System.out.println(c.getMyMoney());
		System.out.println(c.getMyPoint());
	}

}
