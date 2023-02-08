class Solution {
    public boolean isHappy(int n) {
        int count = 0;
        while (n != 1 && count != 20) {
            int x = 0;
            while (n != 0) {
                x = x + ((n % 10) * (n % 10));
                n = n / 10;
            }

            n = x;
            count++;
        }

        return n == 1;
    }
}