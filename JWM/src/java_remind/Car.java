package java_remind;

public class Car {
	
	// 필드
	int oilPot;
	int speed;
	
	
	//메소드
	public int addOil(int oil) {
		
		if(oilPot + oil > 50) {
			return oilPot = 50;
		}
		oilPot += oil;
		return oilPot;
	}
	
	public int go(int a) {
		
		speed += a;
		
		if(speed > 100) {
			return speed;
		}
		
		return speed;
	}
	
	public int stop() {
		
		speed -= 10;
		
		if(speed < 0) {
			return 0;
		}
		
		return speed;
		
	}
	
	
	
}
