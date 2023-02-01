package DSA;

public class binaryTree {

	public class BinaryTreeImplementation
	{
		public BinaryTreeImplementation leftSide;
		public BinaryTreeImplementation RightSide;
		
		public int Node_middleData;
		
		public BinaryTreeImplementation(int localData)
		{
			this.Node_middleData = localData;
			leftSide = null;
			RightSide = null;
		}
	}	
		
		public BinaryTreeImplementation rootNode;
		
		

		public void createBinaryTree()
		{
BinaryTreeImplementation firstNode = new BinaryTreeImplementation(10);
BinaryTreeImplementation secondNode = new BinaryTreeImplementation(20);
BinaryTreeImplementation thirdNode = new BinaryTreeImplementation(30);
BinaryTreeImplementation fourthNode = new BinaryTreeImplementation(40);
BinaryTreeImplementation fifthNode = new BinaryTreeImplementation(50);

rootNode = firstNode;

firstNode.leftSide = secondNode;
firstNode.RightSide  = thirdNode;

secondNode.leftSide = fourthNode;
secondNode.RightSide = fifthNode;

					
		}
		
		
		public void preOrder(BinaryTreeImplementation localRoot)
		{
			
			if(localRoot == null)
			{
				return;
			}
			
			else
			{
				System.out.print(localRoot.Node_middleData + " ");
				
				preOrder(rootNode.leftSide);
				preOrder(localRoot.RightSide);
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binaryTree b = new binaryTree();
		b.preOrder(b.rootNode);
		
		
		
	}

}
