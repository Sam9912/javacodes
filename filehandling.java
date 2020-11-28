package com.company;
import java.io.*;
public class filehandling {
    public static void main(String[] args) {



        try {
            String filename = "info.txt";
            String line = null;
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine() )!= null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found "+filename);

        }
    }
}
