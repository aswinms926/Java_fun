package fun;
class Test
{
    int a;
    Test(int i)
    {
        a=i;
    }
    Test incrby2()
    {
        Test temp=new Test(a+10);
        return temp;

    }

}
public class return_obj {
    public static void main(String args[])
    {
        Test b=new Test(2);
        Test c;
        c=b.incrby2();
        System.out.println(b.a);
        System.out.println(c.a);

    }
}
