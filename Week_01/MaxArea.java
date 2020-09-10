class MaxArea {
    public int _maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max,minHeight*(j-i+1));

        }
        return max;

    }
}