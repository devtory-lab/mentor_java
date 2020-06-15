package IO;

import java.io.*;

public class FileIO1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream("E:\\eclipse_edu\\repository\\mentor_java\\src\\IO\\prac.txt");
		fos = new FileOutputStream("E:\\eclipse_edu\\repository\\mentor_java\\src\\IO\\result.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int data;
		
		while ((data = fis.read()) != -1) {
			bos.write(data);
		}
		bos.close();
		bis.close();
		

	}

}
