package exception;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayEx1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("ABC");
a.add("CDS");
a.add("MNB");
System.out.println(a);
a.remove(1);
System.out.println(a);
a.addAll(a);
System.out.println(a);
int b=a.size();
System.out.println(b);
boolean m= a.contains("ABC");
System.out.println(m);
/*a.get(2);
System.out.println(a);
	}
	*/
Iterator it=a.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}
}
