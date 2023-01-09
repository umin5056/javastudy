package byteInput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class input_test {

	public static void main(String[] args) {

		try {
			OutputStream is = new FileOutputStream("/Users/woomin/Documents/GDJ61/javastudy/JWM/test.db");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
