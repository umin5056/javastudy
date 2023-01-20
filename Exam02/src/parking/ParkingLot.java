package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;

	public ParkingLot(String name) {

		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);

	}

	public void addCar() {

		System.out.println("현재 등록된 차량은 " + idx + "대");

		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}

		System.out.print("차량 번호와 차량 모델을 순서대로 입력해주세요~!");
		cars[idx] = new Car(sc.next(), sc.next());

		System.out.println("차량번호 "+ cars[idx].getCarNo() +" 차량이 등록되었습니다.");

		idx++;

	}

	public void deleteCar() {

		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}

		System.out.print("제거할 차량번호 >>>");
		String target = sc.next();

		for(int i=0; i<idx; i++ ) {
			if(cars[i].getCarNo().equals(target)) {
				System.out.println("차량번호 "+ cars[i].getCarNo() +" 차량이 삭제되었습니다.");
				for(int j=i+1; j<cars.length; j++) {
					cars[i] = cars[j];
					i++;
				}
				idx--;
				return;
			}
		}
		System.out.println("대상 차량이 존재하지 않습니다.");
		
	}

	public void printAllCars() {

		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}

		System.out.println(name + " 차량 목록\n");

		for(int i=0; i < idx; i++) {
			System.out.print("Car(carNo=" + cars[i].getCarNo());
			System.out.print(", model=" + cars[i].getModel() + ")\n\n");

		}


	}
	
	public void manage() {
		
		while(true) {
			System.out.println( "1.추가 2.삭제 3.전체 0.종료" );
			
			String menu = sc.next();
			
			switch(menu) {
			
			case "1" : addCar(); break;
			case "2" : deleteCar(); break;
			case "3" : printAllCars(); break;
			case "0" : System.out.println("차량 등록 프로그램을 종료합니다.");return;
			default : System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
		
		
		
	}

















}
