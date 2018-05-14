package Queues;

public abstract class BaseQueue implements ICharQ {

	private int size;

	BaseQueue(int size) {
		this.setSize(size);
	}
	
	public abstract void put(char ch);
	public abstract void reset();
	public abstract char get();
	
	public int getSize() {
		return size;
	}

	public static void copy(BaseQueue itemFrom, BaseQueue itemTo) {
		int sizeFrom = itemFrom.getSize();
		int sizeTo = itemTo.getSize();
		int sizeMin = sizeFrom > sizeTo ? sizeTo : sizeFrom;

		for (int i = 0; i < sizeMin - 1; i++) {
			itemTo.put(itemFrom.get());
		}
	}

	public void setSize(int size) {
		this.size = size;
	}

}
