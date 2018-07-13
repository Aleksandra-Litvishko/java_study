package learnUp;

enum Transport2 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

	private int speed; // �������� �������� �������� ������������� ��������

	Transport2(int speed) { // ���������� ������������
		this.speed = speed;
	}

	public int getSpeed() { // ���������� ������
		return speed;
	}
}

public class EnumDemo2 {
	public static void main(String args[]) {
		Transport tp;
System.out.println("�������� �������� �������� �������: " +Transport2.AIRPLANE.getSpeed() + " ���� � ���"); // ����������� �������� � ������� ������ getSpeed()

System.out.println("�������� �������� �������� ������������ �������: "); 
for(Transport2 x: Transport2.values()) {
	System.out.println(x + ": " + x.getSpeed() + " ���� � ���");
}
	}
}