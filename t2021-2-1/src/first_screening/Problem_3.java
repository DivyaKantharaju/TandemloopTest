package first_screening;

import java.util.Scanner;

public class Problem_3 
{

	public static void main(String[] args) {
	
	 int b=1;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter the no");
	 int a=scan.nextInt();
	 for(int i=1; i<=a;i++)
	 {
		 System.out.println(b+",");
		 b=b+2;
	 }
	
	if(a%2!=0)
	{
		for(int i=1;i<=a;i++)
		{
			System.out.println(b);
			b=b+2;
		}
	}
		else if(a%2==0)
		{
			for(int i=1;i<=a-1;i++)
			{
				System.out.println(b);
			b=b+2;
			}
		}
	}
}
	 
	 
		


