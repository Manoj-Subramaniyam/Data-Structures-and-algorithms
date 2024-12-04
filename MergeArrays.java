package assesment;

import java.util.Arrays;

import org.junit.Test;

public class MergeArrays {
	/*Pseudo code
	 * initialize the variablep1,p2 and k with the values as m-1, n-1 and nums1 length -1 
	 * initialize the while loop having the conditionas p1>-1 and p2>-1
	 * 	if the nums2 of p2 th index is greater than nums1 of p1th index --> then assign the nums of kth index with nums 2 of p2th index  decreament both k and p2
	 * 	else  --> assign nums 1 of k th index with nums1 of p1th index, decrement k and p1
	 * 
	 * after while loop use another while loop to add the remaining element in the nums 2
	 * 		assign nums 1 of k th index with nums2 of p2th index, decrement k and p2
	 *return nums1
	 */

	@Test
	public void testdata1()
	{
		int[] nums1 = {1,2,3,0,0,0};
		int m=3;
		int[] nums2 = {2,5,6};
		int n=3;
		System.out.println(mergeArrays(nums1,m,nums2, n));
	}
	@Test
	public void testdata2()
	{
		int[] nums1 = {0};
		int m=0;
		int[] nums2 = {1};
		int n=1;
		System.out.println(mergeArrays(nums1,m,nums2, n));
	}
	@Test
	public void testdata3()
	{
		int[] nums1 = {1};
		int m=1;
		int[] nums2 = {0};
		int n=0;
		System.out.println(mergeArrays(nums1,m,nums2, n));
	}
	//TC:O(n)
	//SC: O(1)
	public int[] mergeArrays(int[] nums1, int m, int[] nums2, int n)
	{
		int p1=m-1, p2=n-1,k = nums1.length-1;
		while(p1>=0 && p2>=0)
		{
			if(nums2[p2]>nums1[p1])
			{
				nums1[k]= nums2[p2];
				k--;
				p2--;
			}
			else 
			{
				nums1[k]=nums1[p1];
				k--; 
				p1--;
			}
		}
		
		while(p2>=0)
		{
			nums1[k]=nums2[p2];
			k--;
			p2--;
		}
		System.out.println(Arrays.toString(nums1));
	return nums1;
	}
}
