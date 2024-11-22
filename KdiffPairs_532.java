package dsa.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class KdiffPairs_532 {
	//	Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

	//A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
	//
	//0 <= i, j < nums.length
	//i != j
	//|nums[i] - nums[j]| == k
	//Notice that |val| denotes the absolute value of val.


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to return number unique pairs of array that result differnce as k
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
	 * Positive, --> [3,1,4,1,5], k=2
	 *  Edge, --> [1,2], k = 1
	 *   Negative --> [1,3,1,5,4], k = 0
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
	 *initialize i,j,tamp, where i=0, j=i+1,tmp=0
	 *sort the array
	 *initialize while loop till j<nums array length
	 *get the values of array on index i and j and subtract
	 *if numsi- nums ofj is less than k --> j++
	 *if numsi- nums ofj is greater than k --> i++ if i==j then increament j
	 *if numsi- nums ofj is equal incremanet temp,i++,j++
	 * 
	 * return temp after while loop
	 */


	@Test
	public void testdata1()
	{
		int[] nums = {3,1,4,1,5};
		int k = 2;
		System.out.println(findNoofPairs(nums,k));
	}
	@Test
	public void testdata2()
	{
		int[] nums = {1,1,1,1};
		int k = 0;
		System.out.println(findNoofPairs(nums,k));

	}
	//@Test
	public void testdata3()
	{
		int[] nums = {1,3,1,5,4};
		int k = 0;
		System.out.println(findNoofPairs(nums,k));

	}
	//TC O(nlogn)
	//SC O(n)
	public int findNoofPairs(int[] nums,int k)
	{
		int i=0,j=1,temp=0,temp1=0,temp2=0;
		Arrays.sort(nums);
		while(j<nums.length)
		{
			if(nums[j]-nums[i]<k) j++;
			else if(nums[j]-nums[i]>k)
			{ 
				i++;
				if(i==j) j++;
			}
			else 
			{
				if(temp>0)
				{
					if(nums[i]==temp1 && nums[j]==temp2) 
					{
						i++;
						j++;
						continue;
					}
				}
				temp1=nums[i];
				temp2=nums[j];
				temp++;
				i++;
				j++;
			}
		}
		return temp;
	}
}
