package learnUp;

enum Transport { // объявление перечисления
	TRUCK,CAR,AIRPLANE,TRAIN,BOAT;
}

class EnumDemo {
	public static void main(String args[]) {
		Transport tr; // объявление ссылки на перечисление;
		tr = Transport.BOAT; // присваивание переменной tr значения в виде константы BOAT
		
		System.out.println("Значение tr: " + tr);
		System.out.println();
		
		tr = Transport.AIRPLANE; 
		
		if(tr == Transport.AIRPLANE) { // проверка равенства двух объектов типа Transport
			System.out.println("tr содержит TRAIN\n");
		}
		
		switch(tr) { // использование перечисления для управления оператором switch
		case TRUCK:
		System.out.println("Грузовик перевозит груз");
		break;
		case CAR:
		System.out.println("Автомобиль перевозит людей");
		break;
		case AIRPLANE:
		System.out.println("Самолёт летит");
		break;
		case TRAIN:
		System.out.println("Поезд движется по рельсам");
		break;
		case BOAT:
		System.out.println("Лодка плывёт по воде");
		break;
		default:
			System.out.println("Упс");
		}
		
		System.out.println();
		
		tr = Transport.valueOf("BOAT"); // получение константы BOAT
		System.out.println(tr);
		
		for(Transport x: Transport.values()) { // valuesOf() возвращает массив констант
			System.out.print(x + " ");
		}
	}
}