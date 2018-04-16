package learnUp.tasks;

class EncodeWithSymbNew {
	public static void main(String args[]) {
		String message = "This is a text";
		String encmsg = "";
		String dcdmsg = "";
		String key = "abcdef";
		int counter = 0;
		
		for(int i = 0; i < message.length(); i++) {
			encmsg = encmsg + (char) (message.charAt(i) ^ key.charAt(counter));
			counter++;
			if (counter == 6) {
				counter = 0;
			}
		}
		
		System.out.println("Зашифрованное сообщение: " + encmsg);
		
		counter = 0;
		for(int i = 0; i < message.length(); i++) {
			dcdmsg = dcdmsg + (char) (encmsg.charAt(i) ^ key.charAt(counter));
			counter++;
			if (counter == 6) {
				counter = 0;
			}
		}
		System.out.println("Дешифрованное сообщение: " + dcdmsg);
	}
}