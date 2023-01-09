package ex02_loop;

public class Ex05_nexted_loop {
	
	public static void ex01() {
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차 " + hour + "교시 수업");
			}
			System.out.println();
		}
		
	}
	
	public static void ex02() {
		
		int day = 1;

		while(day <= 5) {
			
			int hour = 1;
			
			while(hour <= 8) {
				System.out.println(day + "일차 " + hour + "교시 수업");
				hour++;
			}
			day++;
		}
		
	}
	

	public static void ex03() {
		
		for(int a = 2; a < 10; a++) {
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " x " + b + " = " + a*b);
			}
		}
		
	}
	
	public static void ex04() {
		
		
		for(int b = 1; b < 10; b++)	 {
			for(int a = 2; a < 10; a++) {
				System.out.print(a + "x" + b + "=" + (a*b) + "\t");
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {

		ex04();
		
	}

}
