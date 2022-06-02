package week14;

public class ExceptionTest02 {
	public static void main(String[] args) {
		String id = "abcde";
		try {
			if(!id.equals("abcd")) {
				throw new MyException("�߸��� ID�� �Է��߽��ϴ�.");
			}
		} catch(MyException e) {
			System.out.println(e.getMessage());
			System.out.println("�ٽ� �Է��ϼ���");
		}
		System.out.println("������ ����");
	}
}

class MyException extends Exception{
	
	private static final long serialVersionUID = 0;
	
	public MyException (String message) {
		super(message);
	}
}