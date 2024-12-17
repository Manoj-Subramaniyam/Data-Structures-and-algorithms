package dsa.day8;

import java.util.Arrays;

import org.junit.Test;

public class Convert1Dto2D_2022 {
	/*
	 * initialize two variables row, column as 0
initialize the 2D array of length m rows and n columns
if(m*n) is lessthan or greater than original.length return empty 2d array
initilize the for loop till it reaches m*n-1
insert the values on 2d array with rows and columns
increament column
if column == n --> increment row,reset the column to zero

	 */
	@Test
	public void testdata1()
	{
		int[] original= {1,2,3,4};
		int m=2;
		int n=2;
		System.out.println(Arrays.toString(converting1Dto2D(original,m,n)));
	}
	@Test
	public void testdata2()
	{
		int[] original= {1,2,3};
		int m=1;
		int n=3;
		System.out.println(Arrays.toString(converting1Dto2D(original,m,n)));
	}
	@Test
	public void testdata3()
	{
		int[] original= {1,2};
		int m=1;
		int n=1;
		System.out.println(Arrays.toString(converting1Dto2D(original,m,n)));
	}


	//approach 2 - Sliding window
	//TC:O(logn)
	//SC:
	public int[][] converting1Dto2D(int[] original, int m, int n)
	{
		int row=0, column=0;
		int[][] output = new int[m][n];
		if(m*n!=original.length) return new int[0][0];
		for (int i = 0; i < m*n; i++) {
			output[row][column]= original[i];
			
			column++;
			if(column==n)
			{
				row++;
				column=0;
			}
		}
		return output;
	}
}
