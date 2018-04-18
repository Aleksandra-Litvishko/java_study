package learnUp;

class Test {
	void NoChange(int i, int j) {
		i = i + j;
		j = -j;
	}
}

class CallByValue {
	public static void main(String args[]) {
		Test ob = new Test();
		
		int a = 15;
		int b = 20;
		
		System.out.println("Переменные a и b до вызова метода: " + a +" "+ b);
		
		ob.NoChange(a, b);
		
		System.out.println("Переменные a и b после вызова метода: " + a +" "+ b);
	} 
}