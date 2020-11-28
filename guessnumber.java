package com.company;
import java.util.Scanner;
import java.util.Random;
public class guessnumber {
    public static void main(String[] args) {
        int range = 6;
        int turns=0;
        int score=0;
        Random r = new Random();

        Scanner s = new Scanner(System.in);

        while (turns<=5)
        {
            int rn = r.nextInt(range);
            System.out.println("enter a number between 0,5");
            int u = s.nextInt();
            if (u == rn) {
                System.out.println("correct guess you win");
                score++;
                turns--;
            } else {
                System.out.println("Try Again");
//                System.out.println("the correct number was: " + rn);

            }

            turns++;
        }
        System.out.println("number of turns exceed");
        System.out.println("your score is  "+ score);
    }
}
