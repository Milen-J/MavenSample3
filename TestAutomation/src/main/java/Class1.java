
public class Class1 {
	public void palindrome()
	{
		int r,sum=0,temp;
		int n =2332;
		temp = n;
		while (n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum)
			System.out.println("It is a palindrome number.");
		else
			System.out.println("It is not a palindrome number.");
		}

	public static void main(String[] args) {
		Class1 obj1=new Class1();
		obj1.palindrome();

	}

}
