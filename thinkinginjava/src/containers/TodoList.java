package containers;
import java.util.*;

public class TodoList extends PriorityQueue<TodoList.TodoItem>{
    public static class TodoItem implements Comparable<TodoItem> {
        private String item;
        private char primary;
        private int secondary;
        public TodoItem(String td, char pri, int sec)
        {
        	item = td;
        	primary = pri;
        	secondary = sec;
        }
        public int compareTo(TodoItem other)
        {
        	if (primary > other.primary)
        		return +1;
        	if (primary == other.primary)
        		if (secondary > other.secondary)
        			return +1;
        		else if (secondary == other.secondary)
        			return 0;
        	return -1;
        }
        public String toString() {
        	return Character.toString(primary) + secondary
        			+ " : " + item;
        }
    }
    
    public void add(String item, char primary, int secondary)
    {
    	super.add(new TodoItem(item, primary, secondary));
    }
    public static void main(String[] args)
    {
    	TodoList todoList = new TodoList();
    	todoList.add("Empty trash", 'C', 4);
    	todoList.add("Feed dog", 'A', 2);
    	todoList.add("Feed bird", 'B', 7);
    	todoList.add("Mow lawn", 'C', 3);
    	todoList.add("Water lawn", 'A', 1);
    	todoList.add("Feed cat", 'B', 1);
    	while (!todoList.isEmpty())
    		System.out.println(todoList.remove());
    }
}
