package dsa.day4;

import java.util.Arrays;

import org.junit.Test;

public class RotateArray_189 {
	/*
	 *Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
	 *
	 */


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes we need to rotate the array to k postions and return the array
	 * 
	 * What is the input(s) type? -->int[]
	 * What is the expected output? --> int[]
	 * Do I have constraints to solve the problem?  no 
	 * Do I have all informations to go to next step!! 
//		 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, -->arr[] = [1,2,3,4,5,6,7] k=3;
	 *  Edge, -->  arr[] = [-1,-100,3,99] k=0;
	 *   Negative -->arr[] = [ -1,-100,3,99] k=4;
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
	 * int k=0;
	 *initialize the new array output with ength nums 
	 *initialize the for loop whe i=nums.length-k-1 and i< nums.length-1;i++
	 *output[k]=nums[i];
	 *k++;
	 *initialize the for loop where i=0 and i< nums.length-k-1;i++
		 output[k]=nums[i];
	 *k++;
	 * return output
	 */

	/*
	 * pseudo code2
	 * initialize temp variable
	 * intialize nested for loop
	 * swap the values on inner for loop
	 * temp=nums[j-1];
			nums[j-1]=nums[j];
				nums[j]=temp;
		return temp
	 */

	/*Pseudo code 3
	 * ake % of k value 
2 . Reverse the entire array using opp directional two pointers 
3. now reverse elements between 0 to k-1 
4. now reverse elements between k to n-1 

	 */
	@Test
	public void testdata1()
	{
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(rotateArray(nums,k));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {-1,-100,3,99};
		int k=0;
		System.out.println(rotateArray(nums,k));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {-1,-100,3,99};
		int k=4;
		System.out.println(rotateArray(nums,k));
	}
	
	public int[] reverse(int[] nums, int i, int j)
	{
		int temp;
		while(i<=j)
		{
			temp=nums[i];
			nums[i]= nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
		return nums;
	}
	
	
	public int[] rotateArray(int[] nums,int k)
	{
		k=k%nums.length;
		reverse(nums, 0,nums.length-1);
		reverse(nums, 0,k-1);
		reverse(nums, k, nums.length-1);
		//code 1
//		int l=0;
//		int[] output= new int[nums.length];
//		for (int i =nums.length-k; i < nums.length&& i>-1; i++) {
//			output[l]=nums[i];
//			l++;
//		}
//		for (int i =0; i < nums.length-k; i++) {
//			output[l]=nums[i];
//			l++;
//		}
//		System.out.println(Arrays.toString(output));
//		return output;
		
		
		//code 2
//		int temp;
//		for (int i = 0; i < k; i++) {
//			temp=0;
//			for (int j = nums.length-1; j >0; j--) {
//				temp=nums[j-1];
//				nums[j-1]=nums[j];
//				nums[j]=temp;
//			}
//			
//		}
//		System.out.println(Arrays.toString(nums));
		
		// code 3
		
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
