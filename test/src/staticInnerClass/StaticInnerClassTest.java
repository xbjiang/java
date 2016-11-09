package staticInnerClass;

import java.util.*;

public class StaticInnerClassTest {
    public static void main(String[] args)
    {
    	double[] numbers = new double[20];
    	for (int i = 0; i < numbers.length; i++)
    		numbers[i] = 100*Math.random();
    	ArrayAlg.Pair pair = ArrayAlg.minmax(numbers);
    	System.out.println(numbers);
    	System.out.println("min="+pair.getFirst()+", max="+pair.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair 
    {
    	private double first;
    	private double second;
    	
    	public Pair(double f, double s)
    	{
    		first = f;
    		second = s;
    	}
    	
    	public double getFirst() {return first;}
    	public double getSecond() {return second;}
    }
    
    public static Pair minmax(double[] numbers)
    {
    	double max = Double.MIN_VALUE;
    	double min = Double.MAX_VALUE;
    	for (double number : numbers)
    	{
    		if (number > max) max = number;
    		if (number < min) min = number;
    	}
    	return new Pair(min, max);
    }
}
