package exception;

import java.io.IOException;

public class EligibilityCheck {
	public void check() throws IOException
	{
		int a=13;
		if(a>=18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			//System.out.println("Not eligible");
		throw new ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EligibilityCheck obj=new EligibilityCheck();
		obj.check();
	}

}
