/************************************************************** 
 * Purpose/Description: <Heap Method>
 *  Author’s Panther ID: <6187932> Jose Flores
 *  Certification: I hereby certify that this work is my own and none of it is the work of any other person. 
 *  **************************************************************/



public class part2c {
	
	public void replaceKey(Integer oldKey, Integer newKey)
	{
	   // Local variable
	   boolean found = false;
	          
	   // Loop for the keys in the heap
	   for (int i = 1; i < currentSize; i++)
	   {      
	       // Checking if oldKey is present in the heap
	       if (oldKey.compareTo((Integer) arr[i]) == 0)
	       { 
	           found = true;
	          
	           // Making oldKey to newKey
	           arr[i] = (AnyType) newKey;
	          
	           // rebuilding the heap and percolating the new element
	           for (i = currentSize / 2; i > 0; i--)
	           {
	               percolateDown(i);
	           }      
	          
	           break;
	       }
	   }
	  
	   // display for when oldKey is not present
	   if(found == false)
	   {
	       System.out.println(oldKey + " is not present in the heap.");
	
	   }
	}

}
