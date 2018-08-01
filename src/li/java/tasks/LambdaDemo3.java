package li.java.tasks;

interface StringTest {
	boolean test(String a, String b);
}

public class LambdaDemo3 {
	public static void main(String args[]) {
		StringTest isIn = (a,b) -> a.indexOf(b) != -1;
		
		String str = "��� ����";
		
		System.out.println("����������� ������: " + str);
		
		if(isIn.test(str, "���")) System.out.println("'���' �������");
		else System.out.println("'���' �� �������");
		
		if(isIn.test(str, "wf")) System.out.println("'wf' �������");
		else System.out.println("'wf' �� �������");
	}
}