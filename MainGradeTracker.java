import java.util.Scanner;

public class MainGradeTracker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grade_Tracker g=new Grade_Tracker();
		
		while(true) {
			System.out.println("1.Add student");
			 System.out.println("2. Add Grade");
	            System.out.println("3. Display Student Average");
	            System.out.println("4. Display Class Average");
	            System.out.println("5. Display Class Highest Grade");
	            System.out.println("6. Display Class Lowest Grade");
			System.out.println("7. exit");
			System.out.println("choice option :");
			int option=sc.nextInt();
			
			switch(option) {
			
			case 1:
				System.out.println("enter student name:");
				String name=sc.next();
				g.addStudent(name);
				break;
				
			case 2:
				
				System.out.println("enter name");
				name=sc.next();
				Student student=g.getStudent(name);
				
				if(student != null) {
					System.out.println("enter grade");
					int grade=sc.nextInt();
					student.addGrade(grade);
			      	}
				else {
					System.out.println("student is not found");
				}
				break;
				
			case 3:
				System.out.println("enter name");
				name=sc.next();
				student=g.getStudent(name);
				if(student!=null) {
					System.out.println("Average grade for"+name+":"+student.averageGrade());
					
				}
				else {
					System.out.println("student is not found");
				}
				break;
			case 4:
				System.out.println("Average:"+g.averageClassGrade());
			
				break;
			case 5:
				System.out.println("highest:"+g.highestClassGrade());
				
				break;
			case 6:
				System.out.println("lowest:"+g.lowestClassGrade());
				
				break;
			case 7:
              System.out.println("thank you");	
              break;
				default:
					
					System.out.println("***Invalid choice***");
					
			}
		}
	}
}
