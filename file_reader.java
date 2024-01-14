package fun;
import java.io.*;
public class file_reader {
    public static void main(String args[]) throws IOException 
    {
        int i;
        FileInputStream fin;
        try
        {
            fin = new  FileInputStream(args[0]);
        }
        catch(FileNotFoundException e )
        {
            System.out.println("noy");
            return ;

        }
        try
        {
            do
            {
                i=fin.read();
                if(i!=-1)
                {
                    System.out.println((char)i);
                }
            }while(i!=-1);
            fin.close();
        }
        catch(IOException e )
        {
            System.out.println("erreo");
        }

    }
}
