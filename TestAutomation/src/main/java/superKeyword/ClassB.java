package superKeyword;

public class ClassB extends ClassA {
	public void divide() {
		super.add();
		if (super.sum %10==0)
		{
			System.out.println("Result is divisible by 10.");
		}
		else
		{
			System.out.println("Result is not divisble by 10.");
		}
	}
	public static void main(String[] args)
	{
		ClassB obj=new ClassB();
		obj.divide();
		 
	}

}
