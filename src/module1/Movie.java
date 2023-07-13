package module1;

public class Movie {
	String name;
	String genre;
	String language;
	int rating;
	String duration;
	String Year;
	String heroname;
	int NoofTheaters;
	
	void startMovie()
	{
		System.out.println("Starting...");
	}
	void showDubbed()
	{
		System.out.println("Showing Dubbing in hindi ...");
	}
	void showCertification()
	{
		System.out.println("showing certification...");
	}
	
	
	void showLicenses()
	{
		System.out.println("Showing Licenses...");
	}
	
	
	void showTheaterlist()
	{
		System.out.println("SHow theater list...");
	}
	
	void display()
	{
		System.out.println("Movie Name: "+name);
		System.out.println("Genre: "+genre);
		System.out.println("language "+language);
		System.out.println("rating: "+rating);
		System.out.println("duration: "+duration);
		System.out.println("Year: "+Year);
		System.out.println("Hero Name: "+heroname);
		System.out.println("No of theaters: "+NoofTheaters);
		System.out.println("============");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie1=new Movie();
		movie1.name="sivaji";
		movie1.genre="Action+Comedy+Romance";
		movie1.heroname="Rajnikant";
		movie1.language="Tamil";
		movie1.rating=8;
		movie1.duration="2 hrs";
		movie1.Year="2019";
		movie1.NoofTheaters=10;
		
		
		movie1.display();
		

	}

}
