package fun;
class demo
{
     static int a=99;
     static int b=100;
     static void callme()
     {
         System.out.println(" "+a);
     }
}
public class Static_method {
    public static void main(String args[])
    {
        demo.callme();
        System.out.println(" "+demo.b);
    }
}
