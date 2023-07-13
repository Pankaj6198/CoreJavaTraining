package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Pankaj",22,'M');
		
		System.out.println(p);
		System.out.println("=============================");
		
		Student s1 = new Student("Pankaj",22,'M',12,'A',100,"ENTC");
		s1.display();
		
		System.out.println("=============================");
		
		Emp e = new Emp("Pankaj",22,'M',10,'A', 100, "ENTC", 11,
				"Oracle", "AC", 1000) ;
		System.out.println(e);
		System.out.println("=============================");
		
		
	}

}
