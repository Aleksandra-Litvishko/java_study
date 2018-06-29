package learnUp;

import java.io.*;

class TryFinally {
	public static void main(String args[]) {
		try {
			throw new FileNotFoundException();
		} finally {
			throw new NullPointerException();
		}
	}
}