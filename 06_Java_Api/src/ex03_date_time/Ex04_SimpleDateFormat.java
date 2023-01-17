package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat {
	
	/*  
		형식 (2023년 01월 17일 화요일 14:08 기준)
		01. yy	 : 23
		02. yyyy : 2023
		03. M	 : 1	(1~12)
		04. MM	 : 01	(01~12)
		05. MMM	 : 1월
		06. d	 : 17	(1~31)
		07. dd	 : 17	(01~31)
		08. E	 : 화
		09. a	 : 오후
		10. h	 : 2	(1~12)
		11. hh 	 : 02	(01~12)
		12. H	 : 14	(0~23)
		13. HH	 : 14	(00~23)
		14. m	 : 8	(0~59)
		15. mm 	 : 08	(00~59)
		16. s	 : 30	(0~59)
		17. ss	 : 30	(00~59)
	 */

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-M-d HH:m:s");
		
		String strnow = sdf.format(now);
		
		System.out.println(strnow);
		
		
		
		
		Date bday = new Date(97, 0, 17, 5, 32,20);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy : MM : dd : a : HH : mm : ss");
		
		String bDay = sdf2.format(bday);
		
		System.out.println(bDay);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
