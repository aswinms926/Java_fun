package fun;
import java.io.*;
import java.util.Scanner;
class Facto
{
    int fact(int i)
    {

       if(i==1)
       {
           return 1;
       }
       else {
           return fact(i-1)*i;

       }
    }
}

public class Factorial {
    public static void main(String args[])
    {
        Facto b= new Facto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
         int result=b.fact(n);
        System.out.println("factorial of the number "+n+" is "+result);
    }
}
