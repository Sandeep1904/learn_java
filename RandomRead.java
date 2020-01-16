import java.util.*;
import java.lang.Math;


class RandomRead {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0; i<10;i++){
            int n = random.nextInt();
            int m = random.nextInt();
            int a = n>m ? m:n;
            System.out.println(n);
            System.out.println(m);
            System.out.println(a);
        }




    }
//    public static double getRandomNumber() {
//        double x = Math.random();
//        return x;
//    }
}