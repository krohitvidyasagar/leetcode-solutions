import java.util.Stack;

public class Solution { 
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char topOfStack = stack.peek();
                if (ch == ')' && topOfStack == '(') {
                    stack.pop();
                } else if (ch == ']' && topOfStack == '[') {
                    stack.pop();
                } else if (ch == '}' && topOfStack == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "()[]{}";
        
        Solution s1 = new Solution();
        
        boolean isValid = s1.isValid(str);
        
        System.out.println("Input is valid: " + isValid);
    }
}