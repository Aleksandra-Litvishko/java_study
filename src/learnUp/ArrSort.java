package learnUp;

class ArrSort {
    public static void main(String args[]) {
        int arr[] = new int[]{57, 25, 6, 44, 95, 95, 22, 8, 63, 65};
        int min, temp = 0;

        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

//		for(int i = 0; i < arr.length; i++) {
//			for(int j = arr.length - 1; j > i; j--) {
//				if(arr[j-1] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
    }
}