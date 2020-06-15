package IO;

import java.io.*;

public class FileIO2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(".\\src\\IO\\prac2.txt");
			fos = new FileOutputStream(".\\src\\IO\\result2.txt");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int data;
			
			while ((data = fis.read()) != -1) {
				bos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
