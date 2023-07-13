package module2;

import java.util.Scanner;

public class User {
	private int userAge;
	private String name;
	private double sal;
	
	public void accept()
	{ Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Age,Name,Sal");
	  userAge=sc.nextInt();
	  name= sc.next();
	  sal=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Age: "+userAge);
		System.out.println("Name: "+name);
		System.out.println("Sal: "+sal);
	}
	
	public boolean checkAge()
	{
		if (userAge<18)
		{
			//System.out.println("Underage");
			return false;
		}
		else
		{
			//System.out.println("Not Underage");
			return true;
		}
	}
	public boolean checkSal()
	{

		if (sal<30000)
		{
			//System.out.println("Sal less than national average");
			return true;
		}
		else
		{
			//System.out.println("Greater than average");
			return false;
		}
	}
}
