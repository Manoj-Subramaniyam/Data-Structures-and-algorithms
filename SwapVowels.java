package dsa.day1;

import org.junit.Test;

public class SwapVowels {
	
//	2. Given an input String s. Swap the vowels in the input
//	Input - "Hello Everyone! Welcome to Testleaf"
//	Output - "Halle evoryeno! Welcemo te TEstloef"
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to swap the vowels occurence 
	 * 
	 * What is the input(s) type? --> 
	 * What is the expected output? --> 
	 * Do I have constraints to solve the problem?  yes dont use set or map
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> 
	 *  Edge, -->{1}
	 *   Negative --> {3,3,3}
	 * Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? 
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations
	 * (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * Approach 2: Write down the options and benefits and code the best
	 * 
	 * 7) Start always with Psuedo code // Bruteforce
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */
	/*
	 * pseudo code1
	 * intialize the i and j
	 * initilize while till i and j are equal or cross over
	 * increament i till it reached the vowel letter
	 * decremeant the j till it reaches vowel letter
	 * once i and j are reached vowel replace both an then increament i and decreament j
	 * 
	 */
	
	@Test
	public void testdata1()
	{
		String input=  "Hello Everyone! Welcome to Testleaf";
		swapVowels(input);
	}
	@Test
	public void testdata2()
	{
		String input= "w";
		swapVowels(input);
	}
	@Test
	public void testdata3()
	{
		String input= "aeiou";
		swapVowels(input);
	}
	
	public String swapVowels(String input)
	{
		int i=0, j=input.length()-1;
		char temp;
		char[] charArray = input.toCharArray(); //o(n)
		while(i<j) //o(n)
		{
			if(vowelMatch(charArray[i])) i++;
			else if(vowelMatch(charArray[j])) j--;
			else
			{
				temp=charArray[i];
				charArray[i]=charArray[j];
				charArray[j]=temp;
				i++;
				j--;
				
			}
		}
		System.out.println(String.valueOf(charArray));
		return String.valueOf(charArray);
	}
	
	public boolean vowelMatch(char value)
	{
		value=Character.toLowerCase(value);
		if(value=='a'|| value=='e'|| value=='i'||value=='o'||value=='u' ) return false;
		return true;
	}
}

