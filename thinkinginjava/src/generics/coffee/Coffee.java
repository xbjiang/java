package generics.coffee;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++; // id can't be static. Think about why.
    public String toString() {
    	return getClass().getSimpleName() + " " + id;
    }
    public static void main(String[] args)
    {
    	Coffee c1 = new Coffee();
    	System.out.println(c1);
    	Coffee c2 = new Coffee();
    	System.out.println(c2);
    }
}
