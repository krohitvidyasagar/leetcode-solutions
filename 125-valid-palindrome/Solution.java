class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = s.length() - 1;
        char leftChar, rightChar;

        while(left < right) {
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);

            if (leftChar != rightChar) {
                return false;
            }

            right--;
            left++;
        }
        
        return true;
    }
}