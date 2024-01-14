package fun;
import java.util.*;
public class Array_list {
    public static void main(String args[])
    {
        ArrayList<Integer> n=new ArrayList<>(5);
        n.add(1);
        n.add(2);
        n.add(3);

        System.out.println("Array LIst "+n);

        ArrayList<Integer> m=new ArrayList<>(5);
        m.add(5);
        m.add(6);
        m.add(7);


            System.out.println("Array LIst "+m);

        n.addAll(m);

            System.out.println("Array LIst "+n);
    }
}
