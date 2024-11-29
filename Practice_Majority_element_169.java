package dsa.day4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Practice_Majority_element_169 {
	

	@Test
	public void testdata1()
	{
		int[] arr = {3,2,3};
		Practice_Majority_element_169 obj= new Practice_Majority_element_169();
		System.out.println(obj.findMajorityelement(arr));
	}
	@Test
	public void testdata2()
	{
		int[] arr = {2,2,1,1,1,2,2};
		Practice_Majority_element_169 obj= new Practice_Majority_element_169();
		System.out.println(obj.findMajorityelement(arr));
	}
	
	public int findMajorityelement(int[] input)
	{
		int nums= input.length,intresult=0;
		Map<Integer,Integer> result = new HashMap<Integer,Integer>();
		for (int i = 0; i < input.length; i++) {
			result.put(input[i], result.getOrDefault(input[i], 0)+1);
			if(result.get(input[i])> nums/2) intresult= input[i];
		}
		return intresult;
		}

}
