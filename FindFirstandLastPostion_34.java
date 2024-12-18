package dsa.day8;

import java.util.Arrays;

import org.junit.Test;

public class FindFirstandLastPostion_34 {

	/*
	 * psudo code	
initialize the variable low, high, mid , first and last as -1	
initialize the while loop till the low crosses high	
mid=(low+high)/2	
if(nums[mid]==target -->	 if(nums[low]==target) --> first= low -->else low=low+1
	 if(nums[high]==target) --> last= high --> else low=high-1
if(nums[mid]<target) low= mid+1	
if(nums[mid]>target) high= mid-1	

return new int[]{first,last};	

	 */
	@Test
	public void testdata1()
	{
		int[] nums= {5,7,7,8,8,10};
		int k=8;
		int first=findIndexofFirst(nums,k);
		int last=findIndexofLast(nums,k);
		System.out.println(first+" "+ last);
	}
	@Test
	public void testdata2()
	{
		int[] nums= {0,0,1,1,1,2,4,4,4,4,5,5,5,6,8,8,9,9,10,10,10};
		int k=8;
		int first=findIndexofFirst(nums,k);
		int last=findIndexofLast(nums,k);
		System.out.println(first+" "+ last);
	}
	@Test
	public void testdata3()
	{
		int[] nums= {};
		int k=0;
		int first=findIndexofFirst(nums,k);
		int last=findIndexofLast(nums,k);
		System.out.println(first+" "+ last);
	}


	//approach 2 - Sliding window
	//TC:O(logn)
	//SC:
	public int findIndexofFirst(int[] nums, int target)
	{
		int low=0, high= nums.length-1, first=-1, mid=0;
		while(low<=high) {
			mid=(low+high)/2;	
			if(nums[mid]==target){
				first=mid;
				high=mid-1;
			}
			else if(nums[mid]<target) low= mid+1	;
			else if(nums[mid]>target) high= mid-1;
		}
		return first;
	}
	
	public int findIndexofLast(int[] nums, int target)
	{
		int low=0, high= nums.length-1, last=-1, mid=0;
		while(low<=high) {
			mid=(low+high)/2;	
			if(nums[mid]==target){
				last=mid;
				low=mid+1;
			}
			else if(nums[mid]<=target) low= mid+1	;
			else if(nums[mid]>=target) high= mid-1;
		}
		return last;
	}

}
