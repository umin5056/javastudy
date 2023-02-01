package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

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
			
			writer = new BufferedWriter(new FileWriter("/Users/woomin/Documents/storage/지역날씨정보.json"));
			
			writer.write(sb.toString());
			
			writer.close();
			
			System.out.println("지역 날씨 정보 생성");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
