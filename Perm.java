import java.util.*;

class Perm {
    public static void main(String[] args) {
        System.out.println("enter the number of rows: ");
        Scanner xe = new Scanner(System.in);
        long n = xe.nextInt();
        xe.close();
        dispPerm(n);

    }

    public static void dispPerm(long n) {
        long j;
        for (long i=0; i<=n ; i++,j=0) {
            for (j = 0; j<=i; j++) {
                System.out.print(calcperm(i,j)+" ");
            }
            System.out.println();
        }
    }

    public static long calcperm(long l, long m) {
        return fact(l)/fact(l-m);
    }

    public static long fact(long n) {
        if (n>1)
            return n*fact(n-1);
        else
            return 1;
    }
}