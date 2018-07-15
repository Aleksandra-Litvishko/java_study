package learnUp;

public class DBForGen {
	public static void main(String args[]) {
		DBGenData d = new DBGenData();
		
		
		System.out.println();
		for(int i = 0; i < 50; i++)
		System.out.println(d.genName() + " " + d.genSurname() + " " + d.genBirthDate());
	}
}