package ch3_;

public class _3��12�� {

	public static void main(String[] args) {
		int sum = 0; // ������ ���� int�� sum �ʱ�ȭ
		for (int i = 0; i < args.length; i++) { // �Է� ���� args ���ڿ� ���̸�ŭ �ݺ��ϸ� �˻�
			try {
				sum += Integer.parseInt(args[i]); //������ args ���ڿ� �ε����� ���� sum�� ���Ѵ�.
			} catch (NumberFormatException e) { // ������ �ƴ� ���� ����ó���� �ɷ��ش�.
			}
		}
		System.out.println(sum); // ������ �������� ��µǴ� ���� Ȯ���� �� �ִ�.
	}
}
