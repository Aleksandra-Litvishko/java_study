package learnUp;

class StringSwitch {
	public static void main(String args[]) {
		
		String command =  "connection";
		
		switch (command) {
		case "connection":
			System.out.println("�����������...");
			break;
		case "cancel":
			System.out.println("������...");
			break;
		case "disconnect":
			System.out.println("����������...");
			break;
		default: 
			System.out.println("�������� �������!");
			break;
		}
	}
}