package learnUp; // ������������ ���������� � ������ ������� �����������

class Aa {
	 Aa () {
		System.out.println("������ ������������ �a");
	}
}

class Bb extends Aa {
	Bb () {
		System.out.println("������ ������������ Bb");
	}
}

class Cc extends Bb {
	Cc () {
		System.out.println("������ ������������ ��");
	}
}

class OrderOfConstruction7 {
	public static void main(String args[]) {
		Cc ob = new Cc ();
		System.out.println(ob); // ������ ����� ����� ��������������� ���� �� ���������
	}
}