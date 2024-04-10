package WIN;
import java.util.Scanner;
public class Roman_Integer {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the RomanInteger : ");
        String s=sc.nextLine();
        int i,num=0,ans=0;
        for(i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    num=1;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X':
                    num=10;
                    break;
                case 'L':
                    num=50;
                    break;
                case 'C':
                    num=100;
                    break;
                case 'D':
                    num=500;
                    break;
                case 'M':
                    num=1000;
                    break;
            }
            if(4*num<ans)
            {
                ans=ans-num;
            }
            else {
                ans=ans+num;
            }


        }
        System.out.printf("integer: %d\n", ans);


    }
}