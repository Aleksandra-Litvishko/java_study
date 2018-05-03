package learnUp;

class CreateCopy {
	int i;
	
	CreateCopy (int a) {
		i = a;
	}
	
	CreateCopy(CreateCopy b) {
		i = b.i;
	}
}

class CreateCopyObjByConst7 {
	public static void main(String args[]) {
		CreateCopy n = new CreateCopy(1);
		CreateCopy s = new CreateCopy(n);
		
		System.out.println(s.i);
	}
}