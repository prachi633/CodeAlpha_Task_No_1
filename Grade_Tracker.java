import java.util.ArrayList;

public class Grade_Tracker {

	private static final int Integer_MIN_Value = 0;
	private static final int Integer_MAX_VALUE = 0;
	private ArrayList<Student> students;
	
	public Grade_Tracker() {
	  this.students=new ArrayList<Student>();	
	}
	 
	public void addStudent(String name) {
		students.add(new Student(name));
		
	}
	public Student getStudent(String name) {
		for(Student student:students) {
			if(student.getName().equalsIgnoreCase(name)) {
				
			
			return student;
			}
		}
		return null;
	
	}
	
	public int highestClassGrade() {
		int highest=Integer.MIN_VALUE;
		for(Student student:students) {
			int highestStudent=student.highestGrade();
		
		if(highestStudent>highest) {
			highest=highestStudent;
	    }
		}
		return highest;
	}
	
	public int lowestClassGrade() {
		 int lowest = Integer.MAX_VALUE;
	        for (Student student : students) {
	            int lowestStudent = student.lowestGrade();

	            if (lowestStudent < lowest) {
	                lowest = lowestStudent;
	            }
	        }
		
		return lowest;
	}
	
	public double averageClassGrade() {
		int sum=0;
		int totalgrade=0;
		
		for(Student student:students) {
			for(int grade:student.getGrades()) {
				sum += grade;
                totalgrade++;
			}
		}
		
		return  totalgrade == 0 ? 0 : sum / totalgrade;
		
	}

}
