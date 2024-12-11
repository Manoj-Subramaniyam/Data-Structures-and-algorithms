package dsa.day6;

import java.util.Iterator;

import org.junit.Test;

public class MaximumSubArrayosSizeK_GfG {
	/**
	 * Pseudo code
	 *
	 *
	 */
	@Test
	public void testdata1()
	{
		int[] nums= {100, 200, 300, 400};
		int k=2;
		System.out.println(maxSubArray_approach1(nums,k));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {100, 200, 300, 400};
		int k=4;
		System.out.println(maxSubArray_approach1(nums,k));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {100, 200, 300, 400};
		int k=1;
		System.out.println(maxSubArray_approach1(nums,k));

	}
	
	
	//approach 2 - Sliding window
	//TC:O(n)
	//SC:O(1)
	public int maxSubArray(int[] nums, int k)
	{
		int currSum=0, maxSum=0;
		for (int i = 0; i < k; i++) {
			currSum+=nums[i];
		}
		maxSum=currSum;
		for (int i = k; i < nums.length; i++) {
			currSum+=nums[i];
			currSum-=nums[i-k];
			maxSum=Math.max(maxSum,currSum); //
		}
		return maxSum;
	}
	
	//approach 1 - Sliding window
		//TC:O(n)
		//SC:O(1)
		public int maxSubArray_approach1(int[] nums, int k)
		{
			int currSum=0, maxSum=0;
			for (int i = 0; i < k; i++) {
				currSum+=nums[i];
			}
			maxSum=currSum;
			for (int i = 1; i < nums.length-k; i++) {
				currSum+=nums[i+k];
				currSum-=nums[i+k-1];
				maxSum=Math.max(maxSum,currSum); //
			}
			return maxSum;
		}
	
	
}
