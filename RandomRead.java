import java.util.*;
import java.lang.Math;


class RandomRead {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0; i<10;i++){
            int n = random.nextInt();
            int m = random.nextInt();
//            here ternary condition statement is used for the calculation of minimum random value
//            we can also create a new method for this calculation and use it here by calling that method.
            int a = n>m ? m:n;
            System.out.println("first random number is "+ n);
            System.out.println("second random number is "+m);
            System.out.println("the minimum of the two numbers is " +a);
        }





    }

}