import java.io.*; 
import java.util.*;

public class student{
	final private int roll_no;
	final private float cgpa;
	//enum branch{CSE, ECE, CSD, CSAM, CSSS, CSB;};
	final private String branch;
	private static int count=1;
	private boolean placed;
	private String company_name;
	private ArrayList<marksStudent> Marks;

	public student(float cgpa, String branch)
	{
		this.roll_no = this.count;
		count++;
		this.placed = false;
		this.cgpa = cgpa;
		this.branch = branch;
		this.Marks = new ArrayList<marksStudent>(100);
	}
	public void display_student()
	{
		System.out.print("Roll number: ");
		System.out.println(this.roll_no);
		System.out.print("CGPA: ");
		System.out.println(this.cgpa);
		System.out.print("Course: ");
		System.out.println(this.branch);
		System.out.print("Placement Status: ");
		if(this.placed==false){
			System.out.println("Not Placed");
		}
		else{
			System.out.println("Placed");
			System.out.println("Company: "+this.company_name);
		}
	}
	public boolean placed()
	{
		return(this.placed);
	}
	public int rollNumber()
	{
		return(this.roll_no);
	}
	public String getBranch()
	{
		return(this.branch);
	}
	public float getcgpa()
	{
		return(this.cgpa);
	}
	public void setPlaced()
	{
		this.placed = true;
	}
	public void add_marks(String company, int marks)
	{
		marksStudent m = new marksStudent(company, marks);
		this.Marks.add(m);
	}
	public void getMarks()
	{
		for(int i = 0;i<this.Marks.size();i++)
		{
			System.out.print(this.Marks.get(i).getCompany()+" : ");
			System.out.println(this.Marks.get(i).get_marks());
		}
	}
}