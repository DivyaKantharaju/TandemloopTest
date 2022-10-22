package first_screening;

import java.util.ArrayList;

public class Problem_4 {

	public static void main(String[] args) {
		int a[]= {1,2,8,9,12,46,76,82,50,20,30};
		int b[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		ArrayList al=new ArrayList();
		for(int i=0; i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%b[i]==0)
				{
					count++;
				}
				al.add(a[i]+":"+count);
				count=0;
			}
			/*for(int k=0; k<b.length;k++)
			{
				System.out.println(al.get(k)+",");
			}*/
		}

	}

}
