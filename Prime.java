import java.util.*;

class Prime {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner xe = new Scanner(System.in);
        int n = xe.nextInt();
        int j;
        for (int i=2;i<n;i++) {
            boolean flag = false;
            for(j = 2;j<=i;j++)
            {
                if(isPrime(i,j) == flag)
                   flag = flag
            }
            System.out.print(i+" ");

        }

    }
    public static boolean isPrime(int p,int q) {
        if (p%q != 0)
            return false;
        else
            return true;
    }
}