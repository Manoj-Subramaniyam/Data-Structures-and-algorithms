package dsa.day7;

import org.junit.Test;

public class SearchInsertPostion_35 {

	/*
	 * Binary search:
- initialise two pointers low=0, high=nums.length-1
- while (low<=high)
	- find the mid point
	- if (nums[mid]==target) return mid;
	- if <something> move left
		high=mid-1
	- if <something> move to right
		low=mid+1;
	 */
	@Test
	public void testdata1()
	{
		int[] nums= {1,3,5,6};
		int k=5 ;
		int output1=findInsertPosition(nums,k);
		System.out.println(output1);

	}
	@Test
	public void testdata2()
	{
		int[] nums= {1,3,5,6};
		int k=2;
		int output1=findInsertPosition(nums,k);
		System.out.println(output1);

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1,3,5,6};
		int k=7;
		int output1=findInsertPosition(nums,k);
		System.out.println(output1);

	}

	public int findInsertPosition(int[] nums, int k)
	{
		int low=0, high= nums.length-1,ans=nums.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			//if(nums[mid]==k) return mid;
			if(nums[mid]>= k) 
				{
				ans=mid;
				high=mid-1;
				}
			else {
				//ans=mid;
				low = mid+1;
			}
		}
		
		return ans;
	}
	
	
}
