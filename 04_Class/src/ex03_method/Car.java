package ex03_method;

public class Car {

	// 필드
	int oilPot;
	int carSpeed;
	
	// 기름 넣기 메소드
	void addOil(int oil) {
		
		
		if(oilPot + oil > 50)	{
			oilPot = 50;
			return; // 메소드 종료	(반환 타입이 없을 때만 사용 가능.)
		}
		oilPot += oil;
	}
	
	// 달리기 메소드
	void pushAccel() {
		if(oilPot == 0) {
			System.out.println("===================" + "\n" +" no gas" + "\n" + "===================");
			return;
		}
		if(carSpeed < 100) {
			carSpeed += 10;
		}
		System.out.print("Up " + carSpeed +"\n");
		oilPot--;
	}
	
	// 멈추기
	void pushBrake() {
		
		carSpeed -= 10;
		if(carSpeed < 0) {
			carSpeed = 0;
		}
		
		System.out.print("Down " + carSpeed + "\n");
	}
	
}
