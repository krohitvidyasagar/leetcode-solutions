import java.util.HashMap;

public class Solution {

    int romanToInt(String s) {
        int totalSum = 0, lastNum = 0, currentNum;
        
        HashMap<Character, Integer> charNumMap = new HashMap<>();
        charNumMap.put('I', 1);
        charNumMap.put('V', 5);
        charNumMap.put('X', 10);
        charNumMap.put('L', 50);
        charNumMap.put('C', 100);
        charNumMap.put('D', 500);
        charNumMap.put('M', 1000);

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            currentNum = charNumMap.get(ch);

            if (currentNum < lastNum || currentNum == lastNum) {
                totalSum += lastNum;
            } else {
                totalSum -= lastNum;
            }

            lastNum = currentNum;
        }

        totalSum += lastNum;
        return totalSum;
    }

    public static void main(String[] args) {
        String romanNumber = "LVIII";
        int outputNumber = 58;

        Solution s1 = new Solution();

        int output = s1.romanToInt(romanNumber);

        if (outputNumber == output) {
            System.out.println("Correct output");
        } else {
            System.out.println("Wrong output");
        }
    }
    
}
