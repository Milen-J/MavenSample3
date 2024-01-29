package Aggregation;

public class Aggregation2a {

	int ph;
	String city;
	Aggregation1a s;
	Aggregation2a(int ph,String city,Aggregation1a s)
	{
		this.ph=ph;
		this.city=city;
		this.s=s;
		
	}
	public void display()
	{
		System.out.println("Phone"+ph);
		System.out.println("City"+city);
		System.out.println("Id"+s.id);
		System.out.println("name"+s.sname);
	}
	public static void main(String[] args)
	{
		Aggregation1a ag=new Aggregation1a(1,"ABC");
		Aggregation2a ag2=new Aggregation2a(1212,"Bombay",ag);
		ag2.display();
	}
}
