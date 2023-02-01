package DSA;

public class maxHeap {

	//Maximum binary heap means parent node index will have a greater value than it's children node index values 
	
	// root node will have the maximum value 
	
	public int[] maximumHeapStructure;
	int lengthOFHeap;
	
	Boolean isHeapEmpty = true;
	
	public int return_lengthOfHeap()
	{
		return lengthOFHeap;
	}
	
	public Boolean  isHeapEmpty()
	{
		return this.isHeapEmpty;
	}
	

	public maxHeap(int localLength)
	{
		this.lengthOFHeap = 0;
		
		this.maximumHeapStructure = new int[localLength+1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		maxHeap m = new maxHeap(9);
		
		System.out.println("Size of the heap structure = " + m.maximumHeapStructure.length);
		
		System.out.println("Length of the maximum heap : " + m.return_lengthOfHeap());
		
		System.out.println("Is Heap Empty = " + m.isHeapEmpty());

	}

}
