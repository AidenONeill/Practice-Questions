package HackerRank;

import java.util.*;

public class MergeSortString {

	public static void main(String args[] ) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] list = new String[n];
		for(int i =0;i<n;i++)//takes in an array of string and calls the reverse method on it
		{
			list[i] = reverse(scan.nextLine());
		}

		mergeSort(list);//call the merge sort method
		for(int j =0;j<n;j++)// print the sorted elements after calling the reverse again
		{
			System.out.println(reverse(list[j]));
		}        

	}


	public static void mergeSort(String[] ar) {
		if (ar.length >= 2) {//only enters when the array is bigger than 1, a single element array is already sorted
			String[] left = new String[ar.length / 2];//declare a new array that is half the size of the input
			String[] right = new String[ar.length-ar.length / 2];//declare a second array that takes in the rest

			for (int i = 0; i < left.length; i++)
			{
				left[i] = ar[i]; //fills the new array with elements up to its length
			}
			for (int i = 0; i < right.length; i++)
			{
				right[i] = ar[i + ar.length / 2];//fills the second new array with the rest
			}

			mergeSort(left);//calls the method on left, recursive
			mergeSort(right);//calls the method on right, recursive

			merge(ar, left, right);//calls the merge method to merge the methods created recursively
		}
	}

	public static void merge(String[] workspace, String[] left, String[] right) {
		int x = 0;//use x to track elements in left
		int y = 0;//use y to track elements in right
		for (int i = 0; i < workspace.length; i++)//run through the array taken in as workspace
		{
			if (y >= right.length || (x < left.length && left[x].compareToIgnoreCase(right[y])<0))
				//if y> length then all elements in right have been used
				//if x<length and [x] is before [y] alphabetically 
			{
				workspace[i] = left[x];
				x++;//incr x if used
			} else {
				workspace[i] = right[y];
				y++;//incr y if used
			}
		}

	}
	public static String reverse(String s)
	{
		String reverse = new StringBuilder(s).reverse().toString();
		return reverse;
	}
}


