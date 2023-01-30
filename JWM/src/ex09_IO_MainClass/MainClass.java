package ex09_IO_MainClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass {

	public static void write() {

		File file = new File("/Users/woomin/Documents/storage", "IO_Practice.txt");

		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){

			br.write("집에서 연습하는 버퍼드리더를 배열이용해 읽기!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void read() {

		File file = new File("/Users/woomin/Documents/storage", "IO_Practice.txt");

		StringBuilder sb = new StringBuilder();
		char[] chbf = new char[4];
		int readCount = 0;

		try(BufferedReader br = new BufferedReader(new FileReader(file))){

			while((readCount = br.read(chbf)) != -1) {

				for(int i=0; i<readCount; i++) {
					sb.append(chbf[i]);
				}
			}
			System.out.print(sb);

		}catch (IOException e) {
			e.printStackTrace();
		}


	}

	public static void CSVread() {
		File file = new File("/Users/woomin/Documents/storage", "product.csv");

		List<Map<String, Object>> list = new ArrayList<>();

		String line = null;

		try(BufferedReader br = new BufferedReader(new FileReader(file))) {

			Map<String, Object> product = new HashMap<>();

			String[] values = new String[3];

			while((line = br.readLine()) != null) {

				values = line.split(",");

				product.put("model", values[0]);
				product.put("maker", values[1]);
				product.put("price", values[2]);

				list.add(product);
			}

			System.out.println(list);

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void JSONread() {

		File file = new File("/Users/woomin/Documents/storage", "product.json");

		try(BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = null;
			StringBuilder sb = new StringBuilder();

			while((line = br.readLine()) != null) {
				sb.append(line);
			}

			JSONArray arr = new JSONArray(sb.toString());

			List<Map<String,Object>> products = new ArrayList<>();
			Map<String, Object> product = null;

			for(int i=0; i<arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				product = obj.toMap();

				products.add(product);
			}

			System.out.println(products);



		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void OutputStream() {

		// FileOutputStream을 이용해서 bin 파일 만들기
		File file = new File("/Users/woomin/Documents/storage2", "ex01.bin");

		try(FileOutputStream fos = new FileOutputStream(file)) {

			int c = 'A';
			String str = "pple";

			byte[] b = str.getBytes();

			fos.write(c);
			fos.write(b);
			System.out.println("파일 크기 : " + file.length());


		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void OpsK() {

		File file = new File("/Users/woomin/Documents/storage2", "opsk.txt");

		try (FileOutputStream fos = new FileOutputStream(file)) {

			String str = "안녕gktpdy";

			byte[] b = str.getBytes();

			fos.write(b);

		}catch(IOException e) {
			e.printStackTrace();

		}

	}

	public static void BOps() {

		File file = new File("/Users/woomin/Documents/storage2", "BOps.txt");

		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {

			String str = "안녕하세용";
			byte[] b = str.getBytes("UTF-8");

			bos.write(b);
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 크기 : " + file.length());

	}

	public static void dops() {
		File file = new File("/Users/woomin/Documents/storage2", "dops.txt");

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {

			String name = "조우민";
			int age = 27;
			double height = 178.9;
			boolean live = true;

			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(live);

		}catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 크기 : " + file.length());
	}

	public static void oops() {

		File file = new File("/Users/woomin/Documents/storage2", "oops.txt");

		try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file))) {


			List<Person> people = Arrays.asList(
					new Person("조우민", 27, 178.9, true),
					new Person("제시", 54, 200.9, false)
					);

			Person person = new Person();

			person.setName("깍두기");
			person.setAge(33);
			person.setHeight(100.3);
			person.setAlive(false);

			obj.writeObject(person);
			obj.writeObject(people);



		}catch(IOException e) { 
			e.printStackTrace();
		}


	}

	public static void ex01() {

		File file = new File("/Users/woomin/Documents/storage", "ex02.bin");

		try (InputStreamReader fis = new InputStreamReader(new FileInputStream(file))) {

			char[] b = new char[4];

			int readByte = 0;
			StringBuilder sb = new StringBuilder();

			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}

			System.out.println(sb.toString());



		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ex001() {
		File file = new File("/Users/woomin/Documents/storage", "ex02.bin");

		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(file))) {

			char[] ch = new char[3];
			int readCount = 0;
			StringBuilder sb = new StringBuilder();

			while((readCount = isr.read(ch)) != -1) {
				sb.append(new String(ch,0,readCount));
			}

			System.out.println(sb.toString());


		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ex02() {

		File file = new File("/Users/woomin/Documents/storage", "ex03.bin");

		try (InputStreamReader bis = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)))) {

			char[] b = new char[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();

			while((readByte = bis.read(b)) != -1) {

				sb.append(new String(b, 0, readByte));

			}
			System.out.println(sb);


		}catch (IOException e) {
			e.printStackTrace();
		}



	}

	public static void ex03() {// 

		File file = new File("/Users/woomin/Documents/storage", "ex04.dat");

		try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
			
			String name = dis.readUTF();
			String called = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			boolean live = dis.readBoolean();
			String a;
			
			while(( a = dis.readUTF()) != null) {
				System.out.println(a);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex04() {
		
		File file = new File("/Users/woomin/Documents/storage", "ex05.dat");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			
			List<Person> people = (List<Person>) ois.readObject();
			Person person = (Person)ois.readObject();
			
			System.out.println(people);
			System.out.println(person);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
//		write();
//		read();
//		CSVread();
//		JSONread();
//		OutputStream();
//		OpsK();
//		BOps();
//		dops();
//		oops();
		ex04();

	}

}
