package dsa.day1;

import org.junit.Test;

public class TwoSum_167 {
	
//	Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//			Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//			The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//			Your solution must use only constant extra space.
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to print the number of distinct numbers
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
	 * initialize the while loop 
	 * if(ith and jth element sum is greater than target) then decreament j
	 * if(ith and jth element sum is less than target )then increament i
	 * if i and j are same or i >j then break
	 *  
	 * 
	 */
	
	@Test
	public void testdata1()
	{
		int[] input= {2,7,11,15};
		int target=9;
		int[]result=findTwoSum(input,target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	@Test
	public void testdata2()
	{
		int[] input= {2,3,4};
		int target=6;
		int[]result=findTwoSum(input,target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	@Test
	public void testdata3()
	{
		int[] input= {-1,0};
		int target=-1;
		int[]result=findTwoSum(input,target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public int[] findTwoSum(int[] numArray,int target)
	{
		int i=0,j=numArray.length-1;
		while(i!=j && i<j)
		{
			if(numArray[i]+numArray[j]==target) return new int[] {i+1,j+1};
			if(numArray[i]+numArray[j]>target) j--;
			if(numArray[i]+numArray[j]<target) i++;
		}
		 return new int[] {0,0};
	}
	
}
