package learnUp;

class Sup {
	void who() {
		System.out.println("who() â Sup");
	}
}

class Sub1 extends Sup {
	void who() {
		System.out.println("who() â Sub1");
	}
}

class Sub2 extends Sup {
	void who() {
		System.out.println("who() â Sub2");
	}
}

class DynDispDemo7 {
	public static void main(String args[]) {
		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();
		
		subOb1.who();
		
		Sup supRef;
		
		supRef = superOb;
		supRef.who();
		
		supRef = subOb1;
		supRef.who();
		
		supRef = subOb2;
		supRef.who();
	}
}