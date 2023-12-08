package JAVA;
import java.io.*;
public class bytetostring
{
    public static void main(String args [])
    {
        byte a[]={65,66,67};
        String s1=new String(a);
        System.out.println("ascii value is "+s1);
        System.out.println("Length of the string is "+s1.length());
        String s2="Ascii values of 65,66,67 are " +s1;
        System.out.println(s2);
    }
}
