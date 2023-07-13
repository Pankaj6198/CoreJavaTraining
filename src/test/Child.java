package test;

public class Child extends Parent {
	
	protected String name;

	public Child(String fname, String lname, String name) {
		super(fname, lname);
		this.name = name;
	}
	
	public void property() {
		
		System.out.println(" Land+Power+CAR+Gold");
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", fname=" + fname + ", lname=" + lname + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
