import java.util.ArrayList;

public class Student {

	
	private static final int Integer_MIN_Value = 0;

	private static final int Interger_Max_value = 0;

	public String name;
	
	private ArrayList<Integer> grades;
	
	public Student(String name) {
		this.name=name;
		this.grades= new ArrayList<Integer>();
	}

	public String getName() {
		return name;
	}


	public ArrayList<Integer> getGrades() {
		return grades;
	}

	
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	public  double averageGrade() {
		
		int sum=0;
		for( int grade:grades) {
			sum=sum+grade;
		}
		return grades.size() == 0 ? 0 : (double) sum / grades.size();
		
	}

	public int highestGrade() {
		int highest=Integer.MIN_VALUE;
		for(int grade:grades) {
		if(grade>highest) {
		  highest=grade;	
		}	
		}
		return highest;
		
	}
	
	public int lowestGrade() {
		int lowest=Integer.MAX_VALUE;
		for(int grade:grades) {
			if(lowest>grade) {
				lowest=grade;
			}
		}
		return lowest;
	}
		
}
