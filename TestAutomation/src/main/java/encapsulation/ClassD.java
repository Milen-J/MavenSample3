package encapsulation;

public class ClassD {
	public static void main(String[] args)
	{
		ClassC s = new ClassC();
		s.setName("Abc");
		System.out.println(s.getter());
	}

}
