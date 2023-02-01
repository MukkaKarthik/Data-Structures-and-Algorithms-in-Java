package DSA;

public class sortedArray {

	
	// fetch element index from array if found 
	
	// 3,4,5,6,1,2
	
	public void findIndex_RequiredElement(int[] localArray, int requiredNumber)
	{
		for(int y = 0 ; y < localArray.length; y++)
		{
			if(requiredNumber == localArray[y])
			{
				System.out.println("Element " + localArray[y]  + " found at index " + y);
				return;
			}
			
			
			//Now inserting element if not found 
			
			else
			{
				if(requiredNumber < localArray[y])
				{
					System.out.println("Element " + localArray[y]  +" should be inserted at index =  " + y);
					return;
					
				}
			}
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sortedArray s = new sortedArray();
		
		int[] a = {3,4,7,8,10};
		
		s.findIndex_RequiredElement(a, 7);
		s.findIndex_RequiredElement(a, 5);
		
		

	}

}
