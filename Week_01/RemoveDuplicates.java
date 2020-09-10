class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {

        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[first] != nums[i]) {
            	nums[++first] = nums[i];
            }
        }
        return first+1;
    }
}