package practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class MainClass2 {

	/* 문제2.  /Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home의 파일을 출력

	2023-01-04  오후 02:19    <DIR>          bin
	2023-01-04  오후 02:19    <DIR>          conf
	2023-01-04  오후 02:19    <DIR>          include
	2023-01-04  오후 02:19    <DIR>          jmods
	2023-01-04  오후 02:19    <DIR>          legal
	2023-01-04  오후 02:19    <DIR>          lib
	2023-01-04  오후 02:19               160 README.html
	2023-01-04  오후 02:19             1,302 release
	               2개 파일               1,462 바이트
	 */
	public static void ex07() {

		File file = new File("/Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home");

		if(file.exists()) {
			File[] files = file.listFiles();

			int count = 0;
			long totalSize = 0;

			for(File f : files) {

				String modi = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(f.lastModified());
				String directory = f.isDirectory() ? "<DIR>" : "";
				String size = "";

				if(f.isFile()) {
					count++;
					size = new DecimalFormat("#,##0").format(f.length());
					totalSize += f.length();
				}

				String name = f.getName();
				String result = String.format("%s%9s%9s %s\n", modi, directory, size, name);
				System.out.print(result);

			}
			
			String fCount = String.format("%15s\t", count + "개 파일");
			
			System.out.print(fCount + "\t    " + new DecimalFormat("#,##0").format(totalSize) + " 바이트");


		}

	}

	public static void main(String[] args) {

		ex07();

	}

}
