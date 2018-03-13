package tasks;

class ForGeomPr {
	public static void main(String args[]) {
		
		System.out.print("Числа в геометрической прогрессии: ");
		for (int i = 1; ; i = i + i) { 
			System.out.print(i + " ");
			}
	}
}