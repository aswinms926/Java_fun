package JAVA;

public class region_matches
{
    public static void main(String args[])
    {
        String s1="my name is Aswin";
        String s2= "is";
        boolean b=s1.regionMatches(8,s2,0,2);
        System.out.println(b);
    }
}
