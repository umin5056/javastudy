package WeekScheduler;

import java.util.Scanner;

public class WeekScheduler {
	
	private Scanner sc; 
	private Day[] days;
	private String[] dayNames = {"일","월","화","수","목","금","토"};
	private int nthWeek;
	
	// new WeekScheduler(4)
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		sc = new Scanner(System.in);
		days = new Day[7];
		
		for(int i=0; i < days.length; i++) {
			days[i] = new Day(); // setter로 스케쥴을 넣을 수 있게 하기 위해서 빈 객체로 배열을 채운다.
		}
	}
	
	public void addSchedule() {
		System.out.print("요일 입력 >>> ");
		String dayName = sc.next().trim().substring(0,1); // 트림으로 공백을 지워 dayName에 공백이 들어오는 것을 막는다.
		sc.nextLine(); //  요일을 입력 후 발생하는 엔터키를 스케쥴 입력으로 넣지 않기 위해.
		
		for(int i=0; i<dayNames.length; i++) {
			if(dayName.equals(dayNames[i])) {
				if(days[i].getSchedule() == null) {
					System.out.print("스케쥴 입력 >>>");
					String schedule = sc.nextLine();
					days[i].setSchedule(schedule);
					System.out.println(dayName + "요일에 스케쥴 등록 완료");
				}else {
					System.out.println(dayName + "요일에 이미 스케쥴 있음");
				}
				break;
			}
		}
	}
	
	public void deleteSchedule() {
		System.out.print("요일 입력 >>> ");
		String dayName = sc.next().trim().substring(0,1); // 트림으로 공백을 지워 dayName에 공백이 들어오는 것을 막는다.
		sc.nextLine(); //  요일을 입력 후 발생하는 엔터키를 스케쥴 입력으로 넣지 않기 위해.
		
		for(int i=0; i < dayNames.length; i++) {
			if(dayName.equals(dayNames[i])) {
				days[i].setSchedule(null);
				System.out.println(dayName + "요일 스케쥴 삭제 완료");
				break;
			}
		}
	}
	
	public void modifySchedule() {
		System.out.print("요일 입력 >>> ");
		String dayName = sc.next().trim().substring(0,1); // 트림으로 공백을 지워 dayName에 공백이 들어오는 것을 막는다.
		sc.nextLine(); //  요일을 입력 후 발생하는 엔터키를 스케쥴 입력으로 넣지 않기 위해.
		
		
		
		
	}

	
	
	public void printAllSchedule() {
		
		System.out.println(nthWeek + "주차 스케쥴");
		for(int i=0; i < days.length; i++) {
			System.out.print(dayNames[i] + "요일 : ");
			System.out.println(days[i].getSchedule() == null ? "스케쥴 없음" : days[i].getSchedule());
		}
		
	}
	
	public void manage() {
		
		while(true) {
			System.out.print("1.추가 2.삭제 3.수정 4.출력 0.종료 >>> ");
			String choice = sc.next();
			switch (choice) {
			case "1" : addSchedule(); break;
			case "2" : deleteSchedule(); break;
			case "3" : modifySchedule(); break;
			case "4" : printAllSchedule(); break;
			case "0" : System.out.println("스케쥴 프로그램 종료"); return;
			
			}
			
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new WeekScheduler(4).manage();
	}
	
	
	
}
