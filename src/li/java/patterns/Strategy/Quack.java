package li.java.patterns.Strategy;

public class Quack implements QuackBehavior { //���������� ��������� ����, ������� ����� �������
	public void quack() {
		System.out.println("Quack");
	}
}
