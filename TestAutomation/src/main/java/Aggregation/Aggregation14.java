package Aggregation;

public class Aggregation14 {
	String name;
	int id;
	Aggregation3 a;
	public  Aggregation14(String name,int id,Aggregation3 a)
	{
		this.name=name;
		this.id=id;
		this.a=a;
			
	}
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("Id"+id);
		System.out.println("City"+a.city);
		
	}
	public static void main(String []args)
	{
		Aggregation3 ag= new Aggregation3();
	ag.Aggregation(1, 063, "asdl");
		Aggregation14 obj=new Aggregation14(name, id, ag);
		obj.display("Abc", 1, ag);
		
	}

}
