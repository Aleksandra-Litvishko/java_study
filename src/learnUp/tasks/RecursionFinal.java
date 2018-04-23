package learnUp.tasks;

class RecursionFinal {
	static String str;
	static void Reverse(String s) {
		str = s;
		int x = str.length() - 1;
		
		System.out.print(str.charAt(x));
		if(x == 0) return;
		String newstr = str.substring(0, x);
		
		Reverse(newstr);
	}
	public static void main(String args[]) {
		Reverse("И снова седая ночь!");
	}
}