package polymorphism;
import java.util.Scanner;
public class Onseason extends Offseason{
	

	public void discount(double cost)
    {
    	System.out.printf("Discout on Onseason  : %.2f", cost*0.4);
        System.out.println("");
        super.discount(cost);
    }
    
    public static void main(String[] args)
    {   
    	
       Scanner reader = new Scanner(System.in);
       System.out.print("Enter the cost: ");
       double cost = reader.nextDouble();
       Onseason obj =new Onseason();
       obj.discount(cost);
        
    }
}