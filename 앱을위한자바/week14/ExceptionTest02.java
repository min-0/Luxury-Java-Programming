package week14;

public class ExceptionTest02 {
	public static void main(String[] args) {
		String id = "abcde";
		try {
			if(!id.equals("abcd")) {
				throw new MyException("잘못된 ID를 입력했습니다.");
			}
		} catch(MyException e) {
			System.out.println(e.getMessage());
			System.out.println("다시 입력하세요");
		}
		System.out.println("무조건 실행");
	}
}

class MyException extends Exception{
	
	private static final long serialVersionUID = 0;
	
	public MyException (String message) {
		super(message);
	}
}