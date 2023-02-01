package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class JSONMainClass {

	public static void ex01() {
		
		String serviceKey = "aOJrKq8Gmbtj4fbbnazrR4UFB1CRl4gcsdQLaM+1A/ygF3r7EVOrIGy2LgOclgIMb2XHdGOHa9OcHBQoUx1a/g==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			apiURL +="?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL +="&returnType=json"; 
			apiURL +="&sidoName=" + URLEncoder.encode("서울", "UTF-8");
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			
			if(responseCode == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
//			System.out.println(sb.toString());
			
			// body의 값을 가져오는 두가지 방법
			// 58~60줄보다는 62줄을 권장한다.	
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject obj2 = obj.getJSONObject("response");
			JSONObject obj3 = obj2.getJSONObject("body");
			
			JSONObject body = obj.getJSONObject("response").getJSONObject("body");
			
			System.out.println(body);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
