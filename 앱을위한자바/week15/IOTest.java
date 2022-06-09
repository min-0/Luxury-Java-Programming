package week15;

import java.io.FileInputStream;

public class IOTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int c;
		
		System.out.println("파일 읽기: C:/windows/system.ini");
		System.out.println();
		
		try {
			fis = new FileInputStream("C:/windows/system.ini"); //읽어들이기
			while((c = fis.read()) != -1) { //c에 대입하기 //-1은 뻗는 경우
				System.out.print((char)c); //문자로 캐스팅 해줘야 정상 출력됨
			}
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
