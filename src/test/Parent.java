package test;

public class Parent {
	
	protected String fname;
	protected String lname;
	
	public void property()
	{
		System.out.println(" Land+Power");
	}
	
	public Parent(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	
	}

	@Override
	public String toString() {
		return "Parent [fname=" + fname + ", lname=" + lname + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
