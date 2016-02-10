package HackerRank;
import java.util.*;


public class Solution4 
{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter");
		String s = new String(scan.nextLine());
		String s2 = "";
		String s3 = "";

		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				s2 = s.substring(0, i);
				s3 = s.substring(i+1,s.length());
			}

		}
		Stack mystack = new Stack();

		if(s2.equalsIgnoreCase("push"))
		{
			mystack.push(Integer.parseInt(s3));
		}
		else if (s.equalsIgnoreCase("pop"))
		{
			mystack.pop();
		}
		//System.out.println(mystack.peek());



		System.out.println(s2);
		System.out.println(s3); 






	}
	
	
	
	

}

	




