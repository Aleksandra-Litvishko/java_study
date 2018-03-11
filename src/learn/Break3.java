package learn;

class Break3 {
	public static void main(String args[]) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("—чЄтчик внешнего цикла" + " " + i);
			System.out.print("—чЄтчик внутреннего цикла: ");
			
			int t = 0;
			while(t < 100) {
				if(t == 10) break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		} 
		System.out.println("÷иклы завершены");
	}
}