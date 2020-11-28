package com.company;
import java.util.Scanner;
abstract class cal_functions
{

    abstract float addition();

    abstract float subtraction();

    abstract float multiplication();

    abstract float division();
}

class functionality extends cal_functions
{
    private float first_number;
    private float second_number;

    public functionality(float first_number, float second_number)
    {
        this.first_number = first_number;
        this.second_number = second_number;
    }

    @Override
    float addition()
    {
        return first_number+second_number;
    }

    float subtraction()
    {
        return first_number-second_number;
    }

    float multiplication()
    {
        return first_number*second_number;
    }

    float division()
    {
        return first_number/second_number;
    }
}

 class assignment2q1 {
    public static void main(String[] args) {
        String op,rop;
        Scanner s=new Scanner(System.in);
        do {


            System.out.println("Enter 1st value");
            float numb1 = s.nextFloat();

            System.out.println("Enter 2nd value");
            float numb2 = s.nextFloat();

            cal_functions sn = new functionality(numb1, numb2);
            System.out.println("Choose Operator (+,-,*,/) ");
            op = s.next();

            switch (op) {
                case "+":
                    System.out.println("The Sum is: " + sn.addition());
                    break;
                case "-":
                    System.out.println("The Subtraction of two numbers is: " + sn.subtraction());
                    break;
                case "*":
                    System.out.println("The Multiplication of two numbers is: " + sn.multiplication());
                    break;
                case "/":
                    System.out.println("The division of two numbers is: " + sn.division());
                    break;

            }
            System.out.println("do you want to operate again?");
            rop=s.next();
        }while (rop == "y");
    }
}
