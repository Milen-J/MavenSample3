package Aggregation;

public class Aggregation13 {
	String house;
	int pin;
	Aggregation2 ad;
	Name n;
	public Aggregation13(String house,int pin,Aggregation2 ad,Name n)
	{
		this.house=house;
		this.pin=pin;
		this.ad=ad;
		this.n=n;
	}
	public void sum()
	{
		System.out.println(ad.rollno+"  " +ad.name);
		System.out.println("Full Name: " +n.FirstName+" "+n.MiddleName+" "+n.LastName);
		System.out.println("Address -"+house+" "+pin);
	}
	public static void main(String[]args)
	{
		Aggregation2 obj =new Aggregation2("Tom",001);
		Name obj1=new Name("Tom","Harry","Keith");
		Aggregation13 a =new Aggregation13("ABC",686,obj,obj1);
		a.sum();
	}

}
