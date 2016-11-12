package holding;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {super(c);}
	
	// 该方法返回一个实现了Iterable接口的匿名内部类，
	// 该匿名内部类实现了iterator方法，
	// iterator方法又返回了一个Iterator匿名内部类
	// 注意这里匿名内部类的书写方式
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator()
			{
				return new Iterator<T>() {
					private int current = size() - 1;
					public boolean hasNext() {return current > -1;}
					public T next() {return get(current--);}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}
public class AdapterMethodIdiom {
    public static void main(String[] args)
    {
    	ReversibleArrayList<String> ral = 
    		new ReversibleArrayList<>(
    			Arrays.asList("To be or not to be".split(" ")));
    	for (String s : ral)
    		System.out.print(s + " ");
    	System.out.println();
    	for (String s : ral.reversed())
    		System.out.print(s + " ");
    }
}
