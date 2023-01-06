
public class Main {

	public static void main(String[] args) {

		
		Scar c = new Scar(10);
		
		c.stop("ㅇ");
		
		
	}

}

class Car {
	
	public void go() {
		System.out.println("gogogo");
	}
	
}
class Scar extends Car {
	private int a;
	Scar(int a) {
		this.a = a;
	}
	
	public void stop(String string) {
		System.out.println("stopstopstop");
	}
	
}
