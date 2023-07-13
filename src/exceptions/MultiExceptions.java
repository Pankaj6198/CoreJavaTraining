package exceptions;

import java.util.Scanner;

public class MultiExceptions {
	public static int divide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter val");
		s1= sc.next();
		s2= sc.next();
		
		int a1,b1,result;
		a1 = Integer.parseInt(s1);
		b1= Integer.parseInt(s2);
		
		try {
			result = divide(a1,b1);
			System.out.println(result);
		} 
		
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(NumberFormatException e2)
		{
			System.out.println(e2.getMessage());
		}
		
		catch(Exception e3)
		{
			System.out.println(e3.getMessage());
		}
	}

}
