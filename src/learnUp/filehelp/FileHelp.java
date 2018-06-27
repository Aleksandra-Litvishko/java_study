package learnUp.filehelp;

class FileHelp {
	public static void main(String args[]) {
		Help help = new Help("D:\\helpfile.txt");
		String topic;
		System.out.println("Воспользуйтесь справочной системой.\n" + "Для выхода из системы введите 'stop'.");
		
		do {
		topic = help.getSelection();
		if(!help.Helpon(topic) & topic.compareTo("stop") != 0) {
			System.out.println("Тема не найдена.");
		};
		} while(topic.compareTo("stop") != 0);
	}
}