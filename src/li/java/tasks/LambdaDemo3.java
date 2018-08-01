package li.java.tasks;

interface StringTest {
	boolean test(String a, String b);
}

public class LambdaDemo3 {
	public static void main(String args[]) {
		StringTest isIn = (a,b) -> a.indexOf(b) != -1;
		
		String str = "это тест";
		
		System.out.println("Тестируемая строка: " + str);
		
		if(isIn.test(str, "это")) System.out.println("'это' найдено");
		else System.out.println("'это' не найдено");
		
		if(isIn.test(str, "wf")) System.out.println("'wf' найдено");
		else System.out.println("'wf' не найдено");
	}
}