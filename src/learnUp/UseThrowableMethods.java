package learnUp;

class ExcTest1 {
	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("�� ��������� ����������");
		nums[4] = 7;
		System.out.println("��� ������ �� ����� ������������!");
	}
}

class UseThrowableMethods {
	public static void main(String args[]) {
		try {
			ExcTest1.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("����������� ��������� �� ������");
			System.out.println(exc);
			
			System.out.println("���� �������:");
			exc.printStackTrace();
		}
	}
}