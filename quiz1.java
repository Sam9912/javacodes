package com.company;
class teacher
{
private String T_Designation;
private String uni;

    public teacher(String t_Designation, String uni) {
        T_Designation = t_Designation;
        this.uni = uni;
    }

    public void show_info()
    {
        System.out.println("Teacher designation is: "+ T_Designation);
        System.out.println("Teacher university is: "+uni);
    }


}
class subject_specialist extends teacher
{
    String subject;

    public subject_specialist(String t_Designation, String uni, String subject) {
        super(t_Designation, uni);
        this.subject = subject;
    }
    public void show_info()
    {
        super.show_info();
        System.out.println("subject of teacher is: " + subject );
    }

}


public class quiz1 {

    public static void main(String[] args) {
        subject_specialist s= new subject_specialist("Assistant Professsor","Arid","MPL");
        s.show_info();
    }
}
