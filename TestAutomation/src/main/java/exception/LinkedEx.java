package exception;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedEx {
	public static void main(String[]args)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(23);
		l.add(56);
		l.add(45);
		System.out.println(l);
		Iterator itr=l.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());	
				}
				int c=l.size();
				System.out.println(c);
				boolean b=l.contains(56);
				System.out.println(b);
				l.clear();
				System.out.println(l);
	}

}
