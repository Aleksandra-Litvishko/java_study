package learnUp;

class StrOpsForExp {
	public static void main(String args[]) {
		
		String arr1 = "Hey, people!";
		String arr2 = new String(arr1);
		String arr3 = "Hey, Hey, the funny way!";
		int x, s;
		boolean res;
		
		System.out.println("Длина arr1: " + arr1.length());
		
		x = arr1.compareTo(arr2);
		if(x == 0) {
			System.out.println("Длина arr1 соответствует длине arr2");
		}
		else if(x > 0) {
			System.out.println("Длина arr1 > arr2");
		}
		else {
			System.out.println("Длина arr1 < arr2");
		}
		
		x = arr2.compareTo(arr3);
		if(x == 0) {
			System.out.println("Длина arr2 соответствует длинее arr3");
		}
		else if(x > 0) {
			System.out.println("Длина arr2 > arr3");
		}
		else {
			System.out.println("Длина arr2 < arr3");
		}
		
		res = arr1.equals(arr2);
		if(res) {
			System.out.println("arr1 эквивалентен arr2");
		}
		else {
			System.out.println("arr1 не эквивалентен arr2");
		}
		
		res = arr2.equals(arr3);
		if(res) {
			System.out.println("arr2 эквивалентен arr3");
		}
		else {
			System.out.println("arr2 не эквивалентен arr3");
		}
		
		for(int i = 0; i < arr2.length(); i++) {
			System.out.print(arr1.charAt(i));
		}
		
		s = arr3.indexOf("Hey");
		if(s >= 0) {
		System.out.println("Индекс первого вхождения 'Hey': " + s);
		}
		else {
			System.out.println("'Hey' отсутствует в строке");
		}
		
		s = arr3.lastIndexOf("Hey");
		if(s >= 0) {
			System.out.println("Индекс последнего вхождения 'Hey': " + s);
			}
		else {
			System.out.println("'Hey' отсутствует в строке");
		}
		
		s = arr3.indexOf("Привет");
		if(s >= 0) {
			System.out.println("Индекс первого вхождения 'Привет': " + s);
			}
		else {
			System.out.println("'Привет' отсутствует в строке");
		}
		
		s = arr3.lastIndexOf("way");
		if(s >= 0) {
			System.out.println("Индекс последнего вхождения 'way': " + s);
			}
		else {
			System.out.println("'way' отсутствует в строке");
		}
		
		System.out.println();
		arr1 = arr2 + arr3; // для того, чтобы посмотреть как работает присваивание для объектов типа String
		System.out.println(arr1);
		System.out.println();
		
		arr2 = arr3;
		
		System.out.println(arr2);
		System.out.println(arr3);
		
		arr3 = arr1;
		
		System.out.println();
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		if(arr3 == arr1) {
			System.out.println("фкк ");
		}
	}
}