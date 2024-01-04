import java.util.Scanner;
public class CountEvenOdd {
	public static void main(String[]args)
	{
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int num=reader.nextInt();
		int[]size=new int[num];
		System.out.println("Enter the number for "+num+" elements:");
		int e=0;
		int o=0;
		for(int i=0;i<num;i++)
		{
			size[i]=reader.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(size[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		System.out.println("Number of even numbers is  :"+e);
		System.out.println("Number of odd numbers is  :"+o);
	}
	
}
