package inheritance;

public class Person {

	protected String name;
	protected int age;
	protected char gender;
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void fun()
	{
		System.out.println("Fun method in Person Class");
		
	}
	
	public void display()
	{   System.out.println("Person display method");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}