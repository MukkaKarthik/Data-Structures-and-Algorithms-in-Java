package DSA;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoSortedArrays {

//40,20,10,50
	
	public void SortFirstArray(int[] LocalArray1)
	{
		int temp = 20;
		
		ArrayList<Integer> f= new ArrayList<Integer>();
		
		for(int e =0 ; e<=LocalArray1.length-1 ; e++)
		{
	
			
			if(temp < LocalArray1[e])
			{
				System.out.println(LocalArray1[e]);

			}
			
			else if (temp == LocalArray1[e]) {
				f.add(temp);
				System.out.println(" " + temp + " is equal to " + LocalArray1[e]);
			}
			
			
		}
		
		this.PrintList(f);
		
		
	}
	
	
	public void PrintList(ArrayList<Integer> g)
	{

		System.out.println("Printing array list elements");
		
		for(int w : g)
		{
			System.out.print(w + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeTwoSortedArrays m = new mergeTwoSortedArrays();
		

int[] thisArray = {10,20,15,20,11};

m.SortFirstArray(thisArray);

		
	}

}
