package holding;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args)
    {
    	PriorityQueue<Integer> priorityQueue = 
    			new PriorityQueue<>();
    	Random rand = new Random();
    	for (int i = 0; i < 10; i++)
    		priorityQueue.offer(rand.nextInt(i+10));
    	QueueDemo.printQ(priorityQueue);
    	List<Integer> ints = Arrays.asList(23, 12,
    			42, 12, 4, 1, 4, 5, 1, 34, 5);
    	priorityQueue = new PriorityQueue<Integer>(ints);
    	QueueDemo.printQ(priorityQueue);
    	priorityQueue = new PriorityQueue<Integer>(
    			ints.size(), Collections.reverseOrder());
    	priorityQueue.addAll(ints);
    	QueueDemo.printQ(priorityQueue);
    	
    	String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
    	List<String> strings = Arrays.asList(fact.split(" "));
    	PriorityQueue<String> stringPQ = 
    			new PriorityQueue<>(strings);
    	QueueDemo.printQ(stringPQ);
    	stringPQ = new PriorityQueue<String>(
    			strings.size(), Collections.reverseOrder());
    	stringPQ.addAll(strings);
    	QueueDemo.printQ(stringPQ);
    	
    	Set<Character> charSet = new HashSet<>();
    	for (char c : fact.toCharArray())
    		charSet.add(c);
    	PriorityQueue<Character> charPQ = 
    			new PriorityQueue<>(charSet);
    	QueueDemo.printQ(charPQ);
    }
}
