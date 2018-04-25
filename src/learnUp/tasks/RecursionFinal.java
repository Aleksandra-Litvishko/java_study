package learnUp.tasks;

class RecursionFinal {
	
	static void Reverse(String str) {
		int x = str.length() - 1;
		String newstr = str.substring(0, x);
		
		System.out.print(str.charAt(x));
		if(x == 0) return;
		
		Reverse(newstr);
	}
	public static void main(String args[]) {
		Reverse("И снова седая ночь!");
	}
}