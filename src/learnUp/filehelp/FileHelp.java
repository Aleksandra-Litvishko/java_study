package learnUp.filehelp;

class FileHelp {
	public static void main(String args[]) {
		Help help = new Help("D:\\helpfile.txt");
		String topic;
		System.out.println("�������������� ���������� ��������.\n" + "��� ������ �� ������� ������� 'stop'.");
		
		do {
		topic = help.getSelection();
		if(!help.Helpon(topic) & topic.compareTo("stop") != 0) {
			System.out.println("���� �� �������.");
		};
		} while(topic.compareTo("stop") != 0);
	}
}