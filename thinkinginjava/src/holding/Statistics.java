package holding;

import java.util.*;

public class Statistics {
    public static void main(String[] args)
    {
    	Map<Integer, Integer> map = new HashMap<>();
    	Random rand = new Random(47);
    	for (int i = 0; i < 100000; i++)
    	{
    		int r = rand.nextInt(20);
    		Integer freq = map.get(r);
    		map.put(r, freq == null ? 1 : freq+1);
    	}
    	System.out.println(map);
    }
}
