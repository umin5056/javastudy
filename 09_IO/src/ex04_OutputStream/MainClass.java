package ex04_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainClass {
	/*
	   출력 단위
	   1. int	 : 1개
	   2. byte[] : 2개 이상
	 */
	
	public static void ex01() {
		
		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir, "ex01.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			int c = 'A';
			String str = "pple";
			byte[] b = str.getBytes();
			
			fos.write(c);
			fos.write(b);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fos != null) {
					fos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	
	public static void ex02() {

		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir, "ex02.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			String str = "안녕하세요";
			
			// getBytes(CharSet charset) : 텍스트 인코딩 설정 방법1, jdk 1.7부터 사용 가능
			byte[] b = str.getBytes(StandardCharsets.UTF_8);
			
			// getBytes(String charsetName) : 텍스트 인코딩 설정 방법2, jdk 1.1부터 사용 가능
			// byte[] b = str.getBytes("UTF-8");
			
			fos.write(b);
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("ex02.bin 파일의 크기 : " + file.length());
	}
	

	public static void main(String[] args) {
	
		
		ex02();

	
	}
}
