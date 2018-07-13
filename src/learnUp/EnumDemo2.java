package learnUp;

enum Transport2 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

	private int speed; // типичная скорость движения транспортного средства

	Transport2(int speed) { // добавление конструктора
		this.speed = speed;
	}

	public int getSpeed() { // добавление метода
		return speed;
	}
}

public class EnumDemo2 {
	public static void main(String args[]) {
		Transport tp;
System.out.println("Типичная скорость движения самолёта: " +Transport2.AIRPLANE.getSpeed() + " миль в час"); // определение скорости с помощью метода getSpeed()

System.out.println("Типичные скорости движения транспортных средств: "); 
for(Transport2 x: Transport2.values()) {
	System.out.println(x + ": " + x.getSpeed() + " миль в час");
}
	}
}