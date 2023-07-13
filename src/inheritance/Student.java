package inheritance;

public class Student extends Person {
	
	protected int rollNo;
	protected char grade;
	protected double marks;
	protected String stream;
	
	public Student(String name, int age, char gender, int rollNo, char grade, double marks, String stream) {
		super(name, age, gender);
		this.rollNo = rollNo;
		this.grade = grade;
		this.marks = marks;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name="
				+ name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	public void display() {
		System.out.println("Display of Student");
		super.display();
	}
	
}
