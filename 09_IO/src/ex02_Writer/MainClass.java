package ex02_Writer;

import java.io.*;

public class MainClass {

	/*
	   스트림(stream)
	   1. 데아터가 일방적으로 이동하는 통로
	   	  1) 입력스트림 : 입력만 받을 수 있다.
	   	  2) 출력스트림 : 출력만 할 수 있다.
	 */

	/*
	    Writer
	    1. 문자 기반의 출력 스트림
	    2. Writer로 끝나는 이름의 클래스는 모두 문자 기반의 출력 스트림이다.
	    3. 문자를 내보내는 스트림 - 파일, 서버 등으로 문자를 보낸다.
	 */

	public static void ex01() {

		// 디렉터리 작업
		String s = File.separator;
		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");

		if(dir.exists() == false) {
			dir.mkdirs();
		}

		// 파일 작업
		File file = new File(dir, "ex01.txt");

		// 출력 스트림 선언
		FileWriter fw = null;

		try {
			// 출력 스트림 생성 
			fw = new FileWriter(file); // 예외 처리 필수

			// 출력 스트림으로 문자 보내기
			int c = 'I';
			char[] cbuf = {' ','a','m'};
			String str = " a boy.";
			
			fw.write(c); // 예외 처리 필수
			fw.write(cbuf); // 예외 처리 필수
			fw.write(str); // 예외 처리 필수
			
			System.out.println("ex01.txt 파일이 생성되었습니다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null)
				fw.close(); // 예외 처리 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

	public static void ex001() {
		
		String s = File.separator;
		
		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex001.txt");
		
		
		try (FileWriter fw = new FileWriter(file)){
			
			String str = "나는 조우민이다.";
			
			fw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex001();
		System.out.println((char)65);
	}

}
