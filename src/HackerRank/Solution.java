package HackerRank;
import java.util.*;
public class Solution 
{
	public static void main(String args[] )
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int total = 0, average =0;     
		int array[] = new int [scan.nextInt()];

		for(int i =0;i<=array.length-1;i++)// fill array
		{ 
			array[i] = scan.nextInt();  

		}

		for(int j =0;j<=array.length-1;j++)// get average
		{ 
			total = total + array[j];          

		}

		average = total/array.length;


		int distance = Math.abs(array[0] - average); // check the absolute difference between the first positon in the array and average
		int found = 0;   

		for(int a =1;a<=array.length-1;a++)
		{
			int distance2 = Math.abs(array[a] - average);// runs through the rest of the array and checks the abs difference between array position a and average
			if(distance2<distance)                       //compare the differences
			{ 
				found = a;  
				distance = distance2;  //change the value of found and distance if found is smaller
			}

		}
		System.out.println(array[found]);




	}
}
