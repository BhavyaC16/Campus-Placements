import java.util.Scanner;
import java.io.*; 
import java.util.*;

public class placementOffice{
	final private int students;
	private int students_placed;
	private static ArrayList<student> Students;
	private static ArrayList<company> Companies;
	private static ArrayList<student> removedStudents;
	private static ArrayList<company> removedCompanies;

	public placementOffice(int N)
	{
		this.students = N;
		this.students_placed = 0;
		this.Students = new ArrayList<student>(N);
		this.Companies = new ArrayList<company>(N);
		this.removedStudents = new ArrayList<student>(N);
		this.removedCompanies = new ArrayList<company>(N);
	}

	public int get_no_placed_students()
	{
		return(this.students_placed);
	}
	public int get_no_unplaced_students()
	{
		return(this.students - this.students_placed);
	}
	public void add_company()
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("Number of Eligible Courses = ");
		int no_eligible_courses = sc.nextInt();
		String[] courses = new String[no_eligible_courses];
		for(int k = 0;k<no_eligible_courses;k++)
		{
			System.out.println(k);
			String s = sc.next();
			courses[k] = s;
		}
		System.out.print("Number of Required Students = ");
		int required_students = sc.nextInt();

		company c = new company(name, no_eligible_courses, required_students, courses);
		c.display_company();
	}
	public void removeStudents()
	{
		for(int i = 0;i<this.Students.size();i++)
		{
			if(this.Students.get(i).placed()==true)
			{
				this.removedStudents.add(Students.get(i));
				System.out.println(Students.get(i).rollNumber());
			}
		}
	}
	public void removeCompanies()
	{
		for(int i = 0;i<this.Companies.size();i++)
		{
			if(this.Companies.get(i).status()==false)
			{
				this.removedCompanies.add(Companies.get(i));
				System.out.println(Companies.get(i).getName());
			}
		}
	}
	public void openCompanies()
	{
		for(int i = 0;i<this.Companies.size();i++)
		{
			if(this.Companies.get(i).status()==true)
			{
				System.out.println(Companies.get(i).getName());
			}
		}
	}

	public void displayCompany()
	{
		Scanner sc = new Scanner(System.in);
		String company_name = sc.nextLine();
		for(int i = 0;i<this.Companies.size();i++)
		{
			if((this.Companies.get(i).getName()==company_name)) //problem in string comparison
			{
				System.out.print("== works");
				Companies.get(i).display_company();
			}
		}
	}
	public void displayStudent()
	{
		Scanner sc = new Scanner(System.in);
		int roll_number = sc.nextInt();
		for(int i = 0;i<this.Students.size();i++)
		{
			if(this.Students.get(i).rollNumber()==roll_number)
			{
				Students.get(i).display_student();
			}
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		placementOffice pmo = new placementOffice(N);
		for(int i=0;i<N;i++)
		{
			float cgpa = sc.nextFloat();
			String branch = sc.nextLine();
			student s = new student(cgpa, branch);
			Students.add(s);
		}
		while(pmo.get_no_placed_students()!=N)
		{
			int ch = sc.nextInt();
			switch(ch){
				case 1:	pmo.add_company();
						break;
				case 2:	pmo.removeStudents();
						break;
				case 3:	pmo.removeCompanies();
						break;
				case 4:	System.out.println(pmo.get_no_unplaced_students());
						break;
				case 5:	pmo.openCompanies();
						break;
				case 6:
						break;
				case 7:	pmo.displayCompany();
						break;
				case 8:	pmo.displayStudent();
						break;
				case 9:
						break;
				default:System.out.println("Enter valid instruction");
						break;
			}
		}	
	}
}