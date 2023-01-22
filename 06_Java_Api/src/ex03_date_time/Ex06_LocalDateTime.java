package ex03_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDateTime {
	/*
		   날짜 : java.time.LocalDate
		   시간 : java.time.LocalTime
		   둘다 : java.time.LocalDateTime
	 */
	
	public static void ex01() {
		
		// LocalDate
		
		LocalDate date1 = LocalDate.now(); // 현재
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2024, 1, 17); // 날짜 지정
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.parse("2025-01-17"); // 문자열 기본 형식 : yyyy-MM-dd로 기재
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("2026/01/17",DateTimeFormatter.ofPattern("yyyy/MM/dd")); // 문자열 입력 형식 지정, 출력은 기본 형식	임
		System.out.println(date4);
		
	}
	
	public static void ex02() {
		
		// LocalTime
		
		LocalTime time1 = LocalTime.now(); // 현재 시간 (나노초까지 출력) 	
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(14, 38, 10); // 시간 지정
		System.out.println(time2);
		
		LocalTime time3 = LocalTime.parse("06:06:06"); // 14시 40분 30초
		System.out.println(time3);
		
		
	}
	
	public static void ex03() {
		
		// LocalDateTime
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2023, 1, 17, 15, 4, 30);
		System.out.println(dateTime2);
		
		LocalDateTime dateTime3 = LocalDateTime.parse("2023-01-17T15:04:30");
		System.out.println(dateTime3);
		
	}
	
	public static void ex04() {
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String strnow = dtf.format(now);
		
		System.out.println(strnow);
		
	}
	
	public static void ex05() {
		
		LocalDateTime now = LocalDateTime.now();
		
		// 년 월 일 시 분 초
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		
	}

	public static void main(String[] args) {
		ex01();
	}

}
