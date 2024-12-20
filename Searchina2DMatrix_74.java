package dsa.day8;

import org.junit.Test;

public class Searchina2DMatrix_74 {
	
	/*
	 * 
	 */
	@Test
	public void testdata1()
	{
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=3;
		System.out.println(searchin2DMatrix(matrix,target));
	}
	@Test
	public void testdata2()
	{
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=13;
		System.out.println(searchin2DMatrix(matrix,target));
	}
	@Test
	public void testdata3()
	{
		int[][] matrix= {{1,3,3,7},{10,11,16,20},{23,30,34,60}};
		int target=3;
		System.out.println(searchin2DMatrix(matrix,target));
	}
	
	public boolean searchin2DMatrix(int[][] matrix, int target)
	{
		int columns=matrix[0].length;
		int rows=matrix.length;
		int low=0, high= (columns*rows)-1,mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(matrix[mid/columns][mid%columns]== target) return true;
			else if(matrix[mid/columns][mid%columns]>target) high= mid-1;
			else low=mid+1;
		}
		return false;
	}

}
