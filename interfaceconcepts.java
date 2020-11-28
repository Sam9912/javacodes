package com.company;

import java.util.Scanner;

interface first_interface
{
    public float addition();
    public float subtraction();
}
interface second_interface
{
    public float multiplication();
    public float division();
}
class perform_calculations implements first_interface,second_interface
{
    private float num1;
    private float num2;

    public perform_calculations(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float addition()
    {
        return num1+num2;
    }
    public float subtraction() {
        return num1-num2;
    }


    public float multiplication() {
        return num1*num2;
    }

   public float division() {
        return num1/num2;
    }
}


public class interfaceconcepts {
    public static void main(String[] args) {
        String opr, urep;
        Scanner s = new Scanner(System.in);
        do {


            System.out.println("Enter 1st value");
            float numb1 = s.nextFloat();

            System.out.println("Enter 2nd value");
            float numb2 = s.nextFloat();

            perform_calculations pc = new perform_calculations(numb1, numb2);
            System.out.println("Choose Operator (+,-,*,/) ");
            opr = s.next();
            switch (opr) {
                case "+":
                    System.out.println("The Sum is: " + pc.addition());
                    break;
                case "-":
                    System.out.println("The Subtraction of two numbers is: " + pc.subtraction());
                    break;
                case "*":
                    System.out.println("The Multiplication of two numbers is: " + pc.multiplication());
                    break;
                case "/":
                    System.out.println("The division of two numbers is: " + pc.division());
                    break;

            }
            System.out.println("do you want to operate again?");
            urep=s.next();
        }while (urep == "y");
    }
    }


