public class student{
	final private int roll_no;
	final private float cgpa;
	//enum branch{CSE, ECE, CSD, CSAM, CSSS, CSB;};
	final private String branch;
	private static int count=1;
	private boolean placed;
	private String company_name;

	public student(float cgpa, String branch)
	{
		this.roll_no = this.count;
		count++;
		this.placed = false;
		this.cgpa = cgpa;
		this.branch = branch;
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
}