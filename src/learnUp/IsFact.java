package learnUp;

class Factor {
	boolean isFactor(int x, int y) {
		if((y % x) == 0) return true;
		else return false;
	}
}

class IsFact {
	public static void main(String args[]) {
		Factor a = new Factor();
		
		if(a.isFactor(2, 20)) System.out.println("2 - делитель");
		if(a.isFactor(3, 20)) System.out.println("Эта строка не будет выведена");
	}
}