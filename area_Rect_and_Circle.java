package fun;
interface A
{
    static final double pi=3.14;
     double Area(double x,double y);
}
class Rectangle implements A
{

   public double Area (double x,double y)
    {
        return x*y;
    }
}
class Circle implements A {

     public double Area(double x,double y) {
        return pi*x*x;
    }
}
public class area_Rect_and_Circle
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle ();
        Circle c = new Circle();
        System.out.println(" area of rectangle = "+r.Area(1,2));
        System.out.println(" area of circle ="+c.Area(2,0));
    }

}
