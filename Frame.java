package fun;
import javax.swing.*;
public class Frame
{
    Frame()
    {
        JFrame a=new JFrame("A Simple Swing application");
        a.setSize(1600,2100);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
    public static void main(String [] args)
    {
        new Frame();
    }
}
