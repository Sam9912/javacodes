package com.company;
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        int a;
        int b;
        String ch,op;
//        System.out.println(b);
        Scanner x = new Scanner(System.in);
        do {
            System.out.println("enter first number");
            a = x.nextInt();
            System.out.println("enter  number");
            b = x.nextInt();
            System.out.println("enter the operator");
            op = x.next();
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;

                case "-":
                    System.out.println(a - b);
                    break;

                case "*":
                    System.out.println(a * b);
                    break;

                case "/":
                    System.out.println(a / b);
                    break;
            }
            System.out.println("press y to continue 'n' to exit ");
             ch = x.next();
        } while (ch=="y");
    }
}
