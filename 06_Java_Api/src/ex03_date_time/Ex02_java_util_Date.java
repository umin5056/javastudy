package ex03_date_time;

import java.util.Date;

public class Ex02_java_util_Date {

	public static void main(String[] args) {

		Date now = new Date(System.currentTimeMillis());
		Date now2 = new Date();
		System.out.println(now);
		System.out.println(now2);
		
		System.out.println(now.equals(now2));
		
	}

}
