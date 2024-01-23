package abstraction;

public class FinalEx2 extends FinalEx4{
	final int a=90;
/*public final void display()
{
	cannot override final methods,but can be inherited.
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalEx2 obj=new FinalEx2();
		obj.display();
		System.out.println(obj.a);
		
	}

}
