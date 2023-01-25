package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MainClass {

	/*
	   File 클래스
	   1. java.io 패키지 
	   2. 파일, 디렉터리(폴더)를 관리하는 클래스
	   3. 객체 생성 방법
	      1) new File(경로, 파일명)
	      2) new File(파일명)
	   4. 경로 구분 방법
	      1) 윈도우 : 역슬래시(\)
	      2) 리눅스 : 슬래시(/)
	 */
	
	public static void ex01() {
		
		// File.separator : 플랫폼에 따라 자동으로 경로 구분자를 사용한다.
		
		// 디렉터리 관련 필수 작업
		File dir = new File("/Users/woomin/Documents/storage"); // Documents 밑에 storage 폴더를 의미.
//		File dir = new File("/Users" +File.separator + "storage"); // Users 밑에 storage 폴더를 의미.
		
		// 없으면 만들고, 있으면 지운다.
		if(dir.exists() == false) {
			dir.mkdirs(); // 폴더를 생성한다.
			System.out.println("/Users/woomin/Documents/storage 생성 완료");
		} else {
//			dir.delete(); // 지금 바로 지운다.
			dir.deleteOnExit(); // JVM 실행이 끝나면 지운다.
			System.out.println("/Users/woomin/Documents/storage 삭제 완료");
		}
		
	}
	
	public static void ex02() throws IOException {// ex02 메소드를 호출한 곳으로 예외처리를 넘긴다.
		String s = File.separator;

		File dir = new File(s + "Users" + s +"woomin" + s + "Documents" + s);
		if(dir.exists() == false) {
			dir.mkdirs();
		}

		File file = new File(dir,"myfile.txt");
		if(file.exists() == false) {
			file.createNewFile(); // 반드시 예외처리가 필요한 코드
		} else {
			file.delete();
		}

	}

	public static void ex03() throws IOException {
		String s = File.separator;
		File dir = new File(s + "Users" + s +"woomin" + s + "Documents" + s + "storage");

		if(dir.exists() == false) {
			dir.mkdirs();
		}

		File file = new File(dir,"myfile.txt");
		if(file.exists()==false) {
			file.createNewFile();
		}

		// 파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath()); // 파일 + 디렉터리
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		long lastModified = file.lastModified(); // 최종 수정일의 타임스탬프
		System.out.println("최종수정일 : " + lastModified);
		
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(lastModified);
		System.out.println("최종수정일 : " + lastModifiedDate);
		
		long size = file.length(); // 파일의 크기가 byte 단위로 저장
		long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
		System.out.println("파일크기 : " + kb + "KB"); // KB단위로 출력 (1024byte == 1KB)
		
		
		
	
	}	

	
	
	public static void ex04() {
		String s = File.separator;
		File dir = new File(s + "Users" + s +"woomin" + s + "Library");

		File[] files = dir.listFiles();
		Arrays.sort(files);
		for(int i=0; i<files.length; i++) {
			if(files[i].isHidden() == false)
			System.out.println(files[i].getName());
		}
	}
	
	public static void main(String[] args) throws IOException {
		ex04();
		
		
	}

}
