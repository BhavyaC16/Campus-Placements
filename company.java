import java.io.*; 
import java.util.*;

public class company{
    final private String name;
    final private int no_eligible_courses;
    final private int students_required;
    final private String[] eligible_courses; 
    private boolean application_status;
    private static ArrayList<marksCompany> Marks;

    public company(String name, int no_eligible_courses, int students_required, String[] eligible_courses)
    {
        this.name = name; 
        this.students_required = students_required;
        this.no_eligible_courses = no_eligible_courses;
        this.eligible_courses = new String[no_eligible_courses];
        this.Marks = new ArrayList<marksCompany>(100);
        for(int i = 0;i<no_eligible_courses;i++)
        {
            this.eligible_courses[i] = eligible_courses[i]; 
        }
        this.application_status = true;
    }

    public void display_company()
    {
        System.out.println("Company Name: "+this.name);
        System.out.println("Course Criteria: ");
        for(int i = 0; i<this.no_eligible_courses;i++)
        {
            System.out.println(eligible_courses[i]);
        }
        System.out.print("Number of required students: ");
        System.out.println(this.students_required);
        System.out.print("Application Status: ");
        if(this.application_status==true)
        {
            System.out.println("OPEN");
        }
        else{
            System.out.println("CLOSED");
        }
    }
    public boolean status()
    {
        return(this.application_status);
    }
    public String getName()
    {
        return(this.name);
    }
    public int getReq()
    {
        return(this.students_required);
    }
    public void add_marks(int roll_no, int marks, float cgpa)
    {
        marksCompany m = new marksCompany(roll_no, marks, cgpa);
        Marks.add(m);
    }
    public ArrayList getMarks()
    {
        return(this.Marks);
    }
    public void setStatus()
    {
        this.application_status = false;
    }
}
/*
for(int i = 0;i<this.Marks.size();i++)
        {
            System.out.print(Marks.get(i).getRollNo()+" : ");
            System.out.println(Marks.get(i).get_marks());
            System.out.println(Marks.get(i).get_cgpa())
        }
*/