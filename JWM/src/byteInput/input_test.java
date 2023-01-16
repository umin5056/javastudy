package byteInput;

import java.io.*;
import java.util.Arrays;

public class input_test {

	public static void main(String[] args) {

		try (InputStream is = new FileInputStream("/Users/woomin/Documents/GDJ61/javastudy/JWM/test.db");){

			byte[] data = new byte[2];
			
			while(true) {

				int num = is.read(data);
				if(num == -1) break;
				System.out.println(num);
				System.out.println(Arrays.toString(data));

			}
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
	
	
}
