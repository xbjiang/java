package pair2;

import java.util.*;
import pair1.Pair;

public class PairTest2 {
    public static void main(String[] args)
    {
    	GregorianCalendar[] birthday = {
    			new GregorianCalendar(1990, Calendar.DECEMBER, 29),
    			new GregorianCalendar(1991, Calendar.APRIL, 29),
    			new GregorianCalendar(1992, Calendar.FEBRUARY, 2),
    			new GregorianCalendar(1993, Calendar.MARCH, 15)
    	};
    	Pair<GregorianCalendar> pair = ArrayAlg.minmax(birthday);
    	System.out.println("min = "+pair.getFirst().getTime());
    	System.out.println("max = "+pair.getSecond().getTime());
    }
}

class ArrayAlg
{
    public static <T extends Comparable> Pair<T> minmax(T[] a)
    {
    	if (a == null || a.length == 0) return null;
    	T min = a[0];
    	T max = a[0];
    	for (T s : a)
    	{
    		if (s.compareTo(min) < 0) min = s;
    		if (s.compareTo(max) > 0) max = s;
    	}
    	return new Pair<T>(min, max);
    }
}
