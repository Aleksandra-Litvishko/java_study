package learnUp.tasks;

class BubbleForStr {
    public static void main(String args[]) {
        String str[] = {"какой", "чудесный", "день,", "мне", "ничего", "не", "лень!"};
        String help;

        for(String x: str) {
            System.out.print(x + " ");
    }

        for(int i = 0; i < str.length; i++) {
            for(int j = str.length - 1; j > i; j--) {
                if(str[j - 1].compareTo(str[j]) > 0) {
                        help = str[j - 1];
                        str[j - 1] = str[j];
                        str[j] = help;
                }
            }
        }
        System.out.println();
        for(String x: str) {
            System.out.print(x + " ");
        }
    }
}