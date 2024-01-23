package exception;

public class Example1 {
	public void add() {
		try
		{
			int a=10/0;
			System.out.println(a);	
		}
		catch(Exception c)
		{
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
		obj.add();
	}

}
