package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

/*
    Reader
    1. 문자 기반의 입력 스트림
    2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다.
    3. 문자를 읽어 들이 스트림 - 파일, 서버 등으로 문자를 읽는다.
*/
	public static void ex01() {
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"ex01.txt");
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);

			int c; // 1글자를 저장할 변수
			StringBuilder sb = new StringBuilder();
			
			while((c = fr.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());
		}catch(IOException e) { // FileNotFoundException도 함께 처리 (IOException의 자식임)
			e.printStackTrace();
		} finally {
			try {
				if(fr != null);
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ex001() {
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		int c;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			while (true) {
				c = br.read();
				if(c == -1) break;
				
				System.out.print((char)c);
			}
//			try(FileReader fr = new FileReader(file)) {
//				
//				while (true) {
//					c = fr.read();
//					if(c == -1) break;
//					
//					System.out.print((char)c);
//				}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void ex0001() {
		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir, "ex01.txt");
		
		StringBuilder sb = new StringBuilder();
		
		int c;
		try(FileReader fr = new FileReader(file)) {
			while((c = fr.read()) != -1) {
				sb.append((char)c);
			}
			
			System.out.println(sb);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex02() {
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir,"ex02.txt");
		
		try(FileReader fr = new FileReader(file)) {
			
			char[] cbuf = new char[5]; // 5글자를 읽어 들이는 배열
			int readCount; // 실제로 읽은 글자의 개수
			StringBuilder sb = new StringBuilder();
			
			while((readCount = fr.read(cbuf)) != -1) {
				
				sb.append(cbuf, 0, readCount); // idx0부터 readCount개 글자를 sb 더하는 메소드
				
				/*
				    ex02.txt 읽는 과정
				    회	readCount	cbuf
				    1	5			a b c d e
				    2 	2			f g c d e
				    3 	-1			
				 */
				// for문으로 출력하는 방법
//				for(int i=0; i < readCount; i++) {
//					System.out.println(cbuf[i]);
//				}
			} // while
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void ex03() {
		
		/*
		   BufferedReader의 장점
		   1. 속도가 빠르다.
		   2. readLine 메소드를 사용할 수 있다.
		 */
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex03.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			System.out.println(sb.toString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}













