package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void ex01() {

		File file = new File("/Users/woomin/Documents/storage", "ex01.bin");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			// 입력 단위
			// 1. int : 1개
			// 2. byte[] : 2개 이상

			int c = 0;
			StringBuilder sb = new StringBuilder();

			while((c = fis.read()) != -1)  {
				sb.append((char)c);
			}

			System.out.println(sb);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void ex02() {

		// 원래 깨져서 출력됨 (바이트 스트림과 한글 처리의 문제)

		File file = new File("/Users/woomin/Documents/storage", "ex02.bin");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			byte[] b = new byte[4]; // 한 번에 4바이트를 읽어 오시오. (한글은 글자당 3바이트인데 4바이트씩 읽어서 깨짐)
			// 배열의 크기를 3바이트로 하면 정상 출력은 되지만 근본적인 해결은 아님 (띄어쓰기와 영어가 들어간 경우 깨짐)

			int readByte = 0; 		// 실제로 읽은 바이트

			StringBuilder sb = new StringBuilder();

			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}
			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void ex02_complete() {

		// 바이트 입력 스트림을 문자 입력 스트림으로 변환하는 InputStreamReader

		File file = new File("/Users/woomin/Documents/storage", "ex02.bin");

		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(new FileInputStream(file));

			char[] cbuf = new char[4]; // 한 번에 4글자를 읽어 오시오.
			int readCount = 0; 		// 실제로 읽은 글자 수

			StringBuilder sb = new StringBuilder();

			while((readCount = isr.read(cbuf)) != -1) {
				sb.append(new String(cbuf, 0, readCount));
			}
			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

	public static void ex03() {

		File file = new File("/Users/woomin/Documents/storage", "ex03.bin");

		BufferedInputStream bis = null;

		try {
			bis = new BufferedInputStream(new FileInputStream(file));

			byte[] b = new byte[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();

			while((readByte = bis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}

			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)	bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void ex03_complete() {
		
		File file = new File("/Users/woomin/Documents/storage", "ex03.bin");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			int readCount = 0;
			
			while((line = br.readLine()) != null) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ex03_complete();
	}

}
