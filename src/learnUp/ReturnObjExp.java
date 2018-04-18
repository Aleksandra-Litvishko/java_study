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
		"нурофен",
		"диклофен",
		"пенталгин",
		"темпалгин"
	};
	
	String pr[] = {
		"149.00 р",
		"100.00 р",
		"97.00 р",
		"108.00 р"
	};
	
	CrObj GetInfo(int i) {
		if(i >= 0 & i < msg.length) {
			return new CrObj(msg[i], pr[i]);
		}
		else {
			return new CrObj("лекарство не найдено", "0 р");
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