package HackerRank;

public class merge1 {
	
	   public static void mergeSort(int left, int right){
	        int mid = (left + right) /2;  // computes midpoint
	        if(left==right)		//base case
		   	   return;
	        mergeSort(left, mid);
	        mergeSort(mid+1, right);
	        for(int i=left; i<=right; i++){
	            workSpace[i]=myarray[i]; //copies entire array into workspace
	        }
	        int i1=left;
	        int i2=mid+1;
	        for(int curr=left; curr<=right; curr++){ //merge workspace
	            if(i1>mid){			      //copies all remnants in
				     myarray[curr]=workSpace[i2++]; 
	            }else if(i2>right){		      //copies all remnants in
	                myarray[curr] = workSpace[i1++]; 
	            }else if(workSpace[i2].compareTo(workSpace[i1])>0){	   
	                myarray[curr]=workSpace[i1++];	//merge
	            }else{
	                myarray[curr]=workSpace[i2++];	//merge
	            }
	        }
	    }

}

import java.util.*;

public class Solution{
    
    public static String[] myarray;
    public static String[] workSpace;

    public static void main(String[] args){
        
        Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        String[] array = new String[num];
        myarray = new String[num];
        workSpace = new String[num];
        for(int i=0;i<num;i++){
            myarray[i]=myscanner.nextLine();
        }
        mergeSort(0,myarray.length-1);
        bubblesort();
        
        for(int i=0;i<num;i++){
            System.out.println(myarray[i]);
        }
    }
    
    public static void mergeSort(int left, int right){
        int mid = (left + right) /2;  // computes midpoint
        if(left==right)		//base case
	   	   return;
        mergeSort(left, mid);
        mergeSort(mid+1, right);
        for(int i=left; i<=right; i++){
            workSpace[i]=myarray[i]; //copies entire array into workspace
        }
        int i1=left;
        int i2=mid+1;
        for(int curr=left; curr<=right; curr++){ //merge workspace
            if(i1>mid){			      //copies all remnants in
			     myarray[curr]=workSpace[i2++]; 
            }else if(i2>right){		      //copies all remnants in
                myarray[curr] = workSpace[i1++]; 
            }else if(workSpace[i2].compareTo(workSpace[i1])>0){	   
                myarray[curr]=workSpace[i1++];	//merge
            }else{
                myarray[curr]=workSpace[i2++];	//merge
            }
        }
    }
    
    public static void bubblesort(){ 
        for (int c = 0; c < myarray.length-1; c++) {
            for (int d = 0; d < myarray.length-c-1; d++) {
                if (myarray[d].length() > myarray[d+1].length()){
                    String swap = myarray[d];
                    myarray[d]   = myarray[d+1];
                    myarray[d+1] = swap;
                }
            }
        }
    }
}