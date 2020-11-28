package com.company;
import java.io.*
public class filewriter {
    public static void main(String[] args) {
        try
        {
            FileWriter fw=new FileWriter("C:\Users\DELL\Desktop\java\info.txt");
            fw.write("BSCS 5-B");
            fw.close();

        }
    }
}
