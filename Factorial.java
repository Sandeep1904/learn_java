import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        byte a, i;

        Scanner xe = new Scanner(System.in);
        System.out.println("give any number ");
        a = xe.nextByte();
        if (a > 0) {
            for (i = (byte) (a - 1); i > 0; i--) {
                a *= i;
            }
            System.out.println(a);
        }
        else {
            System.out.println("rerun the program and enter a psitive number!");
        }
    }
}