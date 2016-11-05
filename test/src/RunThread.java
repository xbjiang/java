
public class RunThread implements Runnable {
	public int count = 0;
    public static void main(String[] args) {
    	RunThread runnable = new RunThread();
    	
    	Thread alpha = new Thread(runnable);
    	Thread beta = new Thread(runnable);
    	alpha.setName("alpha");
    	beta.setName("beta");
    	
    	alpha.start();
    	beta.start();
    }
    
    public void run() {
    	go();
    }
    
    public synchronized void go() {
    	for (int i = 0; i < 25; i++) {
    		count++;
    		String name = Thread.currentThread().getName();
    		System.out.println(count + " " + name + " is running!");
    	}
    }
}
