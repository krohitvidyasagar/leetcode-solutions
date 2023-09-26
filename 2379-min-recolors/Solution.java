class Solution {
    public int minimumRecolors(String blocks, int k) {
        Set<Integer> whiteSet = new HashSet<>();

        int minCount = Integer.MAX_VALUE;
        char ch;

        int left = 0;
        for (int i = 0; i < blocks.length(); i++) {
            ch = blocks.charAt(i);

            if (ch == 'W') {
                whiteSet.add(i);
            }

            if ((i - left) == (k - 1)) {

                if (whiteSet.size() < minCount) {
                    minCount = whiteSet.size();
                }

                if (whiteSet.contains(left)) {
                    whiteSet.remove(left);
                    
                }
                left++;
            }
        }

        return minCount;
    }
}