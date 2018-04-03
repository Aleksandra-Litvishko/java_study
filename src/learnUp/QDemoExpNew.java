package learnUp;

class QDe {
	char arr[];
	int putloc, getloc;
	
	QDe(int size) {
		arr = new char[size+1];
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if(putloc == arr.length) {
			System.out.println("\n������� ���������");
			return;
		}
		arr[putloc] = ch;
		putloc++;
	}
	
	void get(int i) {
		if(putloc == getloc) {
			System.out.println("\n������� �����");
		    return;
		}
		getloc++;
		System.out.print(arr[i]);
	}
}

class QDemoExpNew {
	public static void main(String args[]) {
		QDe alph = new QDe(35);
		
		for(int i = 0; i < 32; i++) {
			alph.put((char) ('�' + i));
		}
		
		System.out.print("���������� ��������: ");
		for(int i = 0; i < 32; i++) {
			alph.get(i);
		}
	}
}