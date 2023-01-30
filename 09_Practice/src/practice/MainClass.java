package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

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
		//		조우민
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

	// 문제4. 사용자로부터 입력 받은 문자열을 Documents/storage/diary.txt로 보내시오.
	// 		 총 5개 문장을 입력 받아서 보내시오.
	public static void ex04() {
		Scanner sc = new Scanner(System.in);

		String[] str = new String[5];
		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents" + s + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}

		File file = new File(dir,"diary.txt");

		for(int i=0; i<str.length; i++) {
			System.out.print("내용을 입력하세요 >>>");
			str[i] = sc.nextLine();
		}

		try (PrintWriter out = new PrintWriter(file)) {
			for(String write : str) {
				out.println(write);
			}

			System.out.println("다이어리 작성 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

	public static void ex004() {

		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents" + s + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}

		File file = new File(dir, "test.txt");

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("테스트 텍스트파일 작성입니다.");

		}catch (IOException e) {
			e.printStackTrace();
		}


	}

	// 문제5. 예외가 발생한 경우 예외 메시지와 예외 발생시간을 저장한 storage/log.txt 생성
	public static void ex05() {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("1번째 정수 입력 >>> ");
			int a = sc.nextInt();

			System.out.print("2번째 정수 입력 >>> ");
			int b = sc.nextInt();

			int add = a + b;
			int sub = a - b;
			int mul = a * b;
			int div = a / b;

			System.out.println(a + "+" + b + "=" + add);
			System.out.println(a + "-" + b + "=" + sub);
			System.out.println(a + "*" + b + "=" + mul);
			System.out.println(a + "/" + b + "=" + div);

		}catch (Exception e) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
			String msg = dtf.format(now);

			// 예외 클래스 이름
			String className = e.getClass().getName();
			// 예외 메세지
			String pst = e.getMessage();

			//로그 파일 만들기
			String s = File.separator;

			File dir = new File(s + "Users" + s + "woomin" + s + "Documents" + s + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}

			File file = new File(dir, "log.txt");

			// 생성 모드 (언제나 새로 만든다) : new FileWriter(file)
			// 추가 모드 (기존 내용을 추가한다) : new FileWriter(file, true) 

			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){

				bw.write(msg + " " + className + " " + pst + "\n"); // bw.newLine(); \n을 대신할 수 있는 코드 


				System.out.println("예외처리 기재 완료");

			}catch(IOException ioe) {
				ioe.printStackTrace();
			}


		}
		sc.close();
	}

	// 문제6. diary.txt 파일을 다른 폴더에 이동시키기
	public static void ex06() {
		File file = new File("/Users/woomin/Documents/storage", "diary.txt");

		StringBuilder sb = new StringBuilder();
		String line = null;

		try(BufferedReader br = new BufferedReader(new FileReader(file))) {

			while((line = br.readLine()) != null){
				sb.append(line + "\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		// 읽기 완료
		File copy = new File("/Users/woomin/Documents/", "diary.txt");

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(copy))) {

			bw.write(sb.toString());

		}catch (IOException e) {
			e.printStackTrace();
		}


		if(file.exists()) {
			file.delete();
		}


		// 선생님방법
		//		File from = new File("/Users/woomin/Documents/storage", "diary.txt");		
		//
		//		File toDir = new File("/Users/woomin/Documents/storage2");
		//		if(toDir.exists() == false) {
		//			toDir.mkdirs();
		//		}
		//		File to = new File(toDir, from.getName());
		//
		//		BufferedReader br = null;
		//		BufferedWriter bw = null;
		//
		//		try {
		//
		//			long startTime = System.currentTimeMillis();
		//
		//			br = new BufferedReader(new FileReader(from));
		//			bw = new BufferedWriter(new FileWriter(to));
		//
		//			String line = null;
		//			while((line = br.readLine()) != null) {
		//				bw.write(line);
		//				bw.newLine();
		//			}
		//
		//			bw.close();
		//			br.close();	
		//
		//			if(from.length() == to.length()) {  // 복사 성공했다면 삭제
		//				from.deleteOnExit();
		//			}
		//
		//			long stopTime = System.currentTimeMillis();
		//
		//			System.out.println("이동에 걸린 시간 : " + (stopTime - startTime) + "밀리초");
		//
		//		} catch(IOException e) {
		//			e.printStackTrace();
		//		} 

	}

	/*
	   문제7. System.in은 키보드로부터 byte 데이터를 입력받는 InputStream이다.
	         System.in으로부터 문장 1개를 입력 받아서 출력하시오.
	         Scanner 대신 BufferedReader를 사용하시오.
	 */
	public static void ex07() {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("문장을 입력하시오 >>>");
			String str = br.readLine();
			
			System.out.println("입력된 문장 : " + str);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/*
	   문제8. "안녕하세요. 반갑습니다."를 출력하시오.
	         DataInputStream / DateOutputStream을 사용하시오.
	 */
	public static void ex08() {
		
		DataInputStream dis = null;
		
		try {
			
			
			System.out.println("입력하신 문장은 : ");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	/*
	   문제9. installer의 CodingFonts.zip 파일을 
	   		 storage폴더로 Fonts.zip으로 복사하시오.
	 */
	public static void ex09() {
		
		File from = new File("/Users/woomin/Documents/GDJ61/installer", "CodingFonts.zip");
		File to = new File("/Users/woomin/Documents/storage", "Fonts2.zip");
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			bis = new BufferedInputStream(new FileInputStream(from));
			bos = new BufferedOutputStream(new FileOutputStream(to));
			byte[] b = new byte[1024]; // 1키로바이트씩 이동
			int readByte = 0;
			
			while((readByte = bis.read(b)) != -1) {
				bos.write(b);
			}
			

			System.out.println("복사");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null && bis != null) {
					bis.close();
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	
	public static void main(String[] args){ 
		ex09();
	}

}



































