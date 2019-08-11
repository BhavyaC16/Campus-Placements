public class company{
    final private String name;
    final private int no_eligible_courses;
    final private int students_required;
    final private String[] eligible_courses; 
    private boolean application_status;

    public company(String name, int no_eligible_courses, int students_required, String[] eligible_courses)
    {
        this.name = name; 
        this.students_required = students_required;
        this.no_eligible_courses = no_eligible_courses;
        this.eligible_courses = new String[no_eligible_courses];
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
}
