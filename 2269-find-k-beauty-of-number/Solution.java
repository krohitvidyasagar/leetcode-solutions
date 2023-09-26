class Solution {
    public int divisorSubstrings(int num, int k) {
        String numString = String.valueOf(num);
        String subString;

        int count = 0;
        for (int i = 0; i <= numString.length() - k; i++) {
            subString = numString.substring(i, i + k);

            if (Integer.parseInt(subString) != 0 && num % Integer.parseInt(subString) == 0) {
                count++;
            }
        }

        return count;
    }
}