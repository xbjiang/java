package holding;

import java.util.*;

public class StackTest {
    public static void main(String[] args)
    {
    	Stack<String> stack = new Stack<>();
    	for (String s : "My dog has fleas".split(" "))
    		stack.push(s);
    	while (!stack.isEmpty())
    	    System.out.print(stack.pop() + " ");
    }
}