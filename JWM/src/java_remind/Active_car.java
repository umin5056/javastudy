package java_remind;

public class Active_car {

	public static void main(String[] args) {
		Car car = new Car();



		//System.out.println(car.addOil(70));
		
		for(int i=0; i < 4; i++ ) {
			car.go(10);

		}
		System.out.println();
		
		for(int i=0; i < 6; i++ ) {
			System.out.println(car.stop());

		}

	}
}
