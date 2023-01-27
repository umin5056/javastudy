package java_remind;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {

		Map<String, Object> boy = new HashMap<>();
		boy.put("name", "조우민");
		boy.put("age", 27);
		boy.put("gender", "남자");
		
		Map<String, Object> girl = new HashMap<>();
		girl.put("name", "김희조");
		girl.put("age", 30);
		girl.put("gender", "여자");
		
		List<Map<String, Object>> couple = Arrays.asList(boy,girl);
		
		File dir = new File("/Users/woomin/Documents/storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "couple.txt");
		
		try(PrintWriter out = new PrintWriter(file)) {
			
			for(Map<String, Object> map : couple) {
				for(Entry<String,Object> entry : map.entrySet()) {
					out.println(entry.getKey() + " : " + entry.getValue() + " ");
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

