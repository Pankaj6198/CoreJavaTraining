package module2;

import java.util.Scanner;

public class UserChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch=0;
		System.out.println("**************************");
		System.out.println("YES Bank");
		System.out.println("1. Accept the Details");
		System.out.println("2. Display the Details");
		System.out.println("3. Transfer amount");
		System.out.println("4. Withdraw");
		System.out.println("5. Deposit");
		System.out.println("6. Exit");
		System.out.println("Enter your choice ");
		
		Scanner sc = new Scanner(System.in);
		ch= sc.nextInt();
		String choice;
		
		do
		{
			switch(ch)
			{
			case 1: System.out.println("Accepting the Details");
					break;
			case 2: System.out.println("Display the Details");
					break;	
			case 3: System.out.println("Transfering amount");
					break;
			case 4: System.out.println("Withdrawing");
					break;
			case 5: System.out.println("Depositing");
					break;
			case 6: System.out.println("Exited");
					return;
		
			default: System.out.println("Wrong option");
		
			}
			
			System.out.println("Do you want to try again (y|n)");
			choice = sc.next();
			
		} while(choice.equals("y")||choice.equals("Y"));
		
				
		}
	}

