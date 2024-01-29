package inheritanceSamples;

public class Inherit2 extends inherit1 {
public void add()
{
	System.out.println("Hi");
	System.out.println(super.a);
}
public static void main(String [] args)
{
	//Inherit2 o=new Inherit2();
	new Inherit2().display();
	//o.display();
	new Inherit2().add();
	
}
}
