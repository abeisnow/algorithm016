class AddDigits {
    public int addDigits(int num) {
        int result = 0;
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            result = 9;
        } else {
            result = num % 9;
        }
        return result;
    }
}