package ConcertHall;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertHall {

	private String hallName;
	private SeatGroup[] seatGroups;
	private Scanner sc;
	private String[] seatTypes = {"S","R","A"};
	private int[] seatCount = {20, 30, 40};

	public ConcertHall(String hallName) {
		this.hallName = hallName;
		seatGroups = new SeatGroup[seatTypes.length];
		for(int i=0; i < seatTypes.length; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCount[i]);
		}
		sc = new Scanner(System.in);
	}

	private void reserve() {
		System.out.println("예약할 좌석 타입 입력 " + Arrays.toString(seatTypes) + " >>> ");
		String seatType = sc.next();
		for(int i=0; i < seatTypes.length; i++) {
			if(seatType.equalsIgnoreCase(seatTypes[i])) {
				seatGroups[i].reserve();
				return;
			}
		}
		System.out.println(seatType + "타입은 없는 좌석 타입입니다.");
	}

	private void cancel() {
		System.out.println("취소할 좌석 타입 입력 " + Arrays.toString(seatTypes) + " >>> ");
		String seatType = sc.next();
		for(int i=0; i < seatTypes.length; i++) {
			if(seatType.equalsIgnoreCase(seatTypes[i])) {
				seatGroups[i].cancel();
				return;
			}
		}
		System.out.println(seatType + "타입은 없는 좌석 타입입니다.");


	}

	private void allReserve() {
		System.out.println("[" + hallName + "]");
		for(int i=0; i<seatTypes.length; i++) {
			seatGroups[i].reserveInfo();
		}
		System.out.println();
	}


	public void manage() {
		while(true) {

			System.out.println("1.예약 2.취소 3.예약현황 0.종료 >>>");
			String input = sc.next();

			switch (input.trim()) {
			case "1" : reserve(); break;
			case "2" : cancel(); break;
			case "3" : allReserve(); break;
			case "0" : System.out.println("예약 프로그램이 종료됨.");return;
			default : System.out.println("잘못된 메뉴 선택입니다.");
			}

		}



	}
}
