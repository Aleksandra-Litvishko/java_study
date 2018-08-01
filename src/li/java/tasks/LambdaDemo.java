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
		
		System.out.println("Постоянное значение: " + myVal.getValue());
		
		System.out.println("Обратная величина 4 равна: " + myPvalD.getValue(4.0));
		System.out.println("Обратная величина 8 равна: " + myPvalI.getValue(8));
	}
}