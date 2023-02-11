class Solution {

    public String reverseOnlyLetters(String s) {
        char[] chArray = s.toCharArray();
        int left = 0, right = s.length() - 1;
        char tempChar;

        while(left < right) {
            if (!Character.isAlphabetic(chArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(chArray[right])) {
                right--;
            } else {
                tempChar = chArray[left];
                chArray[left] = chArray[right];
                chArray[right] = tempChar;
                left++;
                right--;
            }

        }

        return String.valueOf(chArray);
    }
}