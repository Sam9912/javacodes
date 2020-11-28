package com.company;
class employee
{
    private int emp_id;
    private String emp_name;

    public employee() {
        emp_id=0;
        emp_name="none";
    }

    public employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
    void emp_info()
    {
        System.out.println("Employee id: "+emp_id);
        System.out.println("Employee name: "+emp_name);

    }


}
class permanent_emp extends employee
{
    private int salary;

    public permanent_emp(int emp_id, String emp_name, int salary) {
        super(emp_id, emp_name);
        this.salary = salary;
    }


    @java.lang.Override
    void emp_info() {
        super.emp_info();
        System.out.println("The salary of a permanent employee is: "+salary);

    }
}
class temp_emp extends permanent_emp
{
   int duration;

    public temp_emp(int emp_id, String emp_name, int salary, int duration) {
        super(emp_id, emp_name, salary);
        this.duration = duration;
    }

    @java.lang.Override
    void emp_info() {
        super.emp_info();
        System.out.println("the total duration of project is: "+ duration+" years");
    }
}
public class oopconcepts {
    public static void main(String[] args) {
        temp_emp t=new temp_emp(2,"Ali",100000,5);
        t.emp_info();

    }
}
