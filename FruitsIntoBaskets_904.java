package dsa.day6;

import java.util.HashMap;

import org.junit.Test;

public class FruitsIntoBaskets_904 {


	/*
	 * initialize the two varaibles I and j, len 
initialize hashmap

while (j<nums.length)
map.put(nums[i], map.getOrDefault(nums[i],0)+1
while(map.size>2)


len = Math.max(len, map.size())
j++

	 */
	@Test
	public void testdata1()
	{
		int[] nums= {1,2,3,2,2};
		System.out.println(findFruitsintheBasket(nums));

	}
	@Test
	public void testdata2()
	{
		int[] nums= {0,1,2,2};
		System.out.println(findFruitsintheBasket(nums));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {1,2,1};
		System.out.println(findFruitsintheBasket(nums));

	}

	public int findFruitsintheBasket(int[] nums)
	{
		int i=0,j=0,len=0,temp=0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		while(j<nums.length)
		{
			map.put(nums[j], map.getOrDefault(nums[j],0)+1);
			while(map.size()>2)
			{
				map.put(nums[i], map.getOrDefault(nums[i],0)-1);
				if(map.get(nums[i])==0) map.remove(nums[i]);
				i++;

			}
			
			len = Math.max(len, j-i+1);
			j++;

		}
		return len;
	}

}
