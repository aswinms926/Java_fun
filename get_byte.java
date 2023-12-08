package JAVA;

public class get_byte
{
    public static void main(String args[])
    {
        String s="ABCD";
        byte [] b=s.getBytes();
        for (byte value : b) {
            System.out.print(value + " ");
        }
    }
}
