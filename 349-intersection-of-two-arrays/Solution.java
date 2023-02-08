class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) {
        if (set1.contains(n)) {
            set2.add(n);
        }
    }

    int[] output = new int[set2.size()];
    int idx = 0;
    for (int s : set2) output[idx++] = s;
    return output;
  }
}