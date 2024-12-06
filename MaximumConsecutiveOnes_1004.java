package dsa.day6;

import org.junit.Test;

public class MaximumConsecutiveOnes_1004 {
	/*
	 *
	 * initialize two pointer p1 and p2 and maxLen=MInteger.MIN_VALUE, temp=0, flag = true;
initialize a while loop till p2 is less than length of array
 ifP1==0 and temp<=k  and flag== true--> increment  temp, flag=false;
else if array of p2 is equal to 1 increament p2
else ifP2==0 and temp<=k --> incremant p2 and temp
else if (p2==0 and temp>k) --> reassign the p1 with index p2-1, temp=0;flag= true
maxLen=Math.max( p2-p1,maxLen)

	 */
	
	@Test
	public void testdata1()
	{
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		System.out.println(findMaximumConsecutiveOnes(nums, k));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		System.out.println(findMaximumConsecutiveOnes(nums, k));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {0,0,0,0};
		int k=4;
		System.out.println(findMaximumConsecutiveOnes(nums, k));

	}
	
	public int findMaximumConsecutiveOnes(int[] nums, int k)
	{
		int p1=0, p2=0,maxLen=Integer.MIN_VALUE, temp=0;;
		while(p2<nums.length)
		{
			if(nums[p2]==0) temp++;
			while(temp>k)
			{
				if(nums[p1]==0) temp--;
				 p1++;
			}
			if(temp<=k) maxLen= Math.max(maxLen,(p2-p1+1));
			p2++;
		}
		return maxLen;
	}
}
