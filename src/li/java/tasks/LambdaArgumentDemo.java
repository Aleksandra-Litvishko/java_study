package li.java.tasks;

interface StringFunc {
		String func(String str);
}

public class LambdaArgumentDemo {
	
	static String changeStr(StringFunc sf, String str) {
		return sf.func(str);
	}
	
	public static void main(String args[]) {
		String inStr = "Лямбда-выражения расширяют Java";
		String outStr;
		
		System.out.println(inStr + " - входная строка");
		
		StringFunc reverse = (str) -> {
			String result = "";
			
			for(int i = str.length() - 1; i >= 0;i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println(changeStr(reverse, inStr)); // поменять символы в строке наоборот
		
		outStr = changeStr((str) -> str.replace(" ", "_"), inStr);// лямбда-выражение непосредственно внедряется в вызов метода
		
		System.out.println(outStr);
		
		StringFunc changeCase = (str) -> {
			String result = "";
			char ch;
			
			for(int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				
				if(Character.isUpperCase(ch))
					result += Character.toLowerCase(ch);
				else result += Character.toUpperCase(ch);
			}
			return result;
		};
		
		System.out.println(changeStr(changeCase, inStr)); // меняем регистр символов в строке
	}
}