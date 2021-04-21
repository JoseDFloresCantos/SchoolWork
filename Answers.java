package Assign1;

/************************************************************** 
 * Purpose/Description: <Time complexity,BST,index stability>
 *  Author’s Panther ID: <6187932> Jose Flores
 *  Certification: I hereby certify that this work is my own and none of it is the work of any other person. 
 *  **************************************************************/
/* The Purpose and idea of the algorithm for problem 2b is to go row by row from left to right in the descending order, then once it reaches the end of a row or a number smaller than x, it goes to the next row until it reaches a row smaller than x then the program is over*/


public class Answers {


	public static void Problem1(int [] arr) //method for adding elements left of the index and comparing to the addition of the right of the index to find the stable index.
	{
		int left=0;
		int right=0;
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			right += arr[i];
			
		}
		for(int i=0;i<n;i++)
		{
			right -=arr[i];
			
			if(left==right)
	{
		System.out.println("Stable Index:"+i);
		System.out.println(left+"="+right);
	}
			left+=arr[i];
		}
}
	//problem 2a
	public static int maxElement(int[] arr)	//setting method for returning the index for the elements on the left to be increasing and on the right decreasing 
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
		if((mid==0||arr[mid-1]<arr[mid])&&(mid==arr.length-1||arr[mid+1]<=arr[mid])) 
		{
			return mid;
		}
		if(arr[start]<arr[mid])
		{
		end=mid-1;	
		}
		else
		start=mid+1;	
		}
		return -1;
	}
	
	public static void find(int arr[], int key)
	{
		int index=maxElement(arr);	// setting index to maximum element
	      
	    int found=increasingBinarySearch(arr,0,index,key);	//looking for the maximum element in ascending order from the key number
	       
	       if(found==-1)
	       {
	           found=decreasingBinarySearch(arr,index,arr.length-1,key);	//starts looking in descending order if not located in the ascending search
	       } 
	       if(found==-1)
	           System.out.println(key+" is not present in array");
	       else
	           System.out.println(key+" is present in array");
	   }
	   
	
	public static int increasingBinarySearch(int arr[],int start,int end, int key) //ascending search, setting parameters 
	{
		while(start<=end) 
		{
		int mid=(start+end)/2;
		if(arr[mid]==key)
		{
			return mid;
		}	
		if(arr[mid]>key)	
		{
			end=mid-1;	
		}
		else
			start=mid+1;
		}
		return-1;
	}
	
	public static int decreasingBinarySearch(int arr[],int start,int end,int key) //descending search
	{
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			if(arr[mid]<key)
			{
				end=mid-1;
			}
			else
				start=mid+1;
		}
		
		return -1;
	}
	
	/* The Purpose and idea of the algorithm for problem 2b is to go row by row from left to right in the descending order, then once it reaches the end of a row or a number smaller than x, it goes to the next row until it reaches a row smaller than x then the program is over*/

	
	public static void prob2B(int[][] arr, int x) {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = 0;
        while(i < row){
            if(arr[i][j] == x) {
                System.out.println(x + " is found");
                return;
            }
            System.out.println(i + " " + j + "     " + arr[i][j]);
            if(j == row-1 || arr[i][j] < x) {
                j = 0;
                i++;
            }
            j++;
            
        }
        System.out.println(x + " was not found");
    }

	
	public static void main(String[] args) {
		
		int [] A= {0,-3,5,-4,-2,3,1,0};
		int [] B= {-5,2,1,0,3,-3,2,6};
		int [] C= {1,4,0,-2,1,3,4,-1};
		
		System.out.println("Problem 1:");
		System.out.println();
		System.out.println("Array A");
		Problem1(A);
		System.out.println();
		System.out.println("Array B");
		Problem1(B);
		System.out.println();
		System.out.println("Array C");
		Problem1(C);
		System.out.println();
		System.out.println("Problem 2a:");
		System.out.println();
		System.out.println("Array D");
		int[] D= {1,3,4,5,7,14,11,7,2,-4,-8};
		find(D,2);
	    find(D,31);
	    find(D,1);
	    find(D,14);
	    find(D,95);
	    find(D,-4);
	    find(D,-8);
		
		System.out.println();
        System.out.println("Problem 2b:");
		System.out.println();

        
        int[][] matrixA = {{26,22,17,10},
                            {19,16,12,7},
                            {12,10,7,4},
                            {5,4,2,1}};
        int x = 15;
        int y = 4;
        
        prob2B(matrixA, x);
        prob2B(matrixA, y);
		
	}
}


