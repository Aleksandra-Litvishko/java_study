package learnUp;
class OuterClass {
	int room_volume[];
	
	OuterClass (int arr[]) {
		room_volume = arr;
	}
	
	void Analyze() {
		RoomSpace nspace = new RoomSpace();
		System.out.println("Площадь комнаты: " + nspace.space() + " " + "\nMаксимальное количество людей в помещении: " + nspace.people_count());
	}
	
	class RoomSpace {
		PeopleInRoom peop = new PeopleInRoom();
		int ar = 1;
		int space() {
			for(int i = 0; i < room_volume.length; i++) {
				ar *= room_volume[i];
			}
	return ar;		
}  
		int people_count() {
			return peop.MaxPeopleIn();
		}
		
		class PeopleInRoom {
			int MaxPeopleIn() {
				   return (int) (ar / 1.8);
			}
		}
	}
}

class NestedClassDemoForExp2 {
	public static void main(String args[]) {
		int x[] = {3, 8}; 
		OuterClass obOut = new OuterClass(x);
		
		obOut.Analyze();
	}
}