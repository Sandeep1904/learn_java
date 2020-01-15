import java.util.*;
import java.lang.Math;


class RandomRead {
    public static void main(String[] args) {
        double n = getRandomNumber();
        double m = getRandomNumber();

        double a = n>m ? m:n;
        System.out.println(n);
        System.out.println(m);
        System.out.println(a);
    }
    public static double getRandomNumber() {
        double x = Math.random();
        return x;
    }
}