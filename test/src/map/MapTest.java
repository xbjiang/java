package map;

import java.util.*;
import employee.Employee;

public class MapTest {
    public static void main(String[] args)
    {
    	Map<String, Employee> staff = new HashMap<>();
    	staff.put("123", new Employee("Amy Lee"));
    	staff.put("234", new Employee("Harry Hacker"));
    	staff.put("345", new Employee("Gary Cooper"));
    	staff.put("456", new Employee("Francesca Cruz"));
        
    	System.out.println(staff);
    	
    	staff.remove("234");
    	
    	staff.put("456", new Employee("Francesca Miller"));
        
    	System.out.println(staff.get("345"));
    	
    	for (Map.Entry<String, Employee> entry : staff.entrySet())
    	{
    		String key = entry.getKey();
    		Employee value = entry.getValue();
    		System.out.println("key:"+key+", value:"+value);
    	}
    }
}
