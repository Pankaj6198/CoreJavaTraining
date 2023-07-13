package test;

public class AccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1= new Account();
		ac1.display();
		
		Account ac2= new Account(10,"Pankaj",1000);
		ac2.display();
		
		System.out.println(ac1);
	}

}
