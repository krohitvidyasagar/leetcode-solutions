class Solution {
    public String reversePrefix(String word, char ch) {
        char[] wordArray = word.toCharArray();

        int i = 0;
        for(char a: wordArray) {
            if(a == ch)
            break;
            i++;
        }

        if(wordArray.length == i)
        return word;

        char temp;
        for(int left = 0, right = i; left < right; left++, right--) {
            temp = wordArray[left];
            wordArray[left] = wordArray[right];
            wordArray[right] = temp;
        }

        return new String(wordArray);
    }
}