package learnUp; // ������������� ���������� ���������� length

class LengthDemo{
	public static void main(String args[]) {
		
		int list[] = new int[10];
		int nums[] = {1, 2, 3};
		int table[] [] = {
				{5, 7, 3},
				{6,1},
				{8, 2, 4, 5},
		};
		
		System.out.println("������ ������: " + list.length);
		System.out.println("������ nums: " + nums.length);
		System.out.println("������ table: " + table.length);
		System.out.println("������ table[0]: " + table[0].length);
		System.out.println("������ table[1]: " + table[1].length);
		System.out.println("������ table[2]: " + table[2].length);
		
		
		for(int i = 0; i < list.length; i++) {
			list[i] = i * i;
		}
		
		System.out.print("������: ");
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}