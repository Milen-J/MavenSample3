package exception;

import java.util.ArrayList;
import java.util.List;

public class CollEx1 {
	public static void main(String[] args)
	{
		List<Integer> obj=new ArrayList<Integer>();
		obj.add(20);
		obj.add(30);
		obj.add(50);
		for(int a:obj)
		{
			System.out.println(a);
		}
		
	}

}
