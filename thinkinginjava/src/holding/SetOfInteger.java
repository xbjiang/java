package holding;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args)
    {
    	Random rand = new Random(47);
    	Set<Long> intset = new HashSet<>();
    	for (int i = 0; i < 10; i++)
    		intset.add(rand.nextLong());
    	System.out.println(intset);
    }
}
