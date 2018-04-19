package learnUp.tasks;

class QDe { // класс, реализующий очередь для хранения символов;
	char arr[]; // массив для хранения элементов очереди;
	int putloc, getloc; // индексы, для вставки и извлечения элементов очереди;
	
	QDe(int size) { // сконструировать пустую очередь заданного размера
		arr = new char[size+1]; // выделить память для очереди
		putloc = getloc = 0;
	}
	
	QDe(QDe ob) { // сконструировать очередь на основе имеющегося объекта
		putloc = ob.putloc;
		getloc = ob.getloc;
		arr = new char[ob.arr.length];
		
		for(int i = getloc + 1; i <= putloc; i++) { // копировать элементы в очередь
			arr[i] = ob.arr[i];
		}
	}
	
	QDe(char a[]) { //сконструировать очередь на основе массива исходных значений
		putloc = 0;
		getloc = 0;
		arr = new char[a.length + 1];
		
		for(int i = 0; i < a.length; i++) {
			put(a[i]);
		}
	}
	
	void put(char ch) { //поместить символ в очередь
		if(putloc == arr.length - 1) {
			System.out.println("\nОчередь заполнена");
			return;
		}
		putloc++;
		arr[putloc] = ch;
	}
	
	char get(int i) { //извлечь символ из очереди
		if(getloc == putloc) {
			System.out.println("\nОчередь пуста");
		    return (char) 0;
		}
		getloc++;
		return arr[getloc];
	}
}

class QDemo2 {
	public static void main(String args[]) {
		QDe alph = new QDe(35);
		char q[] = {'a', 'b', 'c', 'd'};
		QDe alph3 = new QDe(q);
	
		char ch;
		
		System.out.println("Содержимое очереди alph3: ");
		for(int i = 0; i < 4; i++) {
			ch = alph3.get(i);
			System.out.print(ch);
		}
		System.out.println();
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('А' + i));
		}
		
		QDe alph1 = new QDe(alph);
		
		System.out.println("Содержимое очереди alph: ");
		for(int i = 0; i < 32; i++) {
			ch = alph.get(i);
			System.out.print(ch);
		}
		System.out.println();
		
		System.out.println("Содержимое очереди alph1: ");
		for(int i = 0; i < 32; i++) {
			ch = alph1.get(i);
			System.out.print(ch);
		}
	}
}