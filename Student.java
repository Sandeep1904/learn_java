class Student{
    static int roll = 34;
    String name;
    static void update()
    {
        System.out.println(roll);
    }
    public static void main(String args[])
    {
        Student.update();
    }
}