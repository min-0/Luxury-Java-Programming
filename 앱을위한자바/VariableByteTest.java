package week3;

public class VariableByteTest {
	public static void main(String[] args) {
		//������ �����÷ο�(Overflow) �׽�Ʈ
		VariableByteTest types = new VariableByteTest();
		types.bytes();

	}
	public void bytes() {
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		
		System.out.println("min byte = " + minByte);
		System.out.println("max byte = " + maxByte);
		
		byte minByteMinus = (byte)(minByte - 1); //����ȯ ������ ������ ���� �߻�
		byte maxBytePlus = (byte)(maxByte + 1);
		
		System.out.println("min byte - 1 = " + minByteMinus);
		System.out.println("max byte + 1 = " + maxBytePlus);
	}
}
