package li.java.patterns.Factory;

public class PepperoniPizza implements Pizza {
	public void prepare() {
		System.out.println("���������� ����� ���������");
	}
	public void bake(){
		System.out.println("��������� ����� ���������");
	}
	public void cut(){
		System.out.println("������� ����� ���������");
	}
	public void box(){
		System.out.println("�������� ����� ���������");
	}
}
