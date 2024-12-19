package dsa.day8;

import org.junit.Test;

public class FindPeakElement_162 {
	@Test
	public void testdata1()
	{
		int[] nums= {1,2,3,1};
		int output1=findPeakElement(nums);
		System.out.println(output1);
	}
	@Test
	public void testdata2()
	{
		int[] nums= {1,2,1,3,5,6,4};
		int output1=findPeakElement(nums);
		System.out.println(output1);

	}


	public int findPeakElement(int[] nums)
	{
		int n=nums.length;
		int low=1, high=n-2, mid=0;
		if(n==1) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[n-1]> nums[n-2]) return n-1;
		while(low<=high)
		{
			mid= (low+high)/2;
			if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
			if(nums[mid]< nums[mid+1])  low= mid+1;
			else  high = mid-1;
		}

		return mid;
	}
}
