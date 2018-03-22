package learnUp; // демонстрация работы сборщика мусора и финализация

class FDemo {
	int x;
	
	FDemo(int i) {
		x = i;
	}
	
	protected void finalize() { // выполняется при удалении объекта
		System.out.println("Финализация " + x);
	}

    void generator(int i) { // генерирует объект, который тотчас удаляется
	// FDemo o = new FDemo(i); ПЕРЕД ЗАПУСКОМ УБРАТЬ КОСЫЕ ЛИНИИ
 }
}

class Finalize {
	public static void main(String args[]) {
		int count;
		
		FDemo ob = new FDemo(0);
		for(count = 0; count < 600000; count++) { // генерируется большое количество объектов. В какой-то момент начнётся сборка мусора.
			ob.generator(count);
		}
	}
}