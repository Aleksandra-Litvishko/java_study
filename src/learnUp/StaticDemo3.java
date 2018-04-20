package learnUp;

class StaticBlock { // статический блок в действии
	static double root2;
	static double root3;
	
	static {
		System.out.println("Внутри статического блока");
		root2 = Math.sqrt(2.0);
		root3 = Math.sqrt(3.0);
	}
	
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class StaticDemo3 {
	public static void main(String args[]) {
		StaticBlock ob = new StaticBlock("Внутри конструктора");
		
		System.out.println("Корень квадратный из двух равен: " + StaticBlock.root2);
		System.out.println("Корень квадратный из трёх равен: " + StaticBlock.root3);
		System.out.println(ob); // это не нужно для работы программы, но без этого появляется жёлтый раздражающий восклицательный знак
	}
}