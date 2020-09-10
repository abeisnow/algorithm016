class ClimbStairs {
    public int _climbStairs(int n) {

        int tmp1 = 1, tmp2 = 2, tmp3 = 3;
        if (n <= 2) 
           tmp3 = n;
        for (int i=3; i < n+1; i++) {
            tmp3 = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = tmp3;
        }
        return tmp3;
    }
}