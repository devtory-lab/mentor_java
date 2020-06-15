package IO;

import java.io.*;

public class FileIO1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream(".\\src\\IO\\prac.txt");
		fos = new FileOutputStream(".\\src\\IO\\result.txt");
		
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
