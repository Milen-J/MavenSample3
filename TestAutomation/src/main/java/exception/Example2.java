package exception;

public class Example2 {
	public void add() {
		try {
		int a=20*2;
		int b[]=new int [5];
		b[5]=30/0;
		System.out.println(a);
		System.out.println(b[7]);
		}
		/*catch(ArithmeticException c)
		{
			System.out.println("Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("Array out of bound");
			
		}*/
		finally
		{
			System.out.println("Important messages");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj = new Example2() ;
		obj.add();
		
	}

}
