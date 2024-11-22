package dsa.day2;

import org.junit.Test;

public class IndexofFirstOccurenceofString_28 {

	//	Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
	//	or -1 if needle is not part of haystack.
	//


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to return teh first index of the string 
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
	 * Positive, --> haystack = "sadbutsad", needle = "sad"
	 *  Edge, --> haystack = "a", needle = "a"
	 *   Negative --> haystack = "leetcode", needle = "leeto"
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
	 *initialize two variables i, j,flag where i for haystack and j for needle
	 *initialize the while loop till i is equal to length of haystack
	 *check needle each char with haystack if yes increment both i, j,flag
	 *elseif  increament i and set j to 0, flag to 0
	 *if flag is equal to length of needle return i-flag
	 *
	 * 
	 */


	@Test
	public void testdata1()
	{
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(findIndex(haystack,needle));
	}
	@Test
	public void testdata2()
	{
		String haystack = "q";
		String needle = "q";
		System.out.println(findIndex(haystack,needle));
	
	}
	@Test
	public void testdata3()
	{
		String haystack = "leetcode";
		String needle = "leeto";
		System.out.println(findIndex(haystack,needle));
	
	}
	public int findIndex(String haystack ,String needle)
	{
		int i=0,j=0,flag=0,temp=0;
		while(i<haystack.length()) //o(N)
		{
			if(haystack.charAt(i)== needle.charAt(0)&& temp==0)
			{
				i++;
				j++;
				flag++;
				temp=i;
			}
			else if(haystack.charAt(i)== needle.charAt(j))
			{
				i++;
				j++;
				flag++;
			}
			else 
			{
				i++;
				j=0;
				flag=0;
				if(temp>0) { i=temp;temp=0;}
				
			}
			if(flag==needle.length())
			{
				return i-flag;
			}
		}
		return -1;
	}
}
