package ch3_;

public class _3��13�� {

	public static void main(String[] args) {
		int i = 1;
		int cnt;
		while(i < 100) {
			cnt = 0;
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				cnt++;
			}
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				cnt++;
			}
			if(cnt==1) System.out.println(i + " �ڼ� ¦");
			else if(cnt == 2) System.out.println(i + " �ڼ� ¦¦");
			i++;
		}
	}

}
