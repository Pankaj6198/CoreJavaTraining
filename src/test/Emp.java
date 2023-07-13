package test;

public class Emp {
	private int empId;
	private String eName;
	private double esal;

	public Emp() {
		System.out.println("Default constructor");
		empId = 0;
		eName = "";
		esal = 0.0;
	}

	public Emp(int empId, String eName, double esal) {
		System.out.println("Para constructor");
		this.empId = empId;
		this.eName = eName;
		this.esal = esal;
	}

	public void accept() {
	 
	}

	public void display()
	{
		System.out.println(empId);
		System.out.println(eName);
		System.out.println(esal);
	}

}
