package DSA;

import java.util.ArrayList;

public class queueImplementation {

	public class ListNodeImplementation
	{
		public ListNodeImplementation NextElement;
		public int dataStored;
		
		public ListNodeImplementation(int localData)
		{
			this.dataStored = localData;
			this.NextElement = null;
		}
		
	}
	
	public ListNodeImplementation headElement;
	public ListNodeImplementation tailElement;
	public int lengthQueue;
	
	//Initial Nodes and data values 
	
	public queueImplementation()
	{
		lengthQueue = 0;
		
		tailElement = headElement.NextElement;
	
	}
	
	
	
	public Boolean isStackEmpty()
	{
		return lengthQueue ==0;
		
	}
	
	
	public void PushMethod(int LocalData)
	{
		ListNodeImplementation a = new ListNodeImplementation(LocalData);
		tailElement.NextElement = a;
		
//		a.NextElement = null;
//		
//		headElement.NextElement = tailElement;
		
		
		tailElement =a;
		
		lengthQueue++;
		
		System.out.println("Length of the queue = " + lengthQueue);
	}
	
	
	
	
	public void popMethod()
	{
		headElement = headElement.NextElement;
		tailElement = tailElement.NextElement;
		lengthQueue--;
		
		System.out.println("Length of the queue is = " + lengthQueue);
	}
	
	public int ReturnHeadElement()
	{
		return headElement.dataStored;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queueImplementation q = new queueImplementation();
		
		ArrayList<Integer> aCompleteQueue = new ArrayList<Integer>();
		
		q.PushMethod(10);
		
		aCompleteQueue.add(q.ReturnHeadElement());
		
		q.PushMethod(20);
		
		aCompleteQueue.add(q.ReturnHeadElement());
		
		q.PushMethod(30);
		
		aCompleteQueue.add(q.ReturnHeadElement());
		
		
		//Printing complete stack list 
		
		System.out.println(aCompleteQueue);
		
		
		
		
	}

}
