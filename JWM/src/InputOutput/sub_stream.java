package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class sub_stream {

	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("/Users/woomin/Documents/GDJ61/javastudy/JWM/test.txt",true);
			 InputStream is = new FileInputStream("/Users/woomin/Documents/GDJ61/javastudy/JWM/test.txt")){
			
			Writer writer = new OutputStreamWriter(os,"UTF-8");
			
			String str = "문자 변환이거";

			writer.write(str);
			
			Reader reader = new InputStreamReader(is);

			char[] data = new char[30];
			
			int num = reader.read(data);
			
			String str1 = new String(data, 0, num);
			
			System.out.println(str1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
