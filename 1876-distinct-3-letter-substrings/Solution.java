class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }

        Set<Character> charSet = new HashSet<>();
        char ch, removeCh;
        int left = 0, right = 0;
        int count = 0;

        while (right < s.length()) {
            ch = s.charAt(right);

            while (charSet.contains(ch)) {
                removeCh = s.charAt(left);
                charSet.remove(removeCh);
                left++;
            }

            charSet.add(ch);
            right++;

            if (right - left == 3) {
                count++;
                
                removeCh = s.charAt(left);
                charSet.remove(removeCh);

                left++;
            }
        }

        return count;
    }
}