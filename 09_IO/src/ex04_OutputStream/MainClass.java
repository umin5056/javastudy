package ex04_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

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
				e.printStackTrace();
			}
		}
		
		System.out.println("ex02.bin 파일의 크기 : " + file.length());
	}
	
	public static void ex03() {
		
		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir, "ex03.bin");
		
		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			bos.write("반갑습니다\n 또 만나여".getBytes("UTF-8"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null)
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ex03.bin 파일의 크기 : " + file.length());
		
	}
	
	public static void ex04() {
		
		// 변수를 그대로 출력하는 DataOutputStream
		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir,"ex04.dat");
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			// 출력할 변수
			String name = "조우민";
			String called = "땅땅땅깡땅땅";
			int age = 27;
			double height = 178.9;
			boolean isAlive = true;
			
			// 출력(변수 타입에 따라서 메소드가 다름)	
			dos.writeUTF(name);
			dos.writeUTF(called);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive);
			
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
		System.out.println("ex04.dat 파일 크기 : " + file.length());
		
	}
	
	public static void ex05() {
		
		// 객체를 그대로 출력하는 ObjectOutputStream
		File dir = new File("/Users/woomin/Documents/storage");
		File file = new File(dir,"ex05.dat");
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			// 출력할 객체
			List<Person> people = Arrays.asList(
				new Person("조우민", 27, 178.9, true),
				new Person("제시", 54, 200.9, false)
			);

			Person person = new Person();
			person.setName("존슨");
			person.setAge(30);
			person.setHeight(230.5);
			person.setAlive(true);
			
			// 출력하는 코드
			oos.writeObject(people);
			oos.writeObject(person);
			
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ex05.dat 파일 크기 : " + file.length());
		
	}
	
	public static void main(String[] args) {
		ex05();
	}
}
