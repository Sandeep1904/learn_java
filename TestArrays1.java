public class TestArrays1
{
    public static void main(String[] args)
    {
        int[] a = {22,33,44,55,66,77,88,99};
        System.out.println("a: "+ a);
        print(a);
        int[] aa = new int[a.length];
        System.out.println("aa: " + aa);
        print(aa);
        System.arraycopy(a, 0, aa, 0,a.length);
        System.out.println("aa: " + aa);
        print(aa);
        aa[1] = 11;
        print(a);
        print(aa);
        aa = new int[12];
        System.arraycopy(a, 0, aa, 3,8);
        System.out.println("aa: " + aa);
        print(aa);
        System.arraycopy(aa, 3, aa, 1,5);
        System.out.println("aa: " + aa);
        print(aa);
    }
    public static void print(int[] a)
    {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}