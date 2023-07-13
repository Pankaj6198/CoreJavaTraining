package inheritance;

public class Emp extends Student{
	
	private int empNo;
	private String company;
	private String desg;
	private double sal;
	
	public Emp(String name, int age, char gender, int rollNo, char grade, double marks, String stream, int empNo,
			String company, String desg, double sal) {
		super(name, age, gender, rollNo, grade, marks, stream);
		this.empNo = empNo;
		this.company = company;
		this.desg = desg;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", company=" + company + ", desg=" + desg + ", sal=" + sal + ", rollNo=" + rollNo
				+ ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	
}
