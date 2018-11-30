package li.java.patterns.Iterator;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		ArrayList menus = new ArrayList();
		menus.add(pancakeMenu);
		menus.add(dinnerMenu);
		menus.add(cafeMenu);
		
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}