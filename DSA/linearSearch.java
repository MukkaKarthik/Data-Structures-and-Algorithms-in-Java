package DSA;

public class linearSearch {

	public String LinearSearch(int[] localArray, int givenNumber)
	{
		for(int alocal = 0 ; alocal < localArray.length ; alocal++)
		{
			if(localArray[alocal] == givenNumber)
			{
				return "Given number " + givenNumber + " is present at index " + alocal + " which has value as " + localArray[alocal];
			}
		}
		return "Given number doesn't match with any element in the given string";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linearSearch l= new linearSearch();
		System.out.println(l.LinearSearch(new int[] {1,2,3,4,5},76));
		System.out.println();
		System.out.println(l.LinearSearch(new int[] {1,2,3,4,5},4));
		System.out.println();
		System.out.println(l.LinearSearch(new int[] {1,2,3,4,5},2));
		System.out.println();
		System.out.println(l.LinearSearch(new int[] {1,2,3,4,5},89));
	}

}
