package HackerRank;
import java.util.*;
public class Solution5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Queue PQ = new Queue();
		System.out.println("Please enter a queue size");
		int x = scan.nextInt();
		int i = 0;
		while( i<x)
		{
			System.out.println("please enter a num"+ (i+1));
			PQ.insert(scan.nextInt()); 
			i++;
		}



		while(!PQ.isEmpty())
		{
			System.out.println(PQ.remove());
		}
	}
}

class Queue{
	private int maxSize;
	private double[] queArray = new double[50];
	private int front;
	@SuppressWarnings("unused")
	private int rear;
	private int nItems;

	public void insert(double d) {    
		if(nItems==0)
		{                         
			queArray[0] = d;     
		}
		else
		{                                 
			int j = nItems;

			while(j > 0 && queArray[j-1] > d) //checks if the nitems >0 and element at end is >item j = 2, item = 3, qa[j-1] = 5
			{   

				queArray[j] = queArray[j-1];      
				j--;
			}
			queArray[j] = d;                
		}
		nItems++; 

	}
	public double remove()
	{
		if(isEmpty()) return 0;  
		double temp = queArray[front];// get value and incr front
		front++;
		if(front == maxSize)           // deal with wraparound
			front = 0;
		nItems--;                     // one less item
		return temp;
	}
	public boolean isEmpty()
	{
		return (nItems==0);
	}
	public int size()
	{
		return nItems;
	}








}


