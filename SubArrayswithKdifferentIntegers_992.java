package dsa.day7;

import java.util.HashMap;

import org.junit.Test;

public class SubArrayswithKdifferentIntegers_992 {

	/*
	 * 
	 */
	@Test
	public void testdata1()
	{
		int[] nums= {1,2,1,2,3};
		int k=2 ;
		int output1=findSubArrayswithKDiffInt(nums,k);
		int output2=findSubArrayswithKDiffInt(nums,k-1);
		System.out.println(output1-output2);
	}
	@Test
	public void testdata2()
	{
		int[] nums= {1,2,1,3,4};
		int k=3;
		int output1=findSubArrayswithKDiffInt(nums,k);
		int output2=findSubArrayswithKDiffInt(nums,k-1);
		System.out.println(output1-output2);

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1,2,1,3,4};
		int k=1;
		int output1=findSubArrayswithKDiffInt(nums,k);
		int output2=findSubArrayswithKDiffInt(nums,k-1);
		System.out.println(output1-output2);

	}

	public int findSubArrayswithKDiffInt(int[] nums, int k)
	{
		int i=0, j=0,output=0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		while(j<nums.length)
		{
			map.put(nums[j], map.getOrDefault(nums[j],0)+1);
			
			while(map.size()>k)
			{
				map.put(nums[i], map.getOrDefault(nums[i],0)-1);
				if(map.get(nums[i])==0) map.remove(nums[i]);
				i++;
			}
			if(map.size()<=k)
				output+=j-i+1;
			j++;
		}
		System.out.println(output);
		return output;
	}
	
}
