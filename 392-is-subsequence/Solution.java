class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        char sChar, tChar;
        while(sIndex < s.length() && tIndex < t.length())
        {
            sChar = s.charAt(sIndex);
            tChar = t.charAt(tIndex);

            if (sChar != tChar) {
                tIndex++;
            } else {
                sIndex++;
                tIndex++;
            }
        }
        return sIndex == s.length();
    }
}