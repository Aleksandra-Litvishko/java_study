package learnUp;

class Encode {
	public static void main(String args[]) {
		String message = "Это супер-зашифрованное сообщение";
		String encmsg = "";
		String dcdmcg = "";
		
		int key = 125;
		
		System.out.println(message);
		
		for(int i = 0; i < message.length(); i++) {
			encmsg = encmsg + (char) (message.charAt(i) ^ key);
		}
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(encmsg);
		
		for(int i = 0; i < message.length(); i++) {
			dcdmcg = dcdmcg + (char) (encmsg.charAt(i) ^ key);
		}
		System.out.print("Дешифрованное сообщение: ");
		System.out.println(dcdmcg);
	}
}