package exceptions;

import java.util.Scanner;

class PasswordException extends Exception
{
	public PasswordException(String s)
	{
		super(s);
	}
}

public class UserDefinedExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter psw");
		String pwd= sc.next();
		
		try {
			if (pwd.length() <5)
				throw new PasswordException("PWD should be greater than 5"); 
			else if(pwd.matches("[A-Za-z0-9]*"))
				throw new PasswordException("Should contain special char");
			else
				System.out.println("Valid password");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
