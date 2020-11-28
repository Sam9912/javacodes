package com.company;
class vehicle
{
    private String reg_no;
    private int speed;

    public vehicle(String reg_no, int speed) {
        this.reg_no = reg_no;
        this.speed = speed;
    }
    public void show_reg_no()
    {
        System.out.println("the reg no of vehicle is: "+ reg_no);
    }

    public void show_speed()
        {
            System.out.println("The Speed of vehicle is: "+speed);
}

}
class bus extends vehicle
{
    private int no_of_seats;
    private int no_of_wheels;

    public bus(String reg_no, int speed, int no_of_seats, int no_of_wheels) {
        super(reg_no, speed);
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    public void bus_info()
    {
        super.show_reg_no();
        System.out.println("The number of bus seats are: "+no_of_seats);
        System.out.println("The number of bus wheels are: "+no_of_wheels);
    }
}
class car extends vehicle
{
    private int no_of_seats;


    public car(String reg_no, int speed, int no_of_seats) {
        super(reg_no, speed);
        this.no_of_seats = no_of_seats;

    }

    public void car_info()
    {
        super.show_speed();
        System.out.println("The number of car seats: "+ no_of_seats);
    }

}

public class quiz2 {
    public static void main(String[] args) {
        car c=new car("MM-214",180,4);
                c.car_info();
                bus b=new bus("AB-512",80,14,10);
                b.bus_info();
    }
}
