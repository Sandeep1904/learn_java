class Loops {
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // basic for loop!
        for (int i = 0; i < vowels.length; ++ i) {
            System.out.print(vowels[i]+ " ");

        }
        System.out.println();
        // using for-each loop!
        for (char item: vowels) {
            System.out.print(item+ " ");

        }
        System.out.println();
    }
}