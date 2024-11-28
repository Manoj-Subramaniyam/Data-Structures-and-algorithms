package dsa.day4;

import java.util.Arrays;

import org.junit.Test;

public class MaximumSum {
	/*
	 * Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.
Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.
	 */


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,we need to return the values of sum which less than k but the maximum sum in the array
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
	 * Positive, --> int[] nums={34,23,1,24,75,33,54,8}, k=60
	 *  Edge, --> int[] nums={30,30}, k=60
	 *   Negative --> int[] nums={70,80,90}, k=60
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
	 *sort the array and initialize the two variables i=0 and j=nums.length-1 and maxSum as Integer.MINVALUE
	 *
	 *initilize the while loop till i>j
	 *if(nums[i]+nums[j]<k)
	 * if(nums[i]+nums[j]>maxSum)
	 * 	maxSum=nums[i]+nums[j]
	 *  i++
	 * else if(nums[i]+nums[j]<maxSum) 
	 * 	j--;
	 *else j--
	 * 
	 */
	@Test
	public void testdata1()
	{
		int[] nums={34,23,1,24,75,33,54,8};
		int k=60;
		System.out.println(findMaximumSum(nums,k));
	}
	@Test
	public void testdata2()
	{
		int[] nums= {30,27,28,29,31};
		int k=60;
		System.out.println(findMaximumSum(nums,k));

	}
	@Test
	public void testdata3()
	{
		int[] nums= {70,80,90};
		int k=60;
		System.out.println(findMaximumSum(nums,k));

	}

	//TC: O(n)
	//SC: O9=(1)
	public int findMaximumSum(int[] nums,int k)
	{
		Arrays.sort(nums);//O(n)
		int i=0,j=nums.length-1,maxSum=-1;
		while(i<j) {//o(n)
			if(nums[i]+ nums[j]<k ) {
				if(nums[i]+nums[j]>maxSum)
					maxSum=nums[i]+nums[j];
				i++;
			}
			else j--;
		}
		return maxSum;
	}
}
