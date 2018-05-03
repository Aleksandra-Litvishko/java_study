package learnUp; // конструкторы вызываются с самого первого суперкласса

class Aa {
	 Aa () {
		System.out.println("Внутри конструктора Аa");
	}
}

class Bb extends Aa {
	Bb () {
		System.out.println("Внутри конструктора Bb");
	}
}

class Cc extends Bb {
	Cc () {
		System.out.println("Внутри конструктора Сс");
	}
}

class OrderOfConstruction7 {
	public static void main(String args[]) {
		Cc ob = new Cc ();
		System.out.println(ob); // только чтобы жёлтый восклицательный знак не раздражал
	}
}