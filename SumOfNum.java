class SumOfNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            // sum +=i;
        }
        System.out.print("The Sum of 100 Number:" + sum);
    }
}