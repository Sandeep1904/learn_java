import java.util.*;
class Student10{
    static int roll;
    String name;

    static void update()
    {
        System.out.println("the roll no of the student is " + roll);
    }
    public static void main(String args[])
    {
        Scanner xe = new Scanner(System.in);
        roll = xe.nextInt();
        Student10 student10 = new Student10();
        student10.update();
    }
}