package pair1;

public class PairTest1 {
    public static void main(String[] args)
    {
    	String[] a = {"I", "am", "a", "genius"};
    	Pair<String> ret = ArrayAlg.minmax(a);
    	System.out.println("min = " + ret.getFirst());
    	System.out.println("max = " + ret.getSecond());
    }
}

class ArrayAlg
{
	public static Pair<String> minmax(String[] a)
	{
		if (a == null || a.length == 0) return null;
		String min = a[0];
		String max = a[0];
		for (String s : a)
		{
			if (s.compareTo(min) < 0) min = s;
			if (s.compareTo(max) > 0) max = s;
		}
		return new Pair<String>(min, max);
	}
}


