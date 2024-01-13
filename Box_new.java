package fun;
class Box
{
    double w,h,d;
    Box(double w,double h,double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
    Box()
    {
        this.w=-1;
        this.h=-1;
        this.d=-1;
    }
    double volume()
    {
        return w*h*d;
    }
}

public class Box_new {
    public static void main(String args [])
    {
        Box b1=new Box(1,2,3);
        Box b2=new Box();
        double vol;
        vol=b1.volume();
        System.out.println("volume of b1 "+vol);
        vol=b2.volume();
        System.out.println("volume of b2 "+vol);

    }
}
