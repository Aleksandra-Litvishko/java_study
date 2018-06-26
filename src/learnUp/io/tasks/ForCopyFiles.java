package learnUp.io.tasks;

class ForCopyFiles {
	public static void main(String args[]) {
		Files newtry = new Files("D:\\helpfile.txt","D:\\newfile1.txt" );
		
		if(newtry.Copy() == false) System.out.println("Копирование не удалось!");
		else System.out.println("Копирование успешно завершено");
	}
}