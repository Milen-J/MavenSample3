
public class ClassB extends ClassA {
	public void print()
	{
		super.print();
	System.out.println("Child Class");
	}
	public static void main(String[] args) {
		ClassB obj=new ClassB ();
		obj.print();// TODO Auto-generated method stub
		//obj.print();
		
	}
}
