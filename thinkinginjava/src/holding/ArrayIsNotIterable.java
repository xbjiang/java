package holding;

import java.util.*;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> t)
    {
    	for (T s : t)
    		System.out.print(s + " ");
    	System.out.println();
    }
    
    public static void main(String[] args)
    {
    	test(Arrays.asList(1,2,3));
    	String[] s = {"A", "B", "C"};
    	test(Arrays.asList(s));
    }
}
