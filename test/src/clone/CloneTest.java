package clone;

public class CloneTest {
    public static void main(String[] args)
    {
        try
        {
        	Employee original = new Employee("Jack", 50000);
        	original.setHireDay(2001, 12, 2);
        	Employee copy = original.clone();
        	copy.setHireDay(2002, 12, 3);
        	copy.raiseSalary(10);
        	System.out.println(original);
        	System.out.println(copy);
        }
        catch (CloneNotSupportedException e)
        {
        	e.printStackTrace();
        }
    }
}
