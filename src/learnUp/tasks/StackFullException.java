package learnUp.tasks;

public class StackFullException extends Exception {
	int size;
	
	public StackFullException(int s) {
		size = s;
	}
	
	public String toString() {
		return "���� ��������. ������������ ������ �����: " + size;
	} 
}