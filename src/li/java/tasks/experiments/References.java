package li.java.tasks.experiments;

import java.lang.ref.*;

public class References {
	public static void main(String args[]) {
		SoftReference<References> softRefer = new SoftReference<>(new References());
		System.out.println("������ ������ ������ � ������ �������:");
		System.out.println(softRefer.getClass().getName());
		System.out.println(softRefer.get().getClass().getName());
		System.out.println();
		
		System.out.println("������ ������ ������ � ������ �������:");
		WeakReference<References> weakRefer = new WeakReference<>(new References());
		System.out.println(weakRefer.getClass().getName());
		System.out.println(weakRefer.get().getClass().getName());
		System.out.println();
		
		System.out.println("������ ��������� ������ � ������ �������:");
		ReferenceQueue<References> queue = new ReferenceQueue<>();
		PhantomReference<References> phantomRefer = new PhantomReference<>(new References(),queue);
		System.out.println(phantomRefer.getClass().getName());
		// System.out.println(phantomRefer.get().getClass().getName()); NullPointerException �.�. ��� PhantomReference get() ������ ���������� null
		// System.out.println(queue.poll().getClass().getName()); ���������� null, ���� ������ �� ��������� �������
	}
}
