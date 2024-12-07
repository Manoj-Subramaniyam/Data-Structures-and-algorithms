package dsa.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class BinarySubArraysWithSum_930 {
	//	Given an integer array nums and an integer k, return true if there are two distinct indices i and j 
	//in the array such that nums[i] == nums[j] and abs(i - j) <= k.


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,we need to return true if the index between two identical values are less than k
	 * 
	 * What is the input(s) type? --> 
	 * What is the expected output? --> 
	 * Do I have constraints to solve the problem?  
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> 
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
	 * public boolean containsNearbyDuplicate(int[] nums, int k) {
7        // Initialize a HashMap to store the value and its most recent index
8        Map<Integer, Integer> indexMap = new HashMap<>();
9      
10        for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
11            // Use getOrDefault to find the last index of the current number.
12            // If it's not found, use a default value that is far away from any possible index.
13            int lastIndex = indexMap.getOrDefault(nums[currentIndex], -1000000);
14          
15            // Check if the current index and the last index of the same value are within k steps
16            if (currentIndex - lastIndex <= k) {
17                // If so, we found a nearby duplicate and return true.
18                return true;
19            }
20          
21            // Update the map with the current value and its index for the next iteration checks
22            indexMap.put(nums[currentIndex], currentIndex);
23        }
24      
25        // If no nearby duplicates are found, return false.
26        return false;
27    }
28}
	 */

	/*
	 * pseudo code1
	 *- Initialise hashmap
	 *initlise the int variable k
	 *insert the key as 0 on map with value as 0
	 * iterate the array and insert the prefix sum as key and value as index
	 * 
	 */



	@Test
	public void testdata3()
	{
		int[] nums= {0,0,0,0,0};
		int k=0;
		System.out.println(findNoofSubArrays(nums,k));

	}
	@Test
	public void testdata4()
	{
		int[] nums= {1,0,1,0,1};
		int k=2;
		System.out.println(findNoofSubArrays(nums,k));

	}

	public int findNoofSubArrays(int[] nums, int k)
	{
		int output=0,sum=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);//it will help to return true if element is zero or sum of elements is Zero
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			//if(map.containsKey(sum) && k==0) { output+=1;continue;}
			if(map.containsKey(sum-k))
				output+=map.get(sum-k); // fixed this
			map.put(sum, map.getOrDefault(sum,0)+1); // fixed this moved here after the if condition
		}
		System.out.println(map.keySet());
		return output;
		
		//		
	}
}

//int output=0,sum=0;
//HashMap<Integer,Integer> map = new HashMap<>();
//map.put(0, 1);//it will help to return true if element is zero or sum of elements is Zero
//for (int i = 0; i < nums.length; i++) {
//	sum+=nums[i];
//	//if(map.containsKey(sum) && k==0) { output+=1;continue;}
//	map.put(sum, 0);
//	if(map.containsKey(sum-k)) 
//		output+=1;
//}
//System.out.println(map.keySet());
//return output; 
