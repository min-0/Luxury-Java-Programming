package ch3_;

public class _3장12번 {

	public static void main(String[] args) {
		int sum = 0; // 정수를 합할 int형 sum 초기화
		for (int i = 0; i < args.length; i++) { // 입력 받은 args 문자열 길이만큼 반복하며 검사
			try {
				sum += Integer.parseInt(args[i]); //정수인 args 문자열 인덱스의 값만 sum에 더한다.
			} catch (NumberFormatException e) { // 정수가 아닌 것은 예외처리로 걸러준다.
			}
		}
		System.out.println(sum); // 정수만 합해져서 출력되는 것을 확인할 수 있다.
	}
}
