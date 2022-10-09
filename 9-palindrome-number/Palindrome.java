/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
 */

public class Palindrome {

    public boolean isPalindrome(int x) {
        int remainder, temp = x, sum = 0;
        
        while(x > 0){    
            remainder = x % 10;
            sum = (sum*10) +remainder;    
            x = x / 10;    
           }    
        
        return sum == temp;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();

        int num = 245;
        boolean solution = obj.isPalindrome(num);

        System.out.println(num + " is a palindrome: " + solution);
    }
}
