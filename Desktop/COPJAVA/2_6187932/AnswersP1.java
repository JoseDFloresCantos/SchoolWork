/************************************************************** 
 * Purpose/Description: <compare/difference in sets,Stacks/leader,BST>
 *  Author’s Panther ID: <6187932> Jose Flores
 *  Certification: I hereby certify that this work is my own and none of it is the work of any other person. 
 *  **************************************************************/

//import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



//******Part 1***********

public class AnswersP1<AnyType> {

	
	public static <AnyType extends Comparable<? super AnyType>>
	 void difference(List<AnyType> L1, List<AnyType> L2, List<AnyType> Difference)
	 {
	 ListIterator<AnyType> iterL1 = L1.listIterator();
	 ListIterator<AnyType> iterL2 = L2.listIterator();
	 AnyType itemL1=null;
	 AnyType itemL2=null;
	if ( iterL1.hasNext() && iterL2.hasNext() )
		 
	 {
		 itemL1 = iterL1.next();
		 itemL2 = iterL2.next();
	 }
	
//while they are both not empty
	
	while ( itemL1 != null && itemL2 != null )
	{
	if( itemL1.compareTo(itemL2) !=0 ) //if they both match, return 0
	{
		Difference.add(itemL1);	//when they don't match,add to the Difference
		if(iterL1.hasNext()) //if L1 has next, go to it, if not compare with last in list
		{
			itemL1=iterL1.next();
			
		}	
		if(iterL2.hasNext())	//if L2 has next, go to it, if not compare with last in list
		{
			itemL2=iterL2.next();
		}
		if (iterL1.hasNext()==false &&iterL2.hasNext()==false)	//if both are last in list, exit loop.
		{
			break;
		}
		
		}
	}
	
		System.out.print(Difference);
		
	}
}
	
	