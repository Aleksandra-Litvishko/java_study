package learnUp;

interface A1 { // наследование интерфейсов
	void meth1();
	void meth2();
}

interface B1 extends A1 { // интерфейс уже содержит методы meth1() и meth2() (т.к. интерфейс B1 наследует интерфейс A1). Добавляется метод meth3()
	void meth3();
}

class MyClasss implements B1 { // этот класс должен реализовать все методы, объявленные в интерфейсах А1 и B1 
	public void meth1() {
		System.out.println("Реализация meth1()");
	}
	public void meth2() {
		System.out.println("Реализация meth2()");
	}
	public void meth3() {
		System.out.println("Реализация meth3()");
	}
}
 
class IFExtend {
	
	public static void main(String args[]) {
		MyClasss ob = new MyClasss();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}