class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = 1000000;

        for (int value: prices) {
            if (value < lowest) {
                lowest = value;
            }
            if (value - lowest > max) {
                max = value - lowest;
            }   
        }
        return max;
    }
}