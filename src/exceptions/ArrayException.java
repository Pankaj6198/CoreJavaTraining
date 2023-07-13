package exceptions;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,30};
		System.out.println(a[10]);
		try {
			System.out.println(a[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Wrong index");
		}
		
	}

}
