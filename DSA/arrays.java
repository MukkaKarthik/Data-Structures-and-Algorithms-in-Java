package DSA;

import java.util.ArrayList;
import java.util.Set;

public class arrays {
	
	//printing array using methods
	public void printArray(int[] localArray)
	{
		System.out.println("printing received array ");
		for(int wLocal = 0 ; wLocal < localArray.length ; wLocal++)
		{
			System.out.print(localArray[wLocal] + " ");
			
		}
		
	}	
	
	
	
	
	
		//Removing  even integers from an array 
		

		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		
	  public void removeEvenNumbers(int[] localArray)
	  {
		  //collecting and storing in an array
		  for(int ylocal=0 ; ylocal < localArray.length ; ylocal++)
		  {
			  if(localArray[ylocal] %2 == 1)
			  {
				 tempArray.add(localArray[ylocal]);
			  }
		  }
		  
		  System.out.println("Printing resultant array after removing even numbers ");
		  
		  //Printing resultant array 
		  for(int z  : tempArray)
		  {
			  System.out.print(z + " ");
		  }
		  
		  
	  }
		
	  
	  
	  
	  // Reversing an array 
	  
	  
	  public void reverseArrayMethod(int[] localArray)
	  {
		  ArrayList<Integer> reversedFinalArray = new ArrayList<Integer>(localArray.length);
			 
		  
		  for(int f=localArray.length-1;f>=0 ; f--)
		  {
			reversedFinalArray.add(localArray[f]);  
		  }
		  
		  //printing reversed array 
		  
		  System.out.println("Printing reversed array");
		  
		  for(int iLocal : reversedFinalArray)
		  {
			  System.out.print(iLocal + " ");
		  }
		  
	  }
	  
	  
	  
	  
	  //find the minimum value 
	  
	  
	  
	  public void calculateMinimumValue(int[] localArray)
	  {
		  int minValue=localArray[0];

		  for(int p=1 ; p<localArray.length-1; p++)
		  {
			  while( localArray[p] <minValue )
			  {
				  minValue = localArray[p];
				  
			  }
			  
		  }
		  
		  System.out.println("Minimum value of the given array = " + minValue);
				  
	  }
	  
		
	  
	  // to find maximum value in the array 
	  
	  public void findMaximumValue(int[] localArray)
	  {
		  int MaximumInitialValue = localArray[0];

		  
		  for(int q = 1 ; q < localArray.length ; q++)
		  {
			  
			  while((localArray[q] > MaximumInitialValue ))
			  {
				  MaximumInitialValue = localArray[q];
			  }
		  }
	 
		  System.out.println("Maximum value of the given array = " + MaximumInitialValue );
	  }
	
	  
	  
	  
	  
	  // Moving zeroes to the end of an array
	  
	  public void MoveZeroes_toEnd(int[] localY)
	  {
		  ArrayList<Integer> addZeroesOnly = new ArrayList<Integer>();
		  
		  ArrayList<Integer> add_NotZeroes = new ArrayList<Integer>();
		  
		  
		  for(int e=0 ; e < localY.length; e++)
		  {
			  if(localY[e] == 0)
			  {
				  addZeroesOnly.add(localY[e]);
			  }
			  else
			  {
				  add_NotZeroes.add(localY[e]);
			  }
		  }
		  
		  ArrayList<Integer> finalArray = new ArrayList<Integer>();
		  finalArray.addAll(add_NotZeroes);
		  finalArray.addAll(addZeroesOnly);
		  
		  // finally printing FinalArray
		  
		  for(int finalLocal : finalArray)
		  {
			  System.out.print(finalLocal + " ");
		  }
		  
	  }
	  
	  
	  
	  
	  //  Re-sizing an array 
	  
	  public void resizeArray(int[] localArray , int RequiredSize)
	  {
		  int[] newIncreasedArray = new int[RequiredSize];
		  
		  //copying elements from original array to new final array
		  
		  for(int g = 0 ; g<localArray.length ; g++)
		  {
			  newIncreasedArray[g] = localArray[g];
		  }
		  
		  for(int p=0; p<newIncreasedArray.length;p++)
		  {
			  System.out.print(newIncreasedArray[p]  + " ");
		  }
		  
		  System.out.println("size of the original array = " + localArray.length);
		  System.out.println("size of the increased array = " + newIncreasedArray.length);
	  }

	  
	  //3,6,7,8
	  
	  //finding missing numbers 
	  
	  public void findMissingNumber(int[] missLocal)
	  {
		  int[] matchThisArray = {1,2,3,4,5};
		  
		  ArrayList<Integer> missingNumber = new ArrayList<Integer>();
		  
	
	
		
		  for(int p=0;p<matchThisArray.length;p++)
		  {
			  for(int q=0 ; q<missLocal.length; q++)
			  {
				  
				  if(matchThisArray[p] != missLocal[q])
				  {
					 	  missingNumber.add( matchThisArray[p]);

				  }
				  else
				  {
					 
					  break;
				  }
				  
			  }
		  }
		  
		  //printing missing numbers loop
		  
		  for(int i : missingNumber)
		  {
			  System.out.print(i + " ");
		  }
		  
		  
		 
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] firstArray = new String[2];
		firstArray[0] = "Bangalore";
		firstArray[1] = "Chennai";
		
		for(String localTemp : firstArray)
		{
			System.out.println(localTemp);
		}
		

		int[] secondArray = {2,3,4,5,6,7};
		
		for(int yLocal=0 ; yLocal < secondArray.length ; yLocal++)
		{
			System.out.println(yLocal);
		}


		ArrayList<String> insertAllDataTypes = new ArrayList<String>();
		
		insertAllDataTypes.add("first word");
		insertAllDataTypes.add("second word");
		insertAllDataTypes.add("third word");
		
		System.out.println("Printing ArrayList");
		for(String aLocal : insertAllDataTypes)
		{
			System.out.print(aLocal + " ");
		}
		
		
		
		
		
		
		int[] thirdArray = new int[6];
		
		for(int zLocal=0 ; zLocal < thirdArray.length ; zLocal++)
		{
			System.out.println(thirdArray[zLocal]);
		
		}
		System.out.println("Printing index using length property calculation");
		System.out.println(thirdArray[thirdArray.length - 2]); 
		
		
		
		
		try
		{
			throw new ArrayIndexOutOfBoundsException("This is a checked exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("internal error fixed for catched exception");
			e.printStackTrace();
		}
		
		System.out.println("continuing after catch block");
		
		
		
		
		
		//printing arrays using method calling 
		
		arrays classObject = new arrays();
		
		int[] sendArray_methodCalling = {1,5,4,3,2};
		
		classObject.printArray(sendArray_methodCalling);
		
		System.out.println();
		// creating an array and calling function directly 
		classObject.printArray(new int[] {2,20,36,47,61,47});
		
		
		
		
		
		//Removing even numbers from array method calling 
		System.out.println();
		int[] actualArray = {2,3,4,5,6,7,8};
		classObject.removeEvenNumbers(actualArray);
		
		
		
		// Reverse a given array
		
		int[] rev = {10,20,30,40,50};
		classObject.reverseArrayMethod(rev);
		
		
		//Minimum value in an array 
		System.out.println();
		System.out.println("Least value in the given array ");
		classObject.calculateMinimumValue(new int[] {20,45,10,4,2,19,30});
		
		
		//Maximum value in an array 
		System.out.println();
		System.out.println("Maximum value in an array = ");
		classObject.findMaximumValue(new int[] {20,45,10,4,2,19,30,90});
		
		
		// adding zeroes to the end
		System.out.println();
		System.out.println("array finally obtained after adding zeroes at the last = ");
		classObject.MoveZeroes_toEnd(new int[] {32,34,0,56,67,0,0,45,67,0,43});
		
		
		// Re-sizing an array 
		
		System.out.println();
		System.out.println("after re-sizing array array has following elements");
		classObject.resizeArray(new int[] {3,4,5,6,7},10);
		
		
		
		//find missing numbers and printing them 
		System.out.println();
		System.out.println("after matching with missing numbers we get");
		
		classObject.findMissingNumber(new int[] {3,6,7,8});
	}

	
}
