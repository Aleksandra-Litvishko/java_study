package learnUp;

enum Transport3 {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo3 {
	public static void main(String args[]) {
		System.out.println("��������� ������������ Transport � �� ���������� ��������:");
		for (Transport t : Transport.values()) {
			System.out.println(t + " " + t.ordinal());
		}
		Transport tp = Transport.CAR;
		Transport tp1 = Transport.TRUCK;
		
		if(tp.compareTo(tp1) > 0) {
			System.out.println(tp1 + " ��� ����� " + tp);
		}
		if(tp.compareTo(tp1) == 0) {
			System.out.println(tp + " ��������� � " + tp1);
		}
		if(tp.compareTo(tp1) < 0) {
			System.out.println(tp + " ��� ����� " + tp1);
		}
	}
}