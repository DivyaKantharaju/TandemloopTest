package first_screening;

import java.util.Scanner;

public class Problem_2 
{
			 private static Scanner sc;
			public static void main(String[] args) {
			 
			 int number , odd=1;
			 sc=new Scanner(System.in);
			 System.out.print("plz enter any nu : " );
			 number=sc.nextInt();
			 for(int i=1;i<=number;i++)
			 {   
			  System.out.print(odd+" ");
			  odd += 2;
			 }
			}
			}	