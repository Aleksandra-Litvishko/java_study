package learnUp;

class CrObj {
	String type_of;
	String price_of;
	
	CrObj(String type, String price) {
		type_of = type;
		price_of = price;
	}
}

class Info {
	String msg[] = {
		"�������",
		"��������",
		"���������",
		"���������"
	};
	
	String pr[] = {
		"149.00 �",
		"100.00 �",
		"97.00 �",
		"108.00 �"
	};
	
	CrObj GetInfo(int i) {
		if(i >= 0 & i < msg.length) {
			return new CrObj(msg[i], pr[i]);
		}
		else {
			return new CrObj("��������� �� �������", "0 �");
		}
	}
}

class ReturnObjExp {
	public static void main(String args[]) {
		Info obj = new Info();
		CrObj cr = obj.GetInfo(2);
		
		System.out.println(cr.type_of + " " + cr.price_of);
    }
}