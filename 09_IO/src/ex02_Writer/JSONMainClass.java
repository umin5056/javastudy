package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass {
	/*
		   JSON
		   1. JavaScript Object Notation
		   2. 객체는 { }로 표기하고, 배열은 [ ]로 표기한다.
		   3. Property와 Value로 데이터를 구성한다.
	 */

	/*
		   JSON-Java (JSON in Java) 라이브러리
		   1. 객체 : JSONObject 클래스 (Map 기반으로 제작된 클래스)
		   2. 배열 : JSONArray 클래스 
	 */

	public static void ex01() {
		// 목표.
		/*
		    {
		    	"model" : "세탁기",
		    	"maker" : "삼성",
		    	"price" : 100
		    }
		 */

		JSONObject product = new JSONObject();

		product.put("model", "세탁기");
		product.put("maker", "삼성");
		product.put("price", 100);

	}

	public static void ex02() {
		// 목표.
		/*
		   [
			    {
			    	"model" : "세탁기",
			    	"maker" : "삼성",
			    	"price" : 100
			    },
			    {
			    	"model" : "냉장고",
			    	"maker" : "LG",
			    	"price" : 100
			    }
		    ]
		 */
		
		JSONObject product1 = new JSONObject();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		JSONObject product2 = new JSONObject();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);
		
		JSONArray products = new JSONArray();
		products.put(product1);
		products.put(product2);
	
		System.out.println(products.toString());
		System.out.println(products);
		
	}

	public static void ex03() {
		// {"name":"james","age":30,"height":180.5,"isAlice":true}
		
		// String 형태의 JSON (외부에 기재하고 복붙하면 알아서 "\"를 붙여줌)
		String str = "{\"name\":\"james\",\"age\":30,\"height\":180.5,\"isAlive\":true}";
		
		//JSONObject 객체 생성
		JSONObject obj = new JSONObject(str);
		
		// JSONObject 객체를 구성하는 Property 값을 이용해 Value 가져오기
		String name = obj.getString("name");
		int age = obj.getInt("age");
		double height = obj.getDouble("height");
		boolean isAlive = obj.getBoolean("isAlive");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(isAlive);
		
		
	}
	
	public static void ex04() {
//		[{"model":"세탁기","maker":"삼성","price":100},{"model":"냉장고","maker":"LG","price":200}]
				
		// String 형식의 JSON 데이터 배열
		String str = "[{\"model\":\"세탁기\",\"maker\":\"삼성\",\"price\":100},{\"model\":\"냉장고\",\"maker\":\"LG\",\"price\":200}]";		
			
		// JSONArray 객체 생성
		JSONArray products = new JSONArray(str);
		
		// 1. 일반 for문
		for(int i=0; i<products.length();i++) {
			JSONObject obj = products.getJSONObject(i);
			String model = obj.getString("model");
			String maker = obj.getString("maker");
			int price = obj.getInt("price");
			
			System.out.println(model + "," + maker + "," + price);
		}
		// 2. 향상된 for문
		for(Object obj : products) {
			JSONObject product = (JSONObject)obj;
			String model = product.getString("model");
			String maker = product.getString("maker");
			int price = product.getInt("price");
			System.out.println(model + "," + maker + "," + price);
			
		}
		
		
	}
	
	public static void ex004() {
		
		String str = "[{\"model\":\"세탁기\",\"maker\":\"삼성\",\"price\":100},{\"model\":\"냉장고\",\"maker\":\"LG\",\"price\":200}]";
		
		JSONArray products = new JSONArray(str);
		
		for(int i=0; i < products.length(); i++) {
			
			String model = products.getJSONObject(i).getString("model");
			String maker = products.getJSONObject(i).getString("maker");
			int price = products.getJSONObject(i).getInt("price");
			
			System.out.println(model + "," + maker + "," + price);
			
		}
		
		
	}
	
	public static void ex05() {
		
		Map<String, Object> product1 = new HashMap<>();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<>();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);
		
		Map<String, Object> product3 = new HashMap<>();
		product3.put("model", "TV");
		product3.put("maker", "삼성");
		product3.put("price", 300);
		
		List<Map<String, Object>> products = Arrays.asList(product1, product2, product3);
		
		JSONArray arr = new JSONArray(products);
		
		String json = arr.toString();
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"product.json");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			
			bw.write(json);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		ex05();

	}

}















