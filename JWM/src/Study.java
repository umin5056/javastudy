import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Study {
	public static void main(String[] args) {
		
		String apiURL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";

		URL url = null;
		HttpURLConnection con = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				in = new BufferedInputStream((con.getInputStream()));
			}else {
				in = new BufferedInputStream((con.getErrorStream()));
			}
			
			out = new BufferedOutputStream(new FileOutputStream("/Users/woomin/Documents/storage/날씨정보.xml"));
			
			byte[] ch = new byte[30];
			int readCount = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readCount = in.read(ch)) != -1) {
				out.write(ch, 0, readCount);
			}
			
			
			out.close();
			in.close();
			con.disconnect();
			
		}catch(Exception e) {
			
		}
	
	
	
	
	
	}
}
