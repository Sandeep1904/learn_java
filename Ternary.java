import java.util.*;

class Ternary {
    public static void main(String[] args) {
        Scanner xe = new Scanner(System.in);
        int n,m;
        System.out.println("enter two integers: ");
        n = xe.nextInt();
        m = xe.nextInt();
        int max = (n>m) ? n:m;
        int min = (n>m) ? m:n;
        System.out.println("the minimum value is "+ min +" and the maximum value is "+max);
    }
}