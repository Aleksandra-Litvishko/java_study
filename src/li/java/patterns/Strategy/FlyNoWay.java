package li.java.patterns.Strategy;

public class FlyNoWay implements FlyBehavior { //���������� ����, ������� �� ����� ������
	public void fly() {
		System.out.println("I can't fly");
	}
}
