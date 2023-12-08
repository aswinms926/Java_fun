package JAVA;

import java.util.Scanner;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.*;

public class readerwriter {



    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter text to write to Sample.txt:");
        String text = read.nextLine();

        FileWriter out;

        try

        {

            out = new FileWriter("Sample.txt");

            out.write(text);

            out.flush();

        }

        catch(IOException e)

        {

            System.out.println(e);

        }

        FileReader finp;

        FileWriter output;

        try

        {

            finp=new FileReader("Sample.txt");

            output=new FileWriter("NewSample.txt");

            int i;

            while ((i=finp.read())!=-1)

            {

                output.write(i);

                System.out.println("Data write is: "+(char)i);



            }output.flush();

        }

        catch(FileNotFoundException e)

        {

            System.out.println(e);

        }



        catch(IOException e)

        {

            System.out.println(e);

        }

    }

}