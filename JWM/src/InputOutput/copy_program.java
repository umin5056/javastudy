package InputOutput;

import java.io.*;
import java.util.Arrays;

public class copy_program {

	public static void main(String[] args) {
		
		String origin = "/Users/woomin/Documents/GDJ61/javastudy/JWM/test.png";
		String copy = "/Users/woomin/Documents/GDJ61/javastudy/JWM/test_copy.png";
		
		try (InputStream is = new FileInputStream(origin);
			OutputStream os = new FileOutputStream(copy);) {
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				
				os.write(data,0,num);
			}
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
