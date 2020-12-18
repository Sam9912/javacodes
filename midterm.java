////package com.company;
//import java.util.Scanner;
//interface IA
//{
//    void me();
//    void you();
//}
//class CA implements IA
//{
//    @Override
//    public void me() {
//        System.out.println("it is me from CA");
//    }
//
//    @Override
//    public void you() {
//        System.out.println("How are you from CA");
//    }
//}
//class CB implements IA
//{
//    @Override
//    public void me() {
//        System.out.println("it is me from CB");
//    }
//
//    @Override
//    public void you() {
//        System.out.println("How are you from CB");
//    }
//}
//public class midterm {
//    public static void main(String[] args) {
//        IA obj1=new CA();
//        IA obj2=new CB();
//        obj1.me();
//        obj1.you();
//        obj2.me();
//        obj2.you();
//
//
//    }
//}


/* q1 starts from here */

//class Example {
//    int y, z;
//    static int x;
//    static{x=5;}
//    Example () { x=x+1; y=0; z=0; }
//    Example (int a, int y, int z) { x=a; this.y=y; this.z=z; }
//    void show(){
//        System.out.println(x + y+ z);}}
//
//public class midterm {
//    public static void main(String[] args) {
//
//        Example ob2=new Example () ;
//        ob2.show();
//        Example ob1=new Example (4,5,3);
//        ob1.show();
//    }
//}


//q1 (a)


//class c1
//{
//    String name;
//
//    public c1(String name) {
//        this.name = name;
//    }
//}
//class c2 extends c1
//{
//    int age;
//
//    public c2(String name, int age) {
//        super(name);
//        this.age = age;
//    }
//}
//class c3 extends c2
//{
//    String arid_no;
//
//    public c3(String name, int age, String arid_no) {
//        super(name, age);
//        this.arid_no = arid_no;
//    }
//    void show_info()
//    {
//        System.out.println("Name:"+this.name + "\n Age: "+ this.age + "\n Arid no: " + this.arid_no );
//    }
//
//}
//
//public class midterm
//{
//    public static void main(String[] args) {
//        c3 obj =new c3("M.Mesum",20,"18-ARID-2527");
//        obj.show_info();
//
//    }
//}



//class Book
//{
//    String title,author;
//    float version,price;
//    Book(){
//    }
//    Book(String title, String author, float price, float version)
//    {
//        this.title=title;
//        this.author=author;
//        this.price=price;
//        this.version=version;
//
//    }
//    void display()
//    {
//
//        System.out.println("\n Book Title: "+title +"\n Book Author: " + author +"\n Book Price: " + price +"\n Book Sersion: "+version);
//
//    }
//}
//public class midterm
//{
//    public static void main(String[] args) {
//        Book obj1=new Book("THE 5AM CLUB", "Robin Sharma", 1000,2007);
//        Book obj2=new Book("GHOST IN THE WIRES", "Kevin Mitnick", 1300,2013);
//        obj1.display();
//        obj2.display();
//
//          }
//}














