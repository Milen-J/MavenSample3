package abstraction;

public class Animal2 extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 q = new Animal2();
		q.Pig();
		q.Lion();
		q.snake();
	}

	@Override
	public void Pig() {
		System.out.println("Bre Bre");
		// TODO Auto-generated method stub
		
	}
	
	public void snake()
	{
		System.out.println("ZZ");
	}

}
