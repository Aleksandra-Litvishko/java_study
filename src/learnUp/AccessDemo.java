package learnUp;

class AccessDemoNew {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) { // ������ � �������� ���������� ������������ ����������� �������, ����������� � ����� � ��� ������
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
		
		// ob.alpha = 10; ������, �.�. alpha - �������� ����������, � ��� ���������� ���������� �� ��������� ������
		ob.beta = 88;
		ob.gamma = 99;
		
	}
}