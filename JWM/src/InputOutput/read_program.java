package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class read_program {

	public static void main(String[] args) {

	 String local = "/Users/woomin/Documents/GDJ61/javastudy/JWM/test.txt";
	 
	 try (Reader reader = new FileReader(local)) {
		
		 char[] ch = new char[10];
		 
		 while(true) {
			 int num = reader.read(ch);
			 if(num == -1) break;
			 for(int i=0; i<num; i++)
			 System.out.print(ch[i] + " ");
		 }
		 
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
