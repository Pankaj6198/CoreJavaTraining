package abstractpack;

public class Rect implements Graphic{
	private double l;
	private double b;

	
	public Rect(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	public double calArea()
	{
		return (l*b);
	}
	public double calPeri()
	{
		return (2 * (l+b) );
	}
}
