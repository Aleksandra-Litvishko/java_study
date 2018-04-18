package learnUp;

class Err {
	String msg;
	int severity;
	
	Err (String s, int i) {
		msg = s;
		severity = i;
	}
}

class ErrorInfo { 
	String messages[] = {
			"Ошибка вывода",
			"Ошибка ввода",
			"Отсутствует место на диске",
			"Выход индекса за границы диапазона"
	};
	int howbad[] = {3, 3, 2, 4};
	
	Err getErrorInfo(int i) {
		if(i >= 0 & i < messages.length) {
			return new Err(messages[i], howbad[i]);
		}
		else {
			return new Err("несуществующий код ошибки", 0);
		}
	}
}

class ErrInfo {
	public static void main(String args[]) {
		ErrorInfo err = new ErrorInfo();
		Err e;
		
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " уровень: " + e.severity);
		
		e = err.getErrorInfo(17);
		System.out.println(e.msg + " уровень: " + e.severity);
	}
}