package JAVA;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class re
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data;
        System.out.println("Enter the data:");
        data = sc.nextLine();
        FileWriter out;
        try{
            out = new FileWriter("sample.txt");
            out.write(data);
            out.flush();
            System.out.println("data written successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e);
        }

        FileReader input;
        char[] inp = new char[11];
        try{
            input = new FileReader("sample.txt");
            input.read(inp);

            out=new FileWriter("newsample.txt");
            out.write(inp);
            out.flush();
            out.close();
            System.out.println("data written into new file");
        }
        catch(IOException e)
        {
            System.out.println("error:"+e);
        }
    }
}
