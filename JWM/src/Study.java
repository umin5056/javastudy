import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Study {
	public static void main(String[] args) {
		
		String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			out = new BufferedWriter(new FileWriter("/Users/woomin/Documents/storage2/날씨.xml"));
			
			int code = con.getResponseCode();
			
			if(code == HttpURLConnection.HTTP_OK) {
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}
			
			char[] ch = new char[5];
			int readCount = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readCount = in.read(ch)) != -1 ) {
				sb.append(ch, 0, readCount);
			}
			
			out.write(sb.toString());
			
			out.close();
			in.close();
			con.disconnect();
			
		}catch(Exception e) {
			
		}
		
	}
}
