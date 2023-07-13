package abstractpack;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(10);
		
		System.out.println(c.calArea());
		System.out.println(c.calPeri());
		
		Rect r=new Rect(10,20);
		r.calArea();
		r.calPeri();
		
	}

}
