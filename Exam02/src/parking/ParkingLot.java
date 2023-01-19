package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;

	public ParkingLot (String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}

	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx + "대");

		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}

		System.out.print("차량 번호를 입력해주세요 >>> ");
		String carNo = sc.next();
		System.out.print("차량 모델을 입력해주세요 >>> ");
		String model = sc.next();

		cars[idx++] = new Car(carNo, model);
		/*  방법 2
			System.out.print("차량 번호와 모델을 입력해주세요 >>> ");
		  	cars[idx] = new Car(sc.next(), sc.next());
		 */

		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");

	}

	public void deleteCar() {
		
	}

	public void printAllCar() {
		
	}
	
	public void manage() {
	
		while(true) {
			
			System.out.println("1.추가 2.삭제 3.전체 0.종료");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: addCar(); break;
			
			case 2:	deleteCar(); break;
			
			case 3: printAllCar(); break;
				
			case 0:	System.out.println("프로그램 종료"); return;
			
			default : System.out.println("존재하지 않는 메뉴입니다	.");
			}
			
			
		}
	}
	
}
