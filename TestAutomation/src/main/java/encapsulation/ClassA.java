package encapsulation;

public class ClassA {
	private int a;
	private String s;
	public void getter()
	{
		System.out.println(a);
		System.out.println(s);
	}
	public void setter(int a,String s)
	{
		this.a=a;
		this.s=s;
		
	}
}
