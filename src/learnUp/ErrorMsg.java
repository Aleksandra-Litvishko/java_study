package learnUp;

class ErrMsg {
	String msg[] = {
			"������ ������",
			"������ �����",
			"����������� ����� �� �����",
			"����� ������� �� ������� ���������"
	};
	
	String Msg(int i) {
		if(i > 0 & i < msg.length) {
			return msg[i];
		}
		else {
			return "�������������� ��� ������";
		}
	}
}

class ErrorMsg {
	public static void main(String args[]) {
		ErrMsg err = new ErrMsg();
		
		System.out.println(err.Msg(3));
		System.out.println(err.Msg(149));
	}
}