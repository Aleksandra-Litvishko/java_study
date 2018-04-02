package learnUp;

class Queue {  // класс, РЕАЛИЗУЮЩИЙ очередь для хранения символов
	char q[]; // массив для хранения элементов очереди
	int putloc, getloc; // индексы для вставки и извлечения элементов очереди
	
	Queue (int size) { // конструктор класса
		q = new char[size + 1]; // выделяется память для массива (для очереди)
		putloc = getloc = 0; // инициализация переменных, которые будут выполнять роль индексов для вставки и извлечения данных
	}
	
	void put(char ch) { // метод, которому передаётся значение
		if(putloc == q.length-1) { // если putloc = размер массива - 1, то выводится, что очередь заполнена и происходит возврат из метода оператором return
			System.out.println(" - очередь заполнена");
			return;
		}
		
		putloc++; // если putloc < размера массива - 1, то выполняется эта часть метода
		q[putloc] = ch; // значение, передаваемое методу приравнивается переменной массива с индексом putloc;
	}
	
	char get() { // метод, который извлекает символ из очереди
		if(getloc == putloc) { // если getloc = putloc, то выводится, что очередь пуста и возвращается значение 0
			System.out.println(" - очередь пуста");
			return (char) 0;
		}
		
		getloc++; // если getloc = putloc, то выполняется эта часть метода
		return q[getloc]; // возвращается значение переменной массива с индексом getloc
	}
}

class QDemo { 
	public static void main(String args[]) {
		Queue bigQ = new Queue(100); // объявлен объект класса Queue
		Queue smallQ = new Queue(4); // объявлен ещё один объект класса Queue
		char ch;
		
		System.out.println("Использование очереди bigQ для сохранения алфавита");
		for(int i = 0; i < 26; i++) { // помещение буквенных символов в очередь bigQ
			bigQ.put((char)  ('A' + i));
		}
		System.out.print("Содержимое очереди bigQ: "); // извлечение буквенных символов из очереди bigQ
		for(int i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch!= 0) {
				System.out.print(ch);
			}
		}
		System.out.println("\n");
		
		System.out.println("Использование очереди smallQ для генерации ошибок");
		for(int i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		System.out.print("Содержимое smallQ: "); // дополнительные ошибки при обращении к очереди SmallQ
		for(int i = 0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}