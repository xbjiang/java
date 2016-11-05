import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        String tmp = "";
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') i++;
            if (i < s.length()) {
                while (i < s.length() && s.charAt(i) != ' ') {
                    tmp += s.charAt(i);
                    i++;
                }
                stack.push(tmp);
                tmp = "";
            }
            
        }
        String res = "";
        while (stack.size() > 1) {
            res += stack.pop() + " ";
        } 
        if (!stack.empty())
            res += stack.pop();
        return res;
    }
    
    public static void main(String[] args) {
    	String s = "a";
    	Solution solution = new Solution();
    	String res = solution.reverseWords(s);
    	System.out.println(res);
    }
}