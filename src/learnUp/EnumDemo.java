package learnUp;

enum Transport { // ���������� ������������
	TRUCK,CAR,AIRPLANE,TRAIN,BOAT;
}

class EnumDemo {
	public static void main(String args[]) {
		Transport tr; // ���������� ������ �� ������������;
		tr = Transport.BOAT; // ������������ ���������� tr �������� � ���� ��������� BOAT
		
		System.out.println("�������� tr: " + tr);
		System.out.println();
		
		tr = Transport.AIRPLANE; 
		
		if(tr == Transport.AIRPLANE) { // �������� ��������� ���� �������� ���� Transport
			System.out.println("tr �������� TRAIN\n");
		}
		
		switch(tr) { // ������������� ������������ ��� ���������� ���������� switch
		case TRUCK:
		System.out.println("�������� ��������� ����");
		break;
		case CAR:
		System.out.println("���������� ��������� �����");
		break;
		case AIRPLANE:
		System.out.println("������ �����");
		break;
		case TRAIN:
		System.out.println("����� �������� �� �������");
		break;
		case BOAT:
		System.out.println("����� ����� �� ����");
		break;
		default:
			System.out.println("���");
		}
		
		System.out.println();
		
		tr = Transport.valueOf("BOAT"); // ��������� ��������� BOAT
		System.out.println(tr);
		
		for(Transport x: Transport.values()) { // valuesOf() ���������� ������ ��������
			System.out.print(x + " ");
		}
	}
}