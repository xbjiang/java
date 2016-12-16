package concurrency;

import java.util.concurrent.locks.*;

public class EvenGenerator extends IntGenerator {
	private int currentEvenValue = 0;
//	public synchronized int next() {
//		currentEvenValue++;
//		Thread.yield();
//		currentEvenValue++;
//		return currentEvenValue;
//	}
	private Lock lock = new ReentrantLock();
	public int next() {
		try {
			lock.lock();
			currentEvenValue++;
			Thread.yield();
			currentEvenValue++;
			return currentEvenValue;
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}
}
