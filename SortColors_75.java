package dsa.day3;

import java.util.Arrays;

import org.junit.Test;

public class SortColors_75 {
//	Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

//You must solve this problem without using the library's sort function.


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,
	 * 
	 * What is the input(s) type? --> 
	 * What is the expected output? --> 
	 * Do I have constraints to solve the problem?  yes dont use set or map
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> haystack = "sadbutsad", needle = "sad"
	 *  Edge, --> haystack = "a", needle = "a"
	 *   Negative --> haystack = "leetcode", needle = "leeto"
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
	 *left=0, right=nums.length-1, mid=0; (mid, fast pointer, left, right= slow pointer)

- if(nums[mid]==0){
// code
swap left, mid
increment both mid, left
}else if(nums[mid]==1){
//mid++
}
else{
// swap mid and right
// decremt right
}
	 *
	 * 
	 */


	@Test
	public void testdata1()
	{
		int[] nums= {2,0,2,1,1,0};
		System.out.println(sortColors(nums));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {2,0,1};
		System.out.println(sortColors(nums));
	
	}
	//@Test
	public void testdata3()
	{
		int[] nums= {2,0,1};
		System.out.println(sortColors(nums));
	
	}
	public int[] sortColors(int[] nums)
	{
		int left=0,right= nums.length-1, mid=0,temp=0;
		while(mid<=right) {
		if(nums[mid]==0)
		{
			// code
			temp=nums[left];
			nums[left]=nums[mid];
			nums[mid]=temp;
			mid++;left++;
			//swap left, mid
			//increment both mid, left

		}
		else if(nums[mid]==1) mid++;
		else
		{
			temp=nums[right];
			nums[right]=nums[mid];
			nums[mid]=temp;
			// swap mid and right
			// decremt right
			right--;

		}
	}
	System.out.println(Arrays.toString(nums));
	return nums;	
	}
}
