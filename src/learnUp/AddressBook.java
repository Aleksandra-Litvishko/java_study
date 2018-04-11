package learnUp;

class AddressBook {
    public static void main(String args[]) {
        String arr[][] = {
                {"Alex", "White", "50 Nizhnya str, #20"},
                {"Nick", "Black", "123 Verhnya str"},
                {"Andre", "Velgo", "17 Middle str, #198"},
                {"Andre", "Velgo", "17 Middle str, #198"},
                {"Mark", "Vesci", "109 St.Ursula str, #159"}
        };
        int i = 0;
        boolean isPersonFound = false;


        if (args.length == 0) {
            System.out.println("Please, insert name and surname using the following form: <name> <surname>");
        } else {
            for (i = 0; i < arr.length; i++) {

                if ((args[0].equals(arr[i][0])) & (args[1].equals(arr[i][1]))) {
                    System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
                    break;
                }
                if (i == arr.length) {
                    System.out.println("A person is not found");
                }
            }
        }
    }
}