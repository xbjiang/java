package concurrency;

import java.util.concurrent.*;
import java.util.*;

class TaskWithResults implements Callable<String> {
	private int id;

	public TaskWithResults(int id) {
		this.id = id;
	}

	public String call() {
		return "result of TaskWithResults " + id;
	}
}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			results.add(exec.submit(new TaskWithResults(i)));
		for (Future<String> fs : results) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				System.out.println(e);
			} catch (ExecutionException e) {
				System.out.println(e);
			} finally {
				exec.shutdown();
			}
		}
	}
}
