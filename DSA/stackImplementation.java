package DSA;

import java.util.ArrayList;
import java.util.List;

public class stackImplementation {

	public class ListNodeImplementation
	{
		public ListNodeImplementation nextNode;
		public int dataValue;
		
		public ListNodeImplementation(int LocalValue)
		{
			this.dataValue = LocalValue;
		}
		
		
	}
	
	// Creating temporary array list for retrieving purpose 
	
			ArrayList<Integer> use_forRetrievePurpose = new ArrayList<Integer>();
	
	
	
	private ListNodeImplementation top ;
	private int length;
	
	public stackImplementation()
	{
		this.length = 0;
		this.top = null;
	}
	
	public int CalculateLength()
	{
		return length;
	}
	
	public boolean isStackEmpty()
	{
		return (length == 0);
	}
	
	public void Push(int pushdata)
	{
		ListNodeImplementation firstNodePush = new ListNodeImplementation(pushdata);
		
		firstNodePush.nextNode = top;
		

		top = firstNodePush;
		
		length++;
		
		//System.out.println("Length of stack after pushing node = " + this.CalculateLength());
		
		
		
		
		use_forRetrievePurpose.add(pushdata);
		
	}
	
	public void getALL_retrievedPusposeData()
	{
		System.out.println(use_forRetrievePurpose);
	}
	
	public void giveresultantTopNodeData()
	{
		System.out.println(top.dataValue);
	}
	
	public int giveResultTopNodeValue()
	{
		return top.dataValue;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stackImplementation s = new stackImplementation();
		
		ArrayList<Integer> completeSList = new ArrayList<Integer>();
		
		s.Push(100);

		completeSList.add(s.giveResultTopNodeValue());
		
		s.Push(250);
		completeSList.add(s.giveResultTopNodeValue());
		
		s.giveresultantTopNodeData();
		
		
		stackImplementation y = new stackImplementation();
		y.Push(1000);
		
		completeSList.add(y.giveResultTopNodeValue());
		y.Push(2000);
		
		completeSList.add(y.giveResultTopNodeValue());
		y.giveresultantTopNodeData();
		
		
		System.out.println(completeSList);
		
		
		//Now reversing this list using array list implementation 
		
		stackImplementation z = new stackImplementation();
		
		int[] a = {1,2,3,4,5,10,20,30,40,50};
		
		for(int tLocal = a.length-1 ; tLocal >=0 ; tLocal--)
		{
			z.Push(a[tLocal]);
		}
		
		System.out.println("reversing array data using stacks");
		z.getALL_retrievedPusposeData();
		
		
		
	}

}
