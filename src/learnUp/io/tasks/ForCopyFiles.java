package learnUp.io.tasks;

class ForCopyFiles {
	public static void main(String args[]) {
		FilesWithSymbols newfiles = new FilesWithSymbols(args[0], args[1]);
		
		if(newfiles.Copy() == false) System.out.println("����������� �� �������!");
		else System.out.println("����������� ������� ���������");
	}
}