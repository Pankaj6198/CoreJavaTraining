package module2;
import java.util.Scanner;

public class Student {

	private int rollNo;
	private String name;
	private double score;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter RollNo: ");
		rollNo = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter score: ");
		score=sc.nextDouble();
		
	}
	
	
	
	void markAttendace()
	{
		System.out.println("Mark attandace");
	}
	
	void solveAssignment()
	{
		System.out.println("Solve Assignment");
	}

	void display()
	{
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("score : "+score);
		System.out.println("======================");
		
		
	}
}
