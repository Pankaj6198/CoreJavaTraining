package exceptions;
//Unchecked exception
public class demo {
	
	public static int divide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			int a1=100,b1=0,result;
			result = divide(a1,b1);
			System.out.println(result);
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally block");
		}

	}

}
