package Queues;

public interface ICharQ {
	void put(char ch);
	char get();
	void reset();
	int getSize();
}