/************************************************************** 
 * Purpose/Description: <sorting Arrays,redix>
 *  Author’s Panther ID: <6187932> Jose Flores
 *  Certification: I hereby certify that this work is my own and none of it is the work of any other person. 
 *  **************************************************************/


package assign4;
import java.util.*;

public class part1 {
	
	static int[] moveAllNegativeOne(int[] a) //method for rearranging -1 to the end
	{
		int i=0;
		int j=0;
		int k=a.length-1;
		int[]b=new int[a.length]; //new array with same length as a
		for(i=0;i<a.length;i++) //loop for traversing array
		{
			if(a[i]==-1) //when index is at -1, send -1 to the end of array b, then decrease one position
			{
				b[k]=-1;
				k--;
			}
			else //if not place indexed number in the front of array b and increase the position
			{
				b[j]=a[i];
				j++;
			}	
		}
		return b; //return array b
		
	}

	public static void main(String[] args) {
		
	//int[]a=new int[] {6,-1,5,2,3,-1,4,-1,-1};	
	int[]a=new int[] {3,-1,5,6,12,-1,45,66,-1,9,4};
		System.out.println("Input:"+Arrays.toString(a));
	a=moveAllNegativeOne(a);
	System.out.println("Output:"+Arrays.toString(a));
		
		
	}

}

