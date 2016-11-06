package LotteryDrawing;

import java.util.*;

public class LotteryDrawing {
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("How many numbers do you need to draw?");
    	int k = in.nextInt();
    	
    	System.out.println("What is the highest number you can draw?");
    	int n = in.nextInt();
    	
    	int[] numbers = new int[n];
    	for (int i = 0; i < n; i++)
    		numbers[i] = i+1;
    	
    	int[] results = new int[k];
    	for (int i = 0; i < k; i++)
    	{
    		int r = (int)(Math.random()*n);
    		results[i] = numbers[r];
    		
    		numbers[r] = numbers[n-1];
    		n--;
    	}
    	Arrays.sort(results);
    	System.out.println("Bet the following combination! It will make you rich!");
    	for (int i : results)
    		System.out.println(i);
    	in.close();
    }
}
