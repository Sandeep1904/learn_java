import java.util.*;

class Recfact {
    public static void main(String[] args) {
        int n;
        Scanner xe = new Scanner(System.in);
        n = xe.nextInt();
        xe.close();
        System.out.println(fact(n));

    }

    public static int fact(int n) {
        if (n>1)
            return n*fact(n-1);
        else
            return 1;
    }
}