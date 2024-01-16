package multilevelInheritance;
import java.util.Scanner;

public class BasicPay 
	{
	double basicPay,deduction,bonus,hra;
	
	
public void display()
{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the basicPay:");
	basicPay =reader.nextDouble();
	System.out.println("Enter the deductions:");
	deduction=reader.nextDouble();
	System.out.println("Enter the bonus:");
	bonus=reader.nextDouble();
	System.out.println("Enter the hra:");
	hra=reader.nextDouble() ;

	
}
}
