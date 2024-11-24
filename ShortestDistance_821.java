package dsa.day2;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistance_821 {
	//	Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

	//The distance between two indices i and j is abs(i - j), where abs is the absolute value function.


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to return shortest distance of the between the given character and given character on string
	 * 
	 * What is the input(s) type? --> 
	 * What is the expected output? --> 
	 * Do I have constraints to solve the problem? 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> s = "loveleetcode", c = "e"
	 *  Edge, --> s= "b", c = "b"
	 *   Negative -->  s="aaab", c = "b"
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
	 *init variable count=s.length();
- init int array of string size
- iterate the array from 0->n-1
	- if(str[i]=='e') count=0;
	output[i]=count++;

	count=s.length();
- iterate the array from n-1->0
	- if(str[i]=='e') count=0;
	output[i]=Math.min(count, output[i]);
	 *
	 */


	@Test
	public void testdata1()
	{
		String s ="loveleetcode";
		char c = 'e';
		System.out.println(findShortestDistanceChars(s,c));
	}
	@Test
	public void testdata2()
	{
		String s ="abaa";
		char c = 'b';
		System.out.println(findShortestDistanceChars(s,c));

	}
	@Test
	public void testdata3()
	{
		String s ="b";
		char c = 'b';
		System.out.println(findShortestDistanceChars(s,c));

	}

	public int[] findShortestDistanceChars(String s, char c)
	{

		int count=s.length();
		int[] result=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
				count=0;
			result[i]=count;
			count++;

		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==c)
				count=0;
			result[i]=Math.min(result[i], count);
			count++;
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
