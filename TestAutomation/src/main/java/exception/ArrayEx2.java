package exception;

import java.util.ArrayList;

public class ArrayEx2 {
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(30);
		l.add(50);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(25);
		System.out.println(l);
		boolean m=l.contains(30);
		System.out.println(l);
		int b=l.size();
		System.out.println(b);
		
	}

}
