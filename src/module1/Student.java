package module1;

public class Student {
	int rollNo;
	String firstName;
	String lastName;
	String address;
	double score;
	
	
	void appearExam() 
	{
		System.out.println("appearing for the exams.. ");
	}
	void solveAssignment() 
	{
		System.out.println("solving the assignment");
	}
		void markAttendance() 
	{
		System.out.println("marking the attendance " ) ;
	}
		
		void display()
		{
			System.out.println("Rollno:"+rollNo);
			System.out.println("firstname:"+firstName);
			System.out.println("lastname:"+lastName);
			System.out.println("address:"+address);
			System.out.println("============");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		
		student.firstName="Pankaj";
		student.rollNo=10;
		student.address="Pune";
		student.score=100;
		student.lastName="Chaudhari";
		
		student.appearExam() ;
		student.solveAssignment() ;
		student.markAttendance(); 
		student.display();
	}
}

