package abstractpack;

abstract class Animal{
	int legs=4;
	
	abstract void sound();
	public void classinfo(String type)
	{
		System.out.println("I am from "+type);
	}
}

class Dog extends Animal{
	
	
	void sound() {
		System.out.println("Barking.....");
		
	}
}

class Lion extends Animal{
	
	
	void sound() {
		System.out.println("Roaring.....");
		
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tommy = new Dog();
		tommy.sound();
		tommy.classinfo("Dog");
		
		Lion tom = new Lion();
		tom.sound();
		tom.classinfo("Lion");
		
	}

}
