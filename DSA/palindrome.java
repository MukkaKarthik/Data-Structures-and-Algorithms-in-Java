package DSA;

public class palindrome {

	
	
	public String checkPalindrome(String givenWord)
	{
		char[] finalObtainedArray = givenWord.toCharArray();
		
		int start_presentCharacter = 0;
		int end_presentCharacter = finalObtainedArray.length-1;
		
		while(start_presentCharacter < end_presentCharacter)
		{
			if(finalObtainedArray[start_presentCharacter] != finalObtainedArray[end_presentCharacter])
			{
				//string is not a palindrome
				return "given string is not a palindrome";
				
			}
			
			start_presentCharacter++;
			end_presentCharacter--;
			
		}
		
		return "Given string is a plaindrome";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindrome p = new palindrome();
		
		System.out.println(p.checkPalindrome("madam"));
		
		System.out.println(p.checkPalindrome("daddy"));
		System.out.println(p.checkPalindrome("abccba"));
		

	}

}
