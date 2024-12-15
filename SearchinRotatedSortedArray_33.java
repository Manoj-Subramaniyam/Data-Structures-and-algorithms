package dsa.day7;

import org.junit.Test;

public class SearchinRotatedSortedArray_33 {
/*
 * - initialise two pointers low=0, high=nums.length-1, ans-1

- while (low<=high):
	- find the mid point
	- if (nums[mid]==target) return mid;
	- check if the left part of the array (l-m) is sorted
		- check if the target is lying between the range
			- high=mid-1
		- else low=mid+1
	- check if the right portion is sorted
		- check if the target lies between the range
			- low= mid+1
		- else high=mid-1

   return -1
 */
	
	@Test
	public void testdata1()
	{
		int[] nums= {4,5,6,7,0,1,2};
		int k=0 ;
		int output1=findTargetElement(nums,k);
		System.out.println(output1);

	}
	@Test
	public void testdata2()
	{
		int[] nums= {4,5,6,7,0,1,2};
		int k=-1;
		int output1=findTargetElement(nums,k);
		System.out.println(output1);

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1};
		int k=-1;
		int output1=findTargetElement(nums,k);
		System.out.println(output1);
	}
	
	public int findTargetElement(int[] nums,int target)
	{
		int low=0, high=nums.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(nums[mid]== target) return mid;
			else if(nums[mid]>= nums[low])
			{
				if(nums[mid]>= target &&nums[low]<=target)
					high= mid-1;
				else low=mid+1;
			}
			else  if(nums[mid]<=nums[high])
			{
				if(nums[mid]<= target &&nums[high]>=target)
					low= mid+1;
				else high=mid-1;
			}
		}
		return -1;
	}
	
}
