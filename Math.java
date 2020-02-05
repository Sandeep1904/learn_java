class Math {
    private static void calculate() {
        int a = 3;
        int b = 34;
        int c = a+ b;
        System.out.println(c);
    }

    // A static inner class
    static class Operation {
        public static void main(String[] args) {
            System.out.println("inside inner class Method");
            calculate();
        }
    }

}