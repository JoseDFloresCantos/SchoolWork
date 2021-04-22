package assign4;
//import java.io.*;
import java.util.*;

public class part2 {
	
	//method to get the maximum value in the array
	static int getMax(int arr[],int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		return max;
	}
	
	//method for counting the sort of the array depending on exp       
	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; 
		int i; 
		int count[] = new int[10];
		Arrays.fill(count,0); 
 
		//storing count of occurrences in count[]
		for (i = 0; i < n; i++) 
			
		  	//if(i % 2 == 1) 
	        //{
	           //System.out.println("***Abort*** the input has at least one key with odd digits");
	            //System.exit(0);
	        //}
			count[ (arr[i]/exp)%10 ]++; 

		//changing count[i] to the correct position  
		for (i = 1; i < 10; i++) 
			count[i] += count[i - 1]; 

		//output array 
		for (i = n - 1; i >= 0; i--) 
		{ 
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
			count[ (arr[i]/exp)%10 ]--; 
		} 

		
		
		//copy output array to arr[] to update it with sorted numbers according to the current digit
		for (i = 0; i < n; i++) 
			{
			arr[i] = output[i]; 
			}
			
	} 

	//method to sort arr[] of size n
	static void radixsort(int arr[], int n)
	{
		//finding max number to figure out the number of digits
		int m=getMax(arr,n);		
		
		//counting sort with exp instead of digit number
		for (int exp=1;m/exp>0;exp *=10)
		{
			countSort(arr,n,exp);
		}
	}
	
	//printing method
	static void print(int arr[],int n)
	{
		for (int i=0; i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
//tester
	public static void main (String[] args) 
	{ 
		//int arr[] = {24, 12, 4, 366, 45, 66, 8, 14};
		int arr[] = {24, 2, 4, 466, 48, 66, 8, 44};
		int n = arr.length; 
		radixsort(arr, n); 
		print(arr, n); 
	} 
}

/* b) running time complexity is o(d*(n+b)), b is the base, d would be O(logb(k))and when k is limited time complexity becomes o(nlog(n))*/

