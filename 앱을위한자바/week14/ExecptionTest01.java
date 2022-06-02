package week14;

public class ExecptionTest01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			int [] array = {1, 2, 3};
			System.out.println(array[10]);
			//System.out.println(100/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5);
		} catch(Exception e){
			e.printStackTrace();
			//System.out.println(6);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("여기는 finally부분, 무조건 실행");
		}
		System.out.println(7);
	}

}
