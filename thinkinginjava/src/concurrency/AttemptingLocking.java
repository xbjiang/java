package concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AttemptingLocking {
	private ReentrantLock lock = new ReentrantLock();
	
	public void untimed() {
		boolean captured = lock.tryLock();
		try {
			System.out.println("tryLock(): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}
	
	public void timed() {
		boolean captured = false;
		try {
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		} catch(InterruptedException e) {
			throw new RuntimeException();
		}
		
		try {
			System.out.println("tryLock(2, TimeUnit.SECONDS): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}
	
	public static void main(String[] args) throws Exception {
		final AttemptingLocking al = new AttemptingLocking();
		al.untimed();
		al.timed();
		new Thread() {
			{setDaemon(true);}
			public void run() {
				al.lock.lock();
				System.out.println("acquired!");
			}
		}.start();
		Thread.yield();
		Thread.sleep(1000);
		al.untimed();
		al.timed();
	}
}
