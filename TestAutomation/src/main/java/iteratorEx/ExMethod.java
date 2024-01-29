package iteratorEx;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

public class ExMethod {
	static int i=1;
	public static void main(String[]args)
	{
		Collection<String> collection =new ConcurrentLinkedQueue<String>(); 
	collection.add("RAm");
	collection.add("zx");
	collection.add("ccm");
	collection.add("vv");
	collection.add("vv");
	Iterator<String> iterator=collection.iterator();
	while(iterator.hasNext())
	{
		System.out.println(i+++","+iterator.next());
	}
	}

}
