package HackerRank;

import java.util.*;
public class Prime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value for x");
		int x = scan.nextInt();	
		int found = 0, found2 = 0;
		boolean flag = false, flag2 = false;
		boolean[] prime= new boolean[1000];
		Arrays.fill(prime, true);

		for(int i = 2;i<prime.length;i++)
		{
			if(prime[i]==true)
			{
				for(int j = i*2;j<prime.length;j = j +i)
				{
					prime[j]=false;

				}
				//System.out.println(i);
			}
			
		}
		for(int k = 0;k<prime.length;k++)
		{
			if(prime[x]==true)
			{				
				System.out.println(x);
				break;
			}
			else if( prime[x-k]==true)
			{
				flag = true;
				found = x-k;
				break;
				
			}
			else if(prime[x+k]==true)
			{
				flag2= true;
				found2 = x+k;
				break;
			}
			
		}
		if(flag==true)
		{
		System.out.println(found);
		}
		if(flag2==true)
		{
			System.out.println(found2);
		}
	}
	
}


