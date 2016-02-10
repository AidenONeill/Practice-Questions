package HackerRank;

public class Solution6{

	public static int mode(int[] input) {
		int returnVal = input[0]; // stores element to be returned
		int repeatCount = 0; // counts the record number of repeats
		int prevRepCnt = 0; // temporary count for repeats

		for (int i=0; i<input.length; i++) { // goes through each elem

			for (int j=i; j<input.length; j++) { // compares to each elem after the first elem

				if (i != j && input[i] == input[j]) { // if matching values
					repeatCount++; // gets the repeat count

					if (repeatCount>=prevRepCnt) { // a higher count of repeats than before
						returnVal=input[i]; // return that element
					}
					prevRepCnt = repeatCount; // Keeps the highest repeat record
				}
				repeatCount=0; // resets repeat Count for next comparison
			}
		}
		return returnVal;
	}
}
