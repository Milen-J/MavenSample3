
package multilevelInheritance;
import java.io.InputStream;
import java.util.Scanner;
public class Employee {
	int empid;
	String name,address,email;
	
	void getdata()
	{
		Scanner get=Scanner(System.in);
		System.out.println("Enter the name:");
		name=get.nextLine();
		System.out.print("Enter Employee E-mail id: ");
		email = get.nextLine();
		System.out.print("Enter Address of the Employee: ");
		address = get.nextLine(); 
		System.out.print("Enter Employee id: "); 
		empid =get.nextInt();
		
		
	}

	private Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
