package multilevelInheritance;

public class Hra extends BasicPay {
	Double hra,gross,deductions;
	Double pf,net,salary;
	
	
	public void calculate()
	{ 
		hra=basicPay*0.05;
		System.out.println("**********PAY SLIP********");
		System.out.println("HRA : "+hra);
		pf=0.2*basicPay;
		System.out.println("PF :"+pf);
		gross=(basicPay+hra);
		System.out.println("GROSS AMOUNT : "+gross);
		net=deduction+pf;
		System.out.println("DEDUCTIONS  : "+net);
		salary=gross-net;
		System.out.println("TOTAL SALARY : "+salary);
		
		
	}

}
