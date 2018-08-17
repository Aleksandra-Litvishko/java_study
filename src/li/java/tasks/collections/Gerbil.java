package li.java.tasks.collections;

import java.util.*;

public class Gerbil {
	int gerbilNumber;
	
	public Gerbil(int number) {
			gerbilNumber = number;
		}
	
	public void hop() {
		System.out.println(gerbilNumber +  " Короткое сообщение");
	}
	
	public static void main(String args[]) {
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		
		gerbils.add(new Gerbil(0));
		gerbils.add(new Gerbil(56));
		gerbils.add(new Gerbil(235));
		gerbils.add(new Gerbil(25));
		gerbils.add(new Gerbil(13));
		gerbils.add(new Gerbil(136));
		gerbils.add(new Gerbil(468));
		
		for(int i = 0; i < gerbils.size(); i++) {
			gerbils.get(i).hop();
		}
	}
}