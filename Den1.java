import java.util.*;
public class Den1 {
    public static void main(String[] args) {
        double i,n;
        double c = 0;
        Scanner xe = new Scanner(System.in);
        System.out.println("enter a number");
        n = xe.nextDouble();
        for (i=1;i<=n;i++) {
            c += 1/i;
        }
        System.out.println(c);
    }
}