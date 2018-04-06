package learnUp;

class ForEachSearch {
	public static void main(String args[]) {
		int arr[] = {1,5,7,0,6,1456437, 45667,2445,-14,35,678,968,145};
		boolean presence = false;
		int val = 678;
		
		for(int x: arr) {
			if(x == val) {
				presence = true;
				break;
			}
		}
			
			if(presence) {
				System.out.println("Значение найдено!");
		}
	}
}