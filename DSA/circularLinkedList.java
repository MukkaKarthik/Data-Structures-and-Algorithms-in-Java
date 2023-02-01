package DSA;

import java.util.*;

public class circularLinkedList {

	public class CircularLinkedListImplementation
	{
		CircularLinkedListImplementation nextElement;
		int data_tobeStored;
		
		public CircularLinkedListImplementation(int localData)
		{
			this.data_tobeStored = localData;
		}
	}
	
	CircularLinkedListImplementation lastNode;
	int Length_CircularLinkedList;
	
	public void pushNode(int giveData)
	{
		CircularLinkedListImplementation c = new CircularLinkedListImplementation(giveData);
		if(Length_CircularLinkedList == 0)
		{
				lastNode = c;
			lastNode.nextElement = lastNode;
				
		}
		else
		{
		
			c.nextElement = lastNode;
			lastNode.nextElement = c;
			
			Length_CircularLinkedList++;
		}
	}
	
	public void LinkedListLength()
	{
		 System.out.println(Length_CircularLinkedList);
	}
	
	public int returnCurrentNodeValue()
	{
		return lastNode.data_tobeStored;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circularLinkedList mainList = new circularLinkedList();
		

		List<Integer> a = new ArrayList<Integer>();
		
		mainList.pushNode(10);
		a.add(mainList.returnCurrentNodeValue());
		System.out.println("last element data = " + mainList.lastNode.data_tobeStored);
		
		mainList.pushNode(20);
		a.add(mainList.returnCurrentNodeValue());
		System.out.println("last element data = " + mainList.lastNode.data_tobeStored);
		
		
		mainList.pushNode(30);
		a.add(mainList.returnCurrentNodeValue());
		System.out.println("last element data = " + mainList.lastNode.data_tobeStored);
		
		
		mainList.pushNode(40);
		a.add(mainList.returnCurrentNodeValue());
		System.out.println("last element data = " + mainList.lastNode.data_tobeStored);
		System.out.println(a);
		
		
	}

}
