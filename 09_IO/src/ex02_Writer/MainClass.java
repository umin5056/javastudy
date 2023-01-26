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

	public static void ex02() {
		/*
		    try-catch-resources문
		    1. 사용한 스트림을 자동으로 닫아 주는 try문이다.
		    2. 형식
		        try (스트림 생성) {
		       		실행코드
		        }catch(Exception e) {
		        	e.printStackTrace();
		        }
		 */

		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"ex02.txt");
		
		try(FileWriter fw = new FileWriter(file)) {
			
			char[] cbuf = {'a','b','c','d','e'};
			String str = "abcde";
			
			fw.write(cbuf,1,2); // idx 0부터 2글자만 보내시오.
			fw.write(str,2,3);  // idx 2부터 3글자만 보내시오.
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void ex03() {
		/* 
		   BufferedWriter
		   1. 내부 버퍼를 가지고 있는 Writer
		   2. 속도 향상을 위해서 사용
		   3. 보조스트림이므로 메인스트림과 함께 사용해야 함
		 */
		
		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");

		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		// 메인 스트림 선언
		FileWriter fw = null;
		
		// 보조 스트림 선언
		BufferedWriter bw = null;
		
		try {
			// 메인 스트림 생성
			fw = new FileWriter(file);
			// 보조 스트림 생성
			bw = new BufferedWriter(fw);

			// 보조 스트림을 사용해서 문자로 보내기
			bw.write("Hello World");
			System.out.println("ex03.txt 파일이 생성되었습니다.");
		
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 사용한 경우 보조 스트림만 닫으면 메인 스트림도 함께 닫힌다.
				if(bw != null) {
					bw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex04() {
		
		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");
		
		if(dir.exists() == false ) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex04.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			
			bw.write("보조스트림을 이용한 try catch resource문~~");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void ex05() {
		
		/*
		   PrintWriter
		   1. print(), println() 메소드를 지원하는 Writer이다.
		   2. 줄 바꿈이 자주 필요한 경우에 println() 메소드 사용을 위해서 사용한다.
		 */
		
		String s = File.separator;

		File dir = new File(s + "Users" + s + "woomin" + s + "Documents");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"ex05.txt");
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(file);
			
			// 자동 줄바꿈이 사용되는 println 메소드
			out.println("안녕하세요");
			out.println("반갑습니다.");
			
			System.out.println("ex05 파일 생성");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close(); // close 메소드 내부에서 이미 IOEception을 처리.
		}
		
		
	}
	
	public static void main(String[] args) {
		ex05();


	
	
	
	
	
	
	
	
	}

}
