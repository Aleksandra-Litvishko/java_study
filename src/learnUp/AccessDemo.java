package learnUp;

class AccessDemoNew {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) { // доступ к закрытой переменной оргназиуется посредством методов, определённых в одном с ней классе
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
} 

class AccessDemo {
	public static void main(String args[]) {
		AccessDemoNew ob = new AccessDemoNew();
		
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());
		
		// ob.alpha = 10; Нельзя, т.к. alpha - закрытая переменная, к ней невозможно обратиться за пределами класса
		ob.beta = 88;
		ob.gamma = 99;
		
	}
}