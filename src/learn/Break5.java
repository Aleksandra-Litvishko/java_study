package learn;

class Break5 {
	public static void main(String args[]) {
		done: 
			for(int i = 1; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					for(int k = 1; k < 10; k++) {
						System.out.println("Значение k: " + k);
						if(k == 5) break done;
					}
					System.out.println("После цикла по k");
				}
				System.out.println("После цикла по j");
			}
	System.out.println("После цикла по i");
	}
}