package li.java.tasks.lambda;

interface StringFunc {
	String func(String str);
}

public class LambdaArgumentDemo {

	static String changeStr(StringFunc sf, String str) {
		return sf.func(str);
	}

	public static void main(String args[]) {
		String inStr = "������-��������� ��������� Java";
		String outStr;

		System.out.println(inStr + " - ������� ������");

		StringFunc reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};

		System.out.println(changeStr(reverse, inStr)); // �������� ������� � ������ ��������

		outStr = changeStr((str) -> str.replace(" ", "_"), inStr);// ������-��������� ��������������� ���������� � �����
																	// ������

		System.out.println(outStr);

		StringFunc changeCase = (str) -> {
			String result = "";
			char ch;

			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);

				if (Character.isUpperCase(ch))
					result += Character.toLowerCase(ch);
				else
					result += Character.toUpperCase(ch);
			}
			return result;
		};

		System.out.println(changeStr(changeCase, inStr)); // ������ ������� �������� � ������

		StringFunc deleteSpace = (str) -> {
			String result = "";
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch != ' ') {
					result += ch;
				}
			}
			return result;
		};
		
		System.out.println(changeStr (deleteSpace, inStr));
	}
}