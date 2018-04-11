package learnUp;

class AddressBook {
	public static void main(String args[]) {
		String arr[] [] = {
				{"Alex", "White", "50 Nizhnya str, #20"},
				{"Nick", "Black", "123 Verhnya str"},
				{"Andre", "Velgo", "17 Middle str, #198"},
				{"Mark", "Vesci", "109 St.Ursula str, #159"}
		};
		int i, j;
		i =  j = 0;
		
		if(args.length == 0) {
			System.out.println("Please, insert name and surname using the following form: <name> <surname>");
		}
		else {
			 one: for(i = 0; i < arr.length; i++) {
				for(j = 0; j < arr.length; j++) {
					if((args[0].equals(arr[i] [0])) & (args[1].equals(arr[j] [1]))) {
						System.out.println(arr[i] [0] + " " + arr[j] [1] + " " + arr[i] [2]);
						break one;
					}
					if((i == arr[0].length) | (j == arr[1].length)) {
						System.out.println("A person is not found"); 
						break one;
			        }
				}
			}
		}
	}
}