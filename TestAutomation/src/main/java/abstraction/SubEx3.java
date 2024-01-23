package abstraction;

public class SubEx3 implements Example3,MultInt {

	@Override
	public void add() {
		System.out.println("Sum "+a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sum "+b);
	}
	public static void main(String[] args)
	{
		SubEx3 obj=new SubEx3();
		obj.add();
		obj.display();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generaed method stub
		
		System.out.println("Hello");
	}

}
