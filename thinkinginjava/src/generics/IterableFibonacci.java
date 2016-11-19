package generics;
import java.util.*;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFibonacci(int count) {n = count;}
    public Iterator<Integer> iterator() 
    {
    	return new Iterator<Integer>() {
    		public boolean hasNext() {return n > 0;}
    		public Integer next() {
    			n--;
    			return IterableFibonacci.this.next();
    		}
    		public void remove() {throw new UnsupportedOperationException();}
    	};
    }
    public static void main(String[] args)
    {
    	IterableFibonacci ifb = new IterableFibonacci(18);
    	for (Integer i : ifb) 
    		System.out.print(i + " ");
    }
}
