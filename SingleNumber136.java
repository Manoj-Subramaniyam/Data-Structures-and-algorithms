package dsa.day2;

import java.util.Arrays;

import org.junit.Test;

public class SingleNumber136 {
	//	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

	//You must implement a solution with a linear runtime complexity and use only constant extra space.

	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to return single element
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
	 * Positive, --> nums={1,3,1,4,3}
	 *  Edge, --> nums={2,2,1}
	 *   Negative --> nums={1}
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
	 *initialize two variables i, j,where i=0and j=1
	 *sort the array
	 *initialize while loop tilj less than nums.length -1
	 *if nums[i] and nums[j] is equal increament i+2 and j+2
	 *else return nums[i]
	 *return nums[i]
	 *
	 * 
	 */


	@Test
	public void testdata1()
	{
		int[] nums = {1,3,1,4,3};

		System.out.println(findSingleNumber(nums));
	}
	@Test
	public void testdata2()
	{
		int[] nums = {2,2,1};
		System.out.println(findSingleNumber(nums));

	}
	@Test
	public void testdata3()
	{
		int[] nums = {1};
		System.out.println(findSingleNumber(nums));

	}

	public int findSingleNumber(int[] nums)
	{
		Arrays.sort(nums);
		int i=0,j=1;
		while(j<nums.length)
		{
			if(nums[i]==nums[j])
			{
				i+=2;
				j+=2;
			}
			else return nums[i];
		}
		return nums[i];
	}
}
