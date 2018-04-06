package learnUp;

class StringSwitch {
	public static void main(String args[]) {
		
		String command =  "connection";
		
		switch (command) {
		case "connection":
			System.out.println("Подключение...");
			break;
		case "cancel":
			System.out.println("Отмена...");
			break;
		case "disconnect":
			System.out.println("Отключение...");
			break;
		default: 
			System.out.println("Неверная команда!");
			break;
		}
	}
}