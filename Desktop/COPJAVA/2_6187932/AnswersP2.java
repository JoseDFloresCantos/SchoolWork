	import java.util.*;
	import java.io.*;
	import java.util.Stack;


//*****Part 2***********
public class AnswersP2 {
	
	
	public static int leader(int[] A)
	{
	Stack<Integer> leader = new Stack<Integer>(); // create a stack 
	int count = 1;
	leader.push(A[0]); // push first element to the stack
	for(int i=1;i<A.length;i++)
	{
	// if top most element is equal to current array element increment the count , else decrement the count
	if((Integer)leader.peek() == A[i]){
	count += 1;
	}
	else {
	count -= 1;
	}
	// if count is equal to 0 replace the top of stack with current array element
	if (count == 0)
	{
	if(!leader.empty())
	{
	leader.pop();
	}
	leader.push(A[i]);
	count = 1;//update count
	}
	}
	return leader.pop();
	}

	// Method for checking leader element and index i
	public static int leaderIndex(int[] arr , int leader)
	{
	int count = 0;
	int leader_index = -1;
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i] == leader)	//comparing leader element with the element at index i
	{
	count += 1; //update count
	leader_index = i;
	}
	}
	if(count > arr.length/2)
	{
	return leader_index; //returning leader
	}
	return -1; //returning -1 if there is no leader
	}

	public static void main(String[] args){
	//int A[] = {23 , 23 , 67 , 23 , 67 , 23 , 45};
	int A[] = {23 , 24 , 67 , 23 , 67 , 23 , 45};
	int leader = leader(A);
	System.out.println("Result:");
	System.out.println(leaderIndex(A , leader));
	}
	}
	


