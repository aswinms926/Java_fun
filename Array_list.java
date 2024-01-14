package fun;
import java.util.*;
public class Array_list {
    public static void main(String args[])
    {
        ArrayList<String> n=new ArrayList<>();
        n.add("java");
        n.add("python");
        n.add("shift");
        System.out.println("Array LIst "+n);
        n.add(0,"c");
        System.out.println("Modified Array list : "+n);
    }
}
