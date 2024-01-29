package abstraction;

public class Human2 extends Human{
	public void Hand()
	{
		System.out.println("Two hands");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 a=new Human2();
		a.Face();
		a.Leg();
		a.Hand();
	}

	@Override
	public void Face() {
		// TODO Auto-generated method stub
		System.out.println("One face");
	}

}
