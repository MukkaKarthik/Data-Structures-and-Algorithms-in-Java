package DSA;

import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;

public class removingVowels {


	public String WordContainsVowels = "Bangalore";
	
	char[] convertIntoArrray = WordContainsVowels.toCharArray();
	
	public void displayCharacterArray()
	{
		for(int i=0 ; i< convertIntoArrray.length ; i++)
		{
			System.out.print(convertIntoArrray[i] + " ");
		}
	}
	
	
	
	
	public void removeVowels(char[] localArray)
	{

		ArrayList<Character> vowelList = new ArrayList<>();
		
		Set<Character> finalList = Set.of();
		
		
		
		for(char someLocal : localArray)
		{
			if(someLocal == 'a' || someLocal == 'e' || someLocal == 'i' || someLocal == 'o' || someLocal == 'u'  )
			{
	vowelList.add(someLocal);
				
			}
		}
		
		System.out.println("final vowel array= ");
	
		for(char printLocal : vowelList)
		{
			System.out.print(printLocal + " ");
		
		}
		
		//pushing obtained vowel array to set for removing duplicates 
		
		finalList.addAll(vowelList);
		
		System.out.println("After removing duplicates");
		for(char c : finalList)
		{
			System.out.print(c + " ");
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		removingVowels r = new removingVowels();
		
		r.displayCharacterArray();
		
		r.removeVowels(new char[] {'b','a','n','g','a','l','o','r','e','i','o'});
	}

}
