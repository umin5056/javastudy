package ex09_IO_MainClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
	
	public static void main(String[] args) {
//		write();
//		read();
//		CSVread();
		JSONread();
		
	}

}
