
package Aggregation;



public class Aggregation12 {
		String house;
		int pin;
		Aggregation1 sd;
		public Aggregation12(String house,int pin,Aggregation1 sd)
		{
			this.house=house;
			this.pin=pin;
			this.sd=sd;
		}
		public void sum()
		{
			System.out.println(sd.pin+" "+sd.house);
			System.out.println(house=" "+pin);
		}
		public static void main(String[]  args)
		{
			Aggregation1 obj =new Aggregation1("Sree",10);
			Aggregation12 a =new Aggregation12("Sree",12,obj);
			a.sum();
		}
		}


