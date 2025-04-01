class sun {
    static int sum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        System.out.println("sum = " + sum(300));
    }
}