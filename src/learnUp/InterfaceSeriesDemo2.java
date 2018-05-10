package learnUp; // использование интерфейсных ссылок

class InterfaceSeriesDemo2 {
	public static void main(String args[]) {
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob;
		
		for(int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Следующее значение twoOb: " + ob.getNext()); // доступ к объекту по интерфейсной ссылке
			
			ob = threeOb;
			System.out.println("Следующее значение threeOb: " + ob.getNext()); // доступ к объекту по интерфейсной ссылке
		}
	}
}