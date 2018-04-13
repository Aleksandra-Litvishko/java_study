package learnUp;

class EncodeNew {
	public static void main(String args[]) {
		String msg = ("Очень хитрое сообщение");
		String encmsg = ("");
		String dcdmsg = ("");
		int key = 97;
		
		System.out.print("Исходное сообщение: ");
		System.out.println(msg);
		
		for(int i = 0; i < msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		}
		
		System.out.print("Закодированное сообщение: ");
		System.out.println(encmsg);
		
		for(int i = 0; i < msg.length(); i++) {
			dcdmsg = dcdmsg + (char) (encmsg.charAt(i) ^ key);
		}
		System.out.print("Раскодированное сообщение: ");
		System.out.println(dcdmsg);
	}
}
