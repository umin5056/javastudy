package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class MainClass {

	/* 문제1. 현재 시간을 이용하여 디렉터리를 생성하시오.
	   예시) User/14/32/30
	 */

	public static void ex001() {

		Calendar now = Calendar.getInstance();

		String hour = Integer.toString(now.get(Calendar.HOUR_OF_DAY));
		String min = Integer.toString(now.get(Calendar.MINUTE));
		String sec = Integer.toString(now.get(Calendar.SECOND));

		File dir = new File("/Users/woomin/Documents/" + hour + "/" + min + "/" + sec);

		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("생성");
		} else {
			dir.deleteOnExit();
			System.out.println("삭제");
		}

	}

	public static void ex01() {

		String s = File.separator;

		LocalTime now = LocalTime.now();

		int hour = now.getHour();
		int min = now.getMinute();
		int sec = now.getSecond();

		//		File dir = new File("/Users/woomin/Documents/" + hour + "/" + min + "/" + sec);
		File dir = new File(s + "Users" + s +"woomin" + s + "Documents" + s + "storage");

		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("생성 완료");
		}




	}

	/* 문제2.  /Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home의 파일을 출력

		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
	 */

	public static void ex02() {

		File dir = new File("/Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home");
		File[] files = dir.listFiles();

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a hh:mm");

		String time = sdf.format(now);
		long totalSize = 0;
		int count = 0;

		for(int i=0; i<files.length; i++) {
			if(files[i].isHidden() == false) {

				if(files[i].isDirectory()) {
					System.out.println(time + "\t" + "<DIR>" + "\t\t" + files[i].getName());
				} else {
					System.out.println(time + "\t" + "\t" + files[i].length() +"\t"+ files[i].getName());
					totalSize += files[i].length();
					count++;
				}
			}
		}
		System.out.println("\t\t" +count+"개 파일" +"\t\t" + totalSize +"\t" +"바이트");
	}

	// 문제3. Documents에 저장된 storage를 삭제하시오.
	//		 파일이 저장된 디렉터리를 지워지지 않으므르 먼저 디렉터리에 저장된 파일을 삭제해야 한다.

	public static void ex03() {

		File dir = new File("/Users/woomin/Documents/storage");


		if(dir.exists()) {
			File[] files = dir.listFiles();

			for(File f : files) {
				f.delete();
			}

			dir.delete();

			if(dir.exists()) {
				System.out.println("삭제 실패!");
			} else {
				System.out.println("삭제 성공!");
			}
		}
	}

	public static void main(String[] args){ // main 메소드를 호출한 곳으로 예외처리를 넘긴다. (개발자가 try-catch 하지 않겠다.)
		ex02();
	}

}
