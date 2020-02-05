class Outer1
{
    int a=10;
    class Inner
    {
        void f1()
        {
            System.out.println("Inner class");
        }
    }
    public static void main(String args[])
    {

        Outer1 out = new Outer1();
        Outer1.Inner o1 = out.new Inner();
        o1.f1();
    }
}