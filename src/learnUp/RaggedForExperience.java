package learnUp; // нерегулярные массивы в моём исполнении

class RaggedForExperience {
	public static void main(String args[]) {
		int mymass[][] = new int[7][];
		
		int counter = 0; 
		
		mymass[0] = new int[6];
		mymass[1] = new int[6];
		mymass[2] = new int[6];
		mymass[3] = new int[6];
		mymass[4] = new int[6];
		mymass[5] = new int[2];
		mymass[6] = new int[2];
		
		System.out.println("Количество тестов для выполнения с понедельника по четверг для каждого ключевого браузера: ");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				counter++;
				mymass[i][j] = (i + j) * 2;
				System.out.print(mymass[i][j] + " ");
				
			   if(counter == 6) {
				System.out.println();
				counter = 0;
			   }
			}
		}
		
		System.out.println();
		System.out.println("Количество тестов для выполнения с пятницы по воскресенье для каждого НЕ ключевого браузера: ");
		
		for(int i = 4; i < 7; i++) {
			for(int j = 0; j < 2; j++) {
				counter++;
				mymass[i][j] = (i + j) / 2;
				System.out.print(mymass[i][j] + " ");
				 if(counter == 2) {
						System.out.println();
						counter = 0;
					   }
			}
		}
	}
}