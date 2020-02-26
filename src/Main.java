public class Main
{
    public static void main(String args[])
    {
        Test<Integer> g1 = new Test<Integer>();
        g1.set(123);
        System.out.println(g1.get());
    }
}