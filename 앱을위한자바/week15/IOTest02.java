package week15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOTest02 {
	public static void main(String[] args) throws IOException{
		//byte
		FileInputStream fis = new FileInputStream("C:/Users/정민영/Desktop/Pride_and Prejudice_by_Jane_Austen.txt");
		int data = 0;
		long s_time = System.currentTimeMillis();
		while((data = fis.read()) != -1);
			fis.close();
			System.out.println("소요시간: " + (System.currentTimeMillis() - s_time));
			//buffer
			FileInputStream fis2 = new FileInputStream("C:/Users/정민영/Desktop/Pride_and Prejudice_by_Jane_Austen.txt");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			s_time = System.currentTimeMillis();	
			while((data = bis.read()) != -1);
			bis.close();
			System.out.println("소요시간(버퍼): " + (System.currentTimeMillis() - s_time));
	}
}
