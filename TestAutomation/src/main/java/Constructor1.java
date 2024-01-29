
public class Constructor1 {
	int x;
	String s;
	Constructor1(int x1,String s1)
	{
		 x =x1;
		s =s1;
	}
	public static void main(String[]args)
	{
		Constructor1 o=new Constructor1(10,"Abc");
		
		System.out.println(o.x +" " +o.s);
	}

}
