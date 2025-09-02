class MyNumber {
    private int num;

    // Default constructor
    MyNumber() {
        num = 0;
    }

    // Parameterized constructor
    MyNumber(int n) {
        num = n;
    }

    void isPositive() {
        if (num > 0)
            System.out.println(num + " is Positive");
    }

    void isNegative() {
        if (num < 0)
            System.out.println(num + " is Negative");
    }

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]); // command line input
        MyNumber obj = new MyNumber(value);
        obj.isPositive();
        obj.isNegative();
    }
}
