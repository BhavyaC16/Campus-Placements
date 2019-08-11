public class marksCompany
{
	private int roll_no;
	private int marks;
	private float cgpa;

	public marksCompany(int roll_no, int marks, float cgpa)
	{
		this.roll_no = roll_no;
		this.marks = marks;
		this.cgpa = cgpa;
	}
	public int getRollNo()
	{
		return(this.roll_no);
	}
	public int get_marks()
	{
		return(this.marks);
	}
	public float get_cgpa()
	{
		return(this.cgpa);
	}
}