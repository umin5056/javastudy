package ex09_IO_MainClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	
	public static void write() {
		
		File file = new File("/Users/woomin/Documents/storage", "diary2.txt");
		
		try(PrintWriter pw = new PrintWriter(file)) {
			
			pw.println("내용을 입력합니다.");
			pw.println("저녁을 먹었습니다.");
			pw.println("아침은 굶는편이다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void read() {

		File file = new File("/Users/woomin/Documents/storage", "diary2.txt");

		StringBuilder sb = new StringBuilder();
		String line = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {

			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			System.out.println(sb);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void CSVread() {
		File file = new File("/Users/woomin/Documents/storage", "product.csv");
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String[] keies = {"model", "maker", "price"};
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				Map<String, Object> product = new HashMap<>();
				
				String[] values = line.split(",");
				for(int i=0; i<values.length; i++) {
					product.put(keies[i], values[i]);
				}
				
				list.add(product);
				
			}
			System.out.println(list);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {

		CSVread();
		
	}

}
