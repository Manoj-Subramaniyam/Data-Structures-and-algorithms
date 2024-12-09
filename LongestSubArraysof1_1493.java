package dsa.day6;

import java.util.HashMap;

import org.junit.Test;

public class LongestSubArraysof1_1493 {


	/*
	 * while j< nums.length 
if (nums[j]==0 then temp ++;
while (temp>1)
 if(nums[i]==0) temp--;i++;
len=Math.max(len,j-i+1)
j++

	 */
	@Test
	public void testdata1()
	{
		int[] nums= {1,1,0,1};
		System.out.println(findLongestSubarrayAfterDelete(nums));

	}
	@Test
	public void testdata2()
	{
		int[] nums= {0,1,1,1,0,1,1,0,1};
		System.out.println(findLongestSubarrayAfterDelete(nums));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1,1,1};
		System.out.println(findLongestSubarrayAfterDelete(nums));

	}

	public int findLongestSubarrayAfterDelete(int[] nums)
	{
		int i=0,j=0,temp=0,len=0;

		while(j<nums.length)
		{
			if (nums[j]==0 ) temp ++;
			while (temp>1) {
				if(nums[i]==0)
					temp--;
				i++;
			}
			len=Math.max(len,j-i+1);
			j++;

		}
		if(temp==0) return nums.length-1;
		return len-1;

		//		
	}

}
