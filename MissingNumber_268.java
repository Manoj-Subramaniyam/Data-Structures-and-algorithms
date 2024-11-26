package week2.day2;

import java.util.Arrays;

import org.junit.Test;

public class MissingNumber_268 {
	//Question
		//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


		/*
		 * 1) Did I understand the problem? -> If yes, go to next step !!
		 * 
		 * What is the input(s) type? 
		 * What is the expected output? 
		 * Do I have constraints to solve the problem? 
		 * Do I have all informations to go to next step!! 
//		 * How big is your test data set will be?
		 * 
		 * 2) Test data set
		 * 
		 * Minimum of 3 data set !! 
		 * Positive, Edge, Negative
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
		 * to find n --> find the length of array
		 * sort the array
		 * iterate through the array and find the missing number, based on i != value of array  on index then return the i
		 *  after all the iteration still no element is returned then return length of the array
		 *  
		 */
	@Test
	public void testdata1()
	{
		int[] n = {3,4,0,1};
		System.out.println(missingNumber(n));
	}
	@Test
	public void testdata2()
	{
		int[] n = {0,1};
		System.out.println(missingNumber(n));
	}
	@Test
	public void testdata3()
	{
		int[] n = {0};
		System.out.println(missingNumber(n));
	}
	public int missingNumber(int[] input)
	{
		int len =input.length;
		Arrays.sort(input);
		for (int i = 0; i < len; i++) if(i!=input[i]) return i;
		
		return len;
	}
	
}
