package multilevelInheritance;

public class Salary extends Hra{
	double salary;
	public void print()
	{
		
		super.display();
		super.calculate();
		
	}
	public static void main(String[] args)
	{
		Salary obj=new Salary();	
		obj.print();
		
	}
}
