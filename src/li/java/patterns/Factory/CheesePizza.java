package li.java.patterns.Factory;

public class CheesePizza implements Pizza {
	public void prepare() {
		System.out.println("���������� ������ ������ �����");
	}
	public void bake(){
		System.out.println("��������� ������ �����");
	}
	public void cut(){
		System.out.println("������� ������ �����");
	}
	public void box(){
		System.out.println("�������� ������ �����");
	}
}
