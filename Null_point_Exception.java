package fun;
class ClassB
{
    ClassB()
    {
        try
        {
            throw new NullPointerException("Demo");

        }
        catch( NullPointerException e)
        {
            System.out.println("caught exception");
            throw e;
        }
    }

}
public class Null_point_Exception {
    public static void main(String args[])
    {
        try
        {
            new ClassB();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught exception");
            throw e;
        }
    }

}
