package practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
//		조우
//		File dir = new File("/Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home");
//		File[] files = dir.listFiles();
//
//		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a hh:mm");
//
//		long totalSize = 0;
//		int count = 0;
//
//		for(int i=0; i<files.length; i++) {
//			if(files[i].isHidden() == false) {
//		String time = sdf.format(files[i].lastModified());
//
//				if(files[i].isDirectory()) {
//					System.out.println(time + "\t" + "<DIR>" + "\t\t" + files[i].getName());
//
//				} else {
//
//					System.out.println(time + "\t" + "\t" + files[i].length() +"\t"+ files[i].getName());
//					totalSize += files[i].length();
//					count++;
//
//				}
//			}
//		}
//		System.out.println("\t\t" +count+"개 파일" +"\t\t" + totalSize +"\t" +"바이트");
		
		
		File dir = new File("/Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Conten"
				+ "ts/Home");

		if(dir.exists()) {
			File[] list = dir.listFiles();
			
			int fileCount = 0;
			long totalFileSize = 0;

			for(File f : list) {
				if(f.isHidden()) {
					continue;
				}
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(f.lastModified());
				String directory = f.isDirectory() ? "<DIR>" : "";
				String size = ""; 
						if(f.isFile()){
							size = new DecimalFormat("#,##0").format(f.length()); 
							fileCount++;
							totalFileSize += f.length();
						}
				String name = f.getName();
				String result = String.format("%s%9s%9s %s\n", lastModifiedDate, directory, size, name);
				System.out.print(result);
			}
				System.out.println(fileCount + "개 파일 " + new DecimalFormat("#,##0").format(totalFileSize) + " 바이트");
		}

	}

	// 문제3. Documents에 저장된 storage를 삭제하시오.
	//		 파일이 저장된 디렉터리를 지워지지 않으므르 먼저 디렉터리에 저장된 파일을 삭제해야 한다.

	public static void ex03() {
// 조우민
//		File dir = new File("/Users/woomin/Documents/storage");
//
//		if(dir.exists()) {
//			File[] files = dir.listFiles();
//
//			for(File f : files) {
//				f.delete();
//			}
//
//			dir.delete();
//
//			if(dir.exists()) {
//				System.out.println("삭제 실패!");
//			} else {
//				System.out.println("삭제 성공!");
//			}
//		}
	
		File dir = new File("/Users/woomin/Documents/storage");
		
		File file = new File(dir, "myfile.txt");
		
		if(file.exists()) {
			file.delete();
		}
		
		if(dir.exists()) {
			dir.delete();
		}
		
		
	
	}

	public static void main(String[] args){ 
		ex02();
	}

}
