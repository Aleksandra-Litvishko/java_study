package Queues;

public class QueueFullException extends Exception {

	int size;

	QueueFullException(int s) {
		size = s;
	}

	public String toString() {
		return "ќчередь заполнена, максимальный размер очереди: " + size;
	}
}
