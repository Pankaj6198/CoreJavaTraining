package abstractpack;

public class Circle implements Graphic {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double calArea()
	{
		return (PI * radius * radius);
	}
	public double calPeri()
	{
		return (2 * PI * radius );
	}
	
}
