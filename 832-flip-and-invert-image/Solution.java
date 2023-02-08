class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image) {
            int left = 0;
            int right = image.length - 1;

            int temp;
            while (left <= right) {
                temp = row[left];
                row[left] = (row[right] == 0) ? 1 : 0;
                row[right] = (temp == 0) ? 1 : 0;
                left++;
                right--;
            }
        }

        return image;
    }
}