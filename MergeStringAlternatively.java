package week3.day1;

import org.junit.Test;

public class MergeStringAlternatively {
	//Question
	//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

//Return the merged string.
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,two lowercase strings are given, need to merget them alternatively
	 * 
	 * What is the input(s) type? --> Teo Strings
	 * What is the expected output? --> merged string
	 * Do I have constraints to solve the problem?  No
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> word1="abcd", word2="efgh"
	 *  Edge, -->word1="a", word2 ="bcdef" or word1="yours" word2="op"
	 *   Negative --> 
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
	 * pseudo code
	 * 
	 * initialize an empty new string
	 * find the minimum lenth of two strings
	 * iterate till the last index with minimum length 
	 * append the new string with word1 of i and word2of i
	 * after the loop use substring to merge the remaining characters on the maximum length string to new string
	 * return the new string
	 */
	@Test
	public void testdata1()
	{
		
		String word1="abcd";
		String word2="efgh";
		System.out.println(mergeString(word1,word2));
	}
	@Test
	public void testdata2()
	{
		String word1="a";
		String word2="bcdef";
		System.out.println(mergeString(word1,word2));
	}
	@Test
	public void testdata3()
	{
		String word1="yours";
		String word2="op";
		System.out.println(mergeString(word1,word2));
	}
	public String mergeString(String word1,String word2)
	{
		String result="";
		int len=word1.length(),len1=word2.length(),minLength;
		if(len<len1) minLength=len;
		else minLength=len1;
		for (int i = 0; i < minLength; i++) {
			result+=word1.charAt(i);
			result+=word2.charAt(i);
		}
		if(len==len1) return result;
		else if(len==minLength) return result+=word2.substring(minLength,len1);
		return result+=word1.substring(minLength,len);
		
	}
}
