
public class Class1 {
	public void palindrome()
	{
		int r,sum=0,temp;
		int n =456;
		temp = n;
		while (n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");
		}

	public static void main(String[] args) {
		Class1 obj1=new Class1();
		obj1.palindrome();

	}

}
