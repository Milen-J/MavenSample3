
public class MethodOverride {
public void sum(int a,int b)
{
System.out.println(a+b);
}
public void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public void sum(double g,double h)
{
System.out.println(g+h);
}
public static void main(String[] args)
{
	MethodOverride s = new MethodOverride();
	s.sum(20, 300);
	s.sum(20, 40, 100);
	s.sum(10.5, 200.25);
}
}