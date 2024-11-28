package dsa.day3;

import java.util.Iterator;

import org.checkerframework.checker.units.qual.Length;
import org.junit.Test;

public class SumofDiagonal {

	/**
	 * Pseudo code
	 * initialize the variable result
	 * initialize the for loop for iterating through rows
	 * if it is first row or  lastrow add the first and last element to result
	 * if i and nums[0].length-1-i then result+element
	 *else result+=numsi,i +numsi, nums-length-i-1
	 *
	 */
	@Test
	public void testdata1()
	{
		int[][] nums= {{1,2},{4,5}};
		System.out.println(sumDiagonal(nums));
	}
	@Test
	public void testdata2()
	{
		int[][] nums= {{1,2,3,10,17},{4,5,6,11,18},{7,8,9,12,19},{13,14,15,16,20},{21,22,23,24,25}};
		System.out.println(sumDiagonal(nums));

	}
	@Test
	public void testdata3()
	{
		int[][] nums= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sumDiagonal(nums));

	}
	// approach 1
//	public int sumDiagonal(int[][] nums)
//	{
//		int result=0;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(i==0 || i==nums.length-1)
//				result+=nums[i][0]+nums[i][nums[0].length-1];
//			else if(i==nums[0].length-i-1)
//				result+=nums[i][nums[0].length-i-1];
//			else
//				result+=nums[i][i]+nums[i][nums[0].length-1-i];
//
//		}
//		return result;
//	}
	
	/*
	 * initialize the variable sum 
	 * initalize a for loop and sum the values on i,i array and store it on sum 
	 * initialize a len variable where it is array column length -1
	 * initialize another for loop
	 * ifi!=len --> sum the i,i array and store it on sum variable
	 * len--
	 */
	// approach 2
	
	public int sumDiagonal(int[][] nums)
	{
		int sum=0, len= nums[0].length-1;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i][i];
		}
		
		for(int i=0;i<nums.length;i++)
		{
			if(i!=len)
				sum+=nums[i][len];
			len--;
		}
		return sum;
	}
	
	
}
