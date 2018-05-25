package learnUp;

class ThrowsDemo { // использование ключевого слова throws
	public static char prompt(String a) 
			throws java.io.IOException { // оператор throws в объявлении метода
		
		System.out.println(a + ": ");
		return (char) System.in.read();
	}

	public static void main(String args[]) {
		char ch;
		
try {
	ch = prompt("Enter a letter"); // в методе prompt() может быть сгенерировано исключение, поэтому его вызов следует поместить в блок try 
}
catch(java.io.IOException exc) {
	System.out.println("произошло исключение ввода-вывода!");
	ch = 'X';
}
System.out.println("Вы нажали клавишу: " + ch);
	}
}