package dsa.day1;

import java.util.Arrays;

import org.junit.Test;

public class BasicProblem {

//	1. Write a program to find the number of distinct numbers in array.
//	{1,5,3,3,4,6,7,7,8}
//	o/p: 7
//
//	constraint: don't use any additional data structure:
	
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to print the number of distinct numbers
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
	 * Positive, --> {1,5,3,3,4,6,7,7,8}
	 *  Edge, -->{1}
	 *   Negative --> {3,3,3}
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
	 * sort the array
	 * intialize a variable temp, result
	 * initialize the for loop
	 * initilize another for loop 
	 *  
	 * 
	 */
	
	
	/*  Bruteforce
     * 1. Traverse through each element in the array
     * 2. Traverse through the remaining elements in the array
     * 3. Check if the number is present again
     *         a. print the number
     *         b. do not print if it not present
     * 
     */
	
	@Test
	public void testdata1()
	{
		int[] input= {1,5,3,3,4,6,7,7,8};
		findDistinctNumbers(input);
	}
	@Test
	public void testdata2()
	{
		int[] input= {1};
		findDistinctNumbers(input);
	}
	@Test
	public void testdata3()
	{
		int[] input= {1,3,3,3};
		findDistinctNumbers(input);
	}
	
	public int findDistinctNumbers(int[] numArray)
	{
		int temp,temp1,result=0;
		Arrays.sort(numArray);
		for (int i = 0; i < numArray.length; i++) {
			//temp1=numArray[i];
			temp=0;
			for (int j = i+1; j < numArray.length; j++) {
				if(numArray[i]==numArray[j])
				temp=1;
			}
			if(temp==0)
				result+=1;
		}
		System.out.println(result);
		return result;
	}
}
