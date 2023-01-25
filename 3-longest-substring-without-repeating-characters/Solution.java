class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0, maxLength=0;

        Map<Character, Integer> charIndex = new HashMap<>();
        char ch, leftChar;
        while(right < s.length()) {
            ch = s.charAt(right);
            if (!charIndex.containsKey(ch)) {
                charIndex.put(ch, right);
                right++;
            } else {
                while(charIndex.containsKey(ch)) {
                    leftChar = s.charAt(left);
                    charIndex.remove(leftChar);
                    left++;
                }
            }

            if (right - left > maxLength) {
                maxLength = right - left;
            }
        }

        return maxLength;
    }
}