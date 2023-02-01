package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class MAIN2 {

	public static void main(String[] args) {
		
		String serviceKey = "aOJrKq8Gmbtj4fbbnazrR4UFB1CRl4gcsdQLaM+1A/ygF3r7EVOrIGy2LgOclgIMb2XHdGOHa9OcHBQoUx1a/g==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&returnType=json";
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "apllication/json; charset=UTF-8");
			
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}

			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			JSONObject obj = new JSONObject(sb.toString());
			
			System.out.println(obj);
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
