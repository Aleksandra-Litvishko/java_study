package li.java.tasks;

interface MyValue {
	double getValue();
}

interface MyParamValue<T> {
	double getValue(T v);
}

public class LambdaDemo {
	public static void main(String args[]) {
		MyValue myVal = () -> 98.6;
		MyParamValue<Double> myPvalD = (n) -> 1.0 / n;
		MyParamValue<Integer> myPvalI = (n) -> 1.0 / n;
		
		System.out.println("���������� ��������: " + myVal.getValue());
		
		System.out.println("�������� �������� 4 �����: " + myPvalD.getValue(4.0));
		System.out.println("�������� �������� 8 �����: " + myPvalI.getValue(8));
	}
}