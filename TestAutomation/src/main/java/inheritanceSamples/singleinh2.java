package inheritanceSamples;

public class singleinh2 extends singleinh{
public void display()
{
	System.out.println("Hello");
}
public static void main(String[] args)
{
	singleinh2 obj= new singleinh2();
	obj.display();
	obj.add();
	
}
}
