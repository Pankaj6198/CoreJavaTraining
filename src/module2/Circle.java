package module2;
import java.util.Scanner;

public class Circle {
	final double PI =3.14;
	
	private double radius;
	private double area;
	private double peri;
	
	public void accept()
	{   System.out.println("Enter radius");
		Scanner sc= new Scanner(System.in);
		radius = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("radius: "+radius);
		System.out.println("area: "+area);
		System.out.println("peri: "+peri);
	}
	public void calArea()
	{
		area = PI*radius*radius;
	}
	public void calPeri()	
	{
		peri = 2*PI*radius;
	}
}
