package dsa.day4;

import java.util.HashMap;

import org.junit.Test;

public class FindPivotIndex_724 {

	//Question
	/*
	 * Given an array of integers nums, calculate the pivot index of this array.

	The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

	If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

	Return the leftmost pivot index. If no such index exists, return -1.
	 */


	/*
	 * 1) 1) Did I understand the problem? -> If yes, go to next step !! -->yes,need to find the pivot index in an arrray and return the index 
	 * What is the input(s) type? --> int[] 
	 * What is the expected output? --> int
	 * Do I have constraints to solve the problem?  No
	 * Do I have all informations to go to next step!! 
//			 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, -->  nums ={2,3,2,5}
	 *  Edge, --> nums ={2,2}
	 *   Negative --> nums ={-1,1,0}
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
	 * intialize a temp variable
	 * initialize a loop stating from 0 to length 
	 * initialize a nested for loop starting from i+1
	 * get the sum of all the remaining element in teh array
	 *after the loop if the sum is equal to temp then return the index
	 *else add temp with array of index i
	 * at the last if no match return -1
	 */
	@Test
	public void testdata1()
	{

		int[] nums= {2,1,-1};
		System.out.println(findPivotIndex(nums));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {1,7,3,6,5,6};
		System.out.println(findPivotIndex(nums));
	}
	@Test
	public void testdata3()
	{
		int[] nums= {-1,1,2};
		System.out.println(findPivotIndex(nums));
	}
	//Approach 1
//	public int findPivotIndex(int[] nums)
//	{
//		int temp=0,sum=0;
//		for (int i = 0; i < nums.length; i++) {
//			sum=0;
//			for (int j = i+1; j < nums.length; j++) 
//				sum=sum+nums[j];
//			if(sum==temp) return i;
//			temp=temp+nums[i];
//		}
//		return -1;
//	}
	//Approach 2
	
	//pseudocode
	/*
	 * initialize a hashmap
	 * initialize teo variables leftsum , right sum 
	 * initialize the for loop and put the key as sum of left sum and value as sum of right sum
	 * if the key and value are same return the i 
	 */
	public int findPivotIndex(int[] nums)
	{
		// HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		 int[] leftSum= new int[nums.length];
		// int[] rightSum= new int[nums.length];
		 int sumofArray=0;
		 for (int i = 0; i < nums.length; i++) {
			sumofArray+=nums[i];
			leftSum[i]=sumofArray;
		}
		// map.put(leftSum, rightSum);
		for (int i = 0; i < nums.length; i++) {
			if(leftSum[i]==sumofArray) return i;
			sumofArray-=nums[i];
		}
		return -1;
	}
	
}


