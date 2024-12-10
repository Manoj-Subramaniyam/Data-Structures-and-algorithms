package dsa.day6;

import org.junit.Test;

public class MaximumsubArray {

	@Test
	public void testdata1()
	{
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(nums));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {1};
		System.out.println(maxSum(nums));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {5,4,-1,7,8};
		System.out.println(maxSum(nums));
	}
	// kadane algorithm- sub set of dynamic programming

	public static int maxSum(int[] nums){
		int maxSum=nums[0]; // least min value tahts possible
		int currSum=nums[0];
		for (int i=1; i<nums.length;i++){
			// if the running sum is greater than the value at index
			// --> better to expand the sub array (take running sum)
			// if the value at index is greater than the sub array sum so far
			// --> drop the sub array sum (consider value at index as new max)
			currSum= Math.max(currSum+nums[i], nums[i]);
			maxSum=Math.max(currSum, maxSum);
		}

		return maxSum;
	}
}
