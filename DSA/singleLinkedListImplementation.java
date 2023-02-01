package DSA;

import java.util.ArrayList;

public class singleLinkedListImplementation {
	
	 class ListNodeImplementation
		{
			public ListNodeImplementation nextElement;
			public int dataStoredCurrentElement;
			
			
			
			public ListNodeImplementation(int LocalData)
			{
				this.dataStoredCurrentElement = LocalData;
				
			}
		}
	 
	 
			
			 ListNodeImplementation headNode;
			 int lengthOF_LinkedList = 0;
			 public ListNodeImplementation previousNode;
			 

			 void pushMethod(int LocalPushData)
			 {
				 ListNodeImplementation s =new ListNodeImplementation(LocalPushData);

				 if(lengthOF_LinkedList == 0)
				 {
					 headNode = s;
					 
				 }
				 else
				 {
					 headNode.nextElement = s;
					 lengthOF_LinkedList++;
					 
				 }
				  
			 }
			 
			 
			 //Pushing node at certain index
			 void pushAtCertainIndex(int LocalPushData)
			 {
				 ListNodeImplementation f =new ListNodeImplementation(LocalPushData);
				
				 if(lengthOF_LinkedList == 0)
				 {
					 headNode = f;
					 
				 }
				 
				 else
				 {

					 headNode.nextElement = f;
					 f.nextElement = previousNode;
					 
				 }

			 }
			 
			 
			 
			 //Searching an element in Single linked list 
			 
			 public void SearchNode()
			 {
				
				System.out.println("Head element in the list = " + headNode.dataStoredCurrentElement);
				 
			 }
			
			 
			 
			 
			 
		
			 public void return_linkedListLength()
			 {
				 System.out.println("Length of the linked list = "  + lengthOF_LinkedList); 
			 }
			 
			 public int  CurrentListElement()
			 {
				 	return headNode.dataStoredCurrentElement;
				 	
			 }
			 
			 
			 
			 // insert node at the last 
			 
			 public void insertNode_last(int NodeValue_local)
			 {
				 ListNodeImplementation lastNode_toBeInserted = new ListNodeImplementation(NodeValue_local);
				 
				 if(headNode == null)
				 {
					 headNode = lastNode_toBeInserted;
				 }
				 
				 ListNodeImplementation currentIteratorNode = headNode;
				 while(currentIteratorNode.nextElement !=  null)
				 {
					 currentIteratorNode = currentIteratorNode.nextElement;
				 }
				 currentIteratorNode.nextElement = lastNode_toBeInserted;
			 }
			 
			 
			 // display Linked list without using ArrayList 
			 
			 public void displayLinkedList()
			 {
				 
				 ListNodeImplementation currentIterator;
				 
				 if(headNode == null)
				 {
					 System.out.println("No nodes are present in the linked list");
				 }
				 
				 else
				 {
					 currentIterator = headNode;
					 while(currentIterator != null )
					 {
						 currentIterator = currentIterator.nextElement;
						 System.out.print(currentIterator.dataStoredCurrentElement + " --> ");
						 
						 if(currentIterator.nextElement ==  null)
						 {
							 break;
						 }
					 }
					 System.out.print("null");
				 }
			 }
			 
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleLinkedListImplementation mainClass = new singleLinkedListImplementation();
		
		ArrayList<Integer> ay = new ArrayList<Integer>();
		
		mainClass.pushMethod(25);
		ay.add(mainClass.CurrentListElement());
		
		
		mainClass.pushMethod(35);
		ay.add(mainClass.CurrentListElement());
		
		mainClass.pushMethod(45);
		ay.add(mainClass.CurrentListElement());
		
		mainClass.pushMethod(55);
		ay.add(mainClass.CurrentListElement());
		
		mainClass.pushMethod(65);
		ay.add(mainClass.CurrentListElement());
		
		mainClass.pushMethod(90);
		ay.add(mainClass.CurrentListElement());
		System.out.println(ay);

		
		mainClass.SearchNode();
		
		//Displaying linked list without using array list 
		
		mainClass.insertNode_last(20);
		mainClass.insertNode_last(30);
		mainClass.insertNode_last(40);
		mainClass.insertNode_last(50);
		mainClass.insertNode_last(60);
		mainClass.insertNode_last(70);
		
		System.out.println("Displaying linked list without using array list");
		System.out.println();
		mainClass.displayLinkedList();
		
			
			
		}
		
				 
		
		

	}


