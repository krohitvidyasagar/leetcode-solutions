class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        boolean newWord = true;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch) && newWord) {
                newWord = false;
                lastWordLength = 1;
            } else if(!Character.isWhitespace(ch)){
                lastWordLength++;
            } else if (Character.isWhitespace(ch)) {
                newWord = true;
            }
        }
        return lastWordLength;
    }
}