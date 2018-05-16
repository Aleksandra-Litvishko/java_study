package learnUp;

interface MyIf {
	int getUserID(); // "обычный метод" интерфейса без реализации по умолчанию

	default int getAdminID() { // метод, по умолчанию, включающий его реализацию
		return 1;
	}

	static int getUniversalID() { // статический метод интерфейса
		return 0;
	}
}

interface MyIf2 extends MyIf {

}

class MyIfImp implements MyIf { // реализация интерфейса MyIf. Реализации подлежит лишь getUserID()
	public int getUserID() {
		return 100;
	}
}

class MyIfImp2 implements MyIf { // предоставление реализации обоих методов интерфейса
	public int getUserID() {
		return 100;
	}

	public int getAdminID() { // переопределение метода интерфейса getAdminID()
		return 42;
	}
}

class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIfImp obj = new MyIfImp();
		MyIfImp2 obj1 = new MyIfImp2();
		int uID = MyIf.getUniversalID(); // использование статического метода интерфейса

		System.out.println(uID);
		System.out.println();

		System.out.println("Идентификатор пользователя: " + obj.getUserID());
		System.out.println("Идентификатор администратора: " + obj.getAdminID()); // вызов метода возможен, т.к.
																					// предоставляется его реализация по
																					// умолчанию
		System.out.println();

		System.out.println("Идентификатор пользователя: " + obj1.getUserID());
		System.out.println("Идентификатор администратора: " + obj1.getAdminID()); // переопределение метода интерфейса
	}
}