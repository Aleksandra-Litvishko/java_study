package learnUp;

class Queue1 {  // �����, ����������� ������� ��� �������� ��������
	char arr_ch[];
	int arr_i[];
	double arr_d[];
	
	int putloc_ch, getloc_ch;
	int putloc_i, getloc_i;
	int putloc_d, getloc_d;
	
	Queue1(int size) {
		arr_ch = new char[size + 1];
		arr_i = new int[size + 1];
		arr_d = new double[size + 1];
		
		putloc_ch = getloc_ch = 0;
		putloc_i = getloc_i = 0;
		putloc_d = getloc_d = 0;
	}
	
	void put(char ch) {
		if(putloc_ch >= arr_ch.length) {
			System.out.println(" - ������� ���������");
			return;
		}
		putloc_ch++;
		arr_ch[putloc_ch] = ch;
	}
	
	void put(int i) {
		arr_i[putloc_i] = i;
		putloc_i++;
	}
	
	void put(double d) {
		arr_d[putloc_d] = d;
		putloc_d++;
	}
	
	char get() {
		if(putloc_ch == getloc_ch) {
			System.out.println(" - ������� �����");
		}
		getloc_ch++;
		return arr_ch[getloc_ch];
	}
}

class QDemoChangeType  {
	public static void main(String args[]) {
		Queue1 turn1 = new Queue1(40);
		char ch;
		
		for(int i = 0; i < 32; i++) {
			turn1.put((char) ('�' + i));
		}
		System.out.print("���������� �������: ");
		
		for(int i = 0; i < 32; i++) {
			ch = turn1.get();
			System.out.print(ch);
			
		}
	}
}