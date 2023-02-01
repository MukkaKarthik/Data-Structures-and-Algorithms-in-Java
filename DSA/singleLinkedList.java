package DSA;


//Representation of Single linked list
public  class singleLinkedList {

	public static  ListNode head; // providing an instance variable 
	
	
	
	private static class ListNode
	{
		
		public int dataElement;
		public  ListNode next;
		
		public ListNode(int  localData)
		{
			this.dataElement = localData;
			this.next = null;
			
		}
		
		//Printing complete linked list details 
		
		public void displayLinkedList()
		{
			ListNode currentElement = head;
			
			while(currentElement != null)
			{
				System.out.print(currentElement.dataElement + " --> ");
				currentElement = currentElement.next;
			}
			
			System.out.print("null : this is last element ");
		}
		
		
		
		// printing count(length) of the linked list
		
		public void findLength()
		{
			ListNode currentElement_findLength = head;
			int currentCount = 0;
			
			while(currentElement_findLength != null)
			{
				currentCount++;
				currentElement_findLength = currentElement_findLength.next;
				
			}
			System.out.println("count of the linked list = " + currentCount); // 4
			
			// if we replace entire loop with if , then we get result as 1 
			
//			if(currentElement_findLength != null)
//			{
//				currentCount++;
//				currentElement_findLength = currentElement_findLength.next;
//				
//			}
//			System.out.println("count of the linked list = " + currentCount); // 1
//			
		}
		
		
		//Inserting nodes at the beginning
		public void insertNewNode(int localData)
		{
			ListNode newNode_beginning = new ListNode(localData);
			newNode_beginning.next =head;
			head = newNode_beginning;
			System.out.println("Elements after insertion using method = ");
			System.out.println();
			this.displayLinkedList();
		}
		
		
		
		//Inserting nodes at the end 
		
		public void insertLastNode(int data)
		{
			ListNode lastNode_atEnd = new ListNode(data);

			ListNode current = head;
			while(null!= current.next)
			{
				current = current.next;
				
			}
			
			current.next = lastNode_atEnd;
			System.out.println("Elements after insertion at the end");
			System.out.println();
			this.displayLinkedList();
			
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		singleLinkedList a = new singleLinkedList();
		

		
		
		a.head = new ListNode(5);

		//creating 3 nodes 
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(20);
		ListNode fourth = new ListNode(30);

		
		//forming chain by connecting nodes
		a.head.next = second; // 5 -->10
		second.next = third;//10 --> 20
		third.next = fourth;//10 --> 20 --> 30 --> null
		
		System.out.println(second.dataElement);
		System.out.println(third.dataElement);
		System.out.println(fourth.dataElement);
		
		a.head.displayLinkedList();
		
		System.out.println();
		singleLinkedList.head.findLength();
		
		
		//Inserting node at the starting 
		
		ListNode insertNode_atBeginning = new ListNode(-34);
		
		insertNode_atBeginning.next = head;
		
		
		//Making new node as head as it is the first element 
		head = insertNode_atBeginning;
		
		System.out.println("Displaying linked list after adding nodes in the beginning");

		a.head.displayLinkedList();
		
		
		//Inserting one more node at the beginning
		
		ListNode insertOneMore = new ListNode(-100);
		
		insertOneMore.next = head;
		
		 head = insertOneMore;
		
		System.out.println("Elements after insertion");
		a.head.displayLinkedList();
		
		
		//Inserting nodes at the beginning  using method 
		a.head.insertNewNode(-150);
		
		
		//Inserting nodes at the end using method 
		a.head.insertLastNode(250);
		
		
		
	

	}

}



