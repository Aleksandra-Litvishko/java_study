package learnUp;

class ErrMsg1 {
	String msg[] = {
			"������ ������",
			"������ �����",
			"����������� ����� �� �����",
			"����� ������� �� ������� ���������"
	};
	
	final int OUTERR = 0;
	final int INNERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String getErrorMsg(int i) {
		if(i > 0 & i < msg.length) {
			return msg[i];
		}
		else {
			return "�������������� ��� ������";
		}
	}
}

class FinalD7 {
	public static void main(String args[]) {
		ErrMsg1 err = new ErrMsg1();
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.INDEXERR));
	}
}