package learnUp;

class ChkNum {
	boolean isEven(int e) {
		if((e % 2) == 0) return true;
		else return false;
	}
}

class ParmDemo {
	public static void main(String args[]) {
		ChkNum x = new ChkNum();
		
		if(x.isEven(10)) System.out.println("10 - чётное число");
		if(x.isEven(9)) System.out.println("9 - чётное число");
		if(x.isEven(8)) System.out.println("8 - чётное число");
	}
}