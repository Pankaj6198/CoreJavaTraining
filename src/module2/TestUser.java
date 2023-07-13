package module2;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1= new User();
		u1.accept();
		u1.display();
		//u1.checkAge();
		//u1.checkSal();
		if (u1.checkAge()==true && u1.checkSal()==true)
		{
			System.out.println("Valid inputs");
		}
		else
			System.out.println("Invalid inputs");
	}

}
