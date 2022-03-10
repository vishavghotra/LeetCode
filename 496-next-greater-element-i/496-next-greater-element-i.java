class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = help(nums2, nums1[i]);

    }
    return nums1;
  }

  public int help(int[] nums2, int number) {
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] == number) {
        for (int j = i + 1; j < nums2.length; j++) {
          if (nums2[j] > number)
            return nums2[j];
        }
      }

    }
    return -1;

  }
}