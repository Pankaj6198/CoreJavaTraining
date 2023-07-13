package module2;

public class OverloadingDemo {

	public int add(int a,int b)
	{
		return (a+b) ;
	}
	
	public int add(int a,int b,int c)
	{
		return (a+b+c) ;
	}
	public double add(double a,int b,int c)
	{
		return (a+b+c) ;
	}
	public static void main(String[] args) {
		
		OverloadingDemo d= new OverloadingDemo();
		System.out.println(d.add(10, 20));
		
	}

}
