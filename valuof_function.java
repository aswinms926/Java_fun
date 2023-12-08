package JAVA;

class Box
{
    double weight,height,depth;
    Box(int w,int h,int d)
    {
        weight=w;
        height=h;
        depth=d;
    }
    public String toString()
    {
      return " dimensions are "+weight+" by "+height+" by "+depth;
    }
}
public class valuof_function
{
    public static void main(String args[])
    {
        Box b1=new Box(1,2,3);
        String s1="Box b1 : "+b1;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println("index 11 letter is : "+s1.charAt(11));
    }
}
