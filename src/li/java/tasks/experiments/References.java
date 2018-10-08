package li.java.tasks.experiments;

import java.lang.ref.*;

public class References {
	public static void main(String args[]) {
		SoftReference<References> softRefer = new SoftReference<>(new References());
		System.out.println("Классы мягкой ссылки и самого объекта:");
		System.out.println(softRefer.getClass().getName());
		System.out.println(softRefer.get().getClass().getName());
		System.out.println();
		
		System.out.println("Классы слабой ссылки и самого объекта:");
		WeakReference<References> weakRefer = new WeakReference<>(new References());
		System.out.println(weakRefer.getClass().getName());
		System.out.println(weakRefer.get().getClass().getName());
		System.out.println();
		
		System.out.println("Классы фантомной ссылки и самого объекта:");
		ReferenceQueue<References> queue = new ReferenceQueue<>();
		PhantomReference<References> phantomRefer = new PhantomReference<>(new References(),queue);
		System.out.println(phantomRefer.getClass().getName());
		// System.out.println(phantomRefer.get().getClass().getName()); NullPointerException т.к. для PhantomReference get() всегда возвращает null
		// System.out.println(queue.poll().getClass().getName()); Возвращает null, пока объект не перемещён очереди
	}
}
