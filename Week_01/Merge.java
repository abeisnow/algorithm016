class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tailIndex = nums1.length - 1;
        int nums1TailIndex = m - 1;
        int nums2TailIndex = n - 1;
        while (nums1TailIndex >= 0 && nums2TailIndex >= 0) {
            if (nums1[nums1TailIndex] >= nums2[nums2TailIndex]) {
                nums1[tailIndex--] = nums1[nums1TailIndex--];
            } else {
                nums1[tailIndex--] = nums2[nums2TailIndex--];
            }
        }
        if (nums2TailIndex != -1)
          System.arraycopy(nums2,0,nums1,0,tailIndex + 1);
        

    }
}