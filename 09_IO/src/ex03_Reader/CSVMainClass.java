package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVMainClass {

	public static void ex01() {
		
		File file = new File("/Users/woomin/Documents/storage", "product.csv");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line=null;
			
			List<Map<String, Object>> products = new ArrayList<>();
			
			while((line=br.readLine()) != null) {
			
				Map<String,Object> product = new HashMap<>();

				String[] items = line.split(",");
				
				product.put("model", items[0]);
				product.put("maker", items[1]);
				product.put("price", items[2]);
				
				products.add(product);
			}
			System.out.println(products);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		//  /Users/woomin/Documents/storage/product.csv 읽기
		
		File file = new File("/Users/woomin/Documents/storage", "product.csv");
				
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			List<Map<String,Object>> products = new ArrayList<>();
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				String[] items = line.split(",");
				Map<String, Object> product = new HashMap<>();
				product.put("model", items[0]);
				product.put("maker", items[1]);
				product.put("price", Integer.parseInt(items[2]));
				
				products.add(product);
			}
			
			System.out.println(products);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
