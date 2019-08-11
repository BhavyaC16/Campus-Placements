import java.util.*;
class ObjectComparator implements Comparator<marksCompany>{
	public int compare(marksCompany m1, marksCompany m2){
		if(m1.get_marks()>m2.get_marks())
		{
			return(1);
		}
		else if(m1.get_marks()==m2.get_marks())
		{
			if(m1.get_cgpa()>m2.get_cgpa())
			{
				return(1);
			}
			else{
				return(-1);
			}
		}
		else{
			return(-1);
		}
	}
}