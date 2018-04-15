package learnUp.tasks;

class EncodeWithSymb {
    public static void main(String args[]) {
        String message = "This is a test";
        String encmsg = "";
        String dcdmcg = "";

        String keys = "CoolJava";

        System.out.println("Исходный текст: " + message);

        for(int i = 0; i < message.length(); i++)  {
            char temp = message.charAt(i);
            for (int j = 0; j < keys.length(); j++) {
                temp = (char) ( temp ^ keys.charAt(j));
            }
            encmsg = encmsg + temp;
        }
        System.out.println("Зашифрованное сообщение: ");
        System.out.println(encmsg);

         for(int i = 0; i < encmsg.length(); i++) {
             char temp = encmsg.charAt(i);
            for(int j = 0; j < keys.length(); j++) {
                temp = (char) (temp ^ keys.charAt(j));
            }
            dcdmcg = dcdmcg + temp;
        }
        System.out.println("Дешифрованное сообщение: ");
        System.out.println(dcdmcg);
    }
}