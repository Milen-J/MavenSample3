package abstraction;

public class MultInt2 implements Example3{
	public static void main(String[] args)
	{
		 MultInt2 obj=new  MultInt2();
		 obj.add();
		 obj.display();
		 obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("HELLOOO");
	}
	}


