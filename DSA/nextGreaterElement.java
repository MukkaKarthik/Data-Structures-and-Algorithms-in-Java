package DSA;


public class nextGreaterElement {

	
	
	int[] OriginalArray = new int[(12)];
	
	int[] matchThisArray = new int[(12)];

	
	public void findNextGreaterElement(int[] localArray)
	{
		this.OriginalArray = localArray;
		
		this.matchThisArray = localArray;
		
		// 23,6,9,3,24,45,67,89,34,45
		// 23,6,9,3,24,45,67,89,34,45
		
		
		//23,3,25,67,89,97
		
//		23
//		25,
//		
//		3
//				
		
		for(int i = 0 ; i<OriginalArray.length; i++)
		{
			int temporaryNumber = OriginalArray[i];
			for(int y=0; y<matchThisArray.length ;  y++)
			{
				while(temporaryNumber < matchThisArray[y])
				{
					temporaryNumber = matchThisArray[y];
					OriginalArray[i] = temporaryNumber;
					
					i++;
					break;
				}
				
				
				//result :- 25 67 89 97 89 97 
		}
	}
}
	
	
		
		
		//printing final sorted array
		
		public void PrintSortedArray()
		{
			for(int r = 0 ; r<OriginalArray.length; r++)
			{
				System.out.print(OriginalArray[r] + " ");
			}	
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] giveThisArray = { 23,3,25,67,89,97,12,45,56,68,32,100};
		nextGreaterElement n = new nextGreaterElement();
		n.findNextGreaterElement(giveThisArray);
		
		n.PrintSortedArray();
		

	}

}
