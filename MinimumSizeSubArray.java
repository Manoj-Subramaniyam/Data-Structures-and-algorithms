package dsa.day6;

import org.junit.Test;

public class MinimumSizeSubArray {
	/**
	 * Pseudo code
	 *intialize variables p1, p2 =0, minlen=0
	 *sum=0
	 *while(p2<lengthof array)
	 *	sum+=array of p2
	 *	while(sum>=target)
	 *		minlen=Math.min(minlen,p2-p1+1)
	 *		sum-=array of p1
	 *		p1++;
	 * 	P2++;
	 */
	
	
	@Test
	public void testdata1()
	{
		int[] nums= {2,3,1,2,4,3};
		int k=7;
		System.out.println(minSubArray(nums,k));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {1,4,4};
		int k=1;
		System.out.println(minSubArray(nums,k));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1,1,1,1,1,1,1,1};
		int k=11;
		System.out.println(minSubArray(nums,k));

	}
	
	
	//approach 2 - Sliding window
	//TC:
	//SC:
	public int minSubArray(int[] nums, int target)
	{
		int p1=0,p2=0,minLen=Integer.MAX_VALUE, sum=0;
		while(p2<nums.length)
		{
			sum+=nums[p2];
			while(sum>=target)
			{
				minLen=Math.min(minLen,p2-p1+1);
				sum-=nums[p1];
				p1++;
			}
			p2++;
		}
		if(minLen==Integer.MAX_VALUE)return 0;
		return minLen;
	}
	
}
