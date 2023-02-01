package DSA;

import java.util.LinkedList;

//this is Square undirected graph

// In undirected graph ,there is no direction 

// this has 4 vertices and 4 edges 

public class graphImplementation {

public int[][] adjacentMatrix;

LinkedList<Integer> a = new LinkedList<Integer>();




// creating matrix table rows and columns using constructor
	public graphImplementation(int LocalNumber)
	{
		this.adjacentMatrix = new int[LocalNumber][LocalNumber];
	}

	//adding Edges
	
	public void addEdges(int NodeX, int NodeY)
	{
		this.adjacentMatrix[NodeX][NodeY] = 1;
		this.adjacentMatrix[NodeY][NodeX]= 1;
	}
	
	public void PrintMatrix()
	{
		for(int r=0 ; r<adjacentMatrix.length ; r++)
		{
			System.out.print(r + " : ");
			for(int q=0 ; q< adjacentMatrix.length ; q++)
			{
				
				System.out.print(adjacentMatrix[r][q] + " ");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		graphImplementation g = new graphImplementation(4);
		
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 3);
		g.addEdges(3, 0);
		
		g.PrintMatrix();
		
		// having 2 rows and 3 columns 
		
		System.out.println("getting 5 rows and 5 columns matrix");
		
		graphImplementation fiveSided = new graphImplementation(5);
		
		fiveSided.addEdges(0, 1);
		fiveSided.addEdges(1, 2);
		fiveSided.addEdges(2, 3);
		fiveSided.addEdges(3, 0);
		fiveSided.addEdges(1, 4);
		fiveSided.addEdges(4,2);
		
		fiveSided.PrintMatrix();
		
		
		
		

	}

}
