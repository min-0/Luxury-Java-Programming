package week15;

import java.io.FileInputStream;

public class IOTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int c;
		
		System.out.println("���� �б�: C:/windows/system.ini");
		System.out.println();
		
		try {
			fis = new FileInputStream("C:/windows/system.ini"); //�о���̱�
			while((c = fis.read()) != -1) { //c�� �����ϱ� //-1�� ���� ���
				System.out.print((char)c); //���ڷ� ĳ���� ����� ���� ��µ�
			}
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
