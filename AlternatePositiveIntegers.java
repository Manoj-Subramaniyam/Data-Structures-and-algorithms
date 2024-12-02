package dsa.day4;

import java.util.Arrays;

import org.junit.Test;

public class AlternatePositiveIntegers {
	/*https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
	 *Given an unsorted array arr containing both positive and negative numbers.
Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.
	 *
 */


		/*
		 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,we need to return array which is having positive and negative number alternate
		 * 
		 * What is the input(s) type? -->int[]
		 * What is the expected output? --> int[]
		 * Do I have constraints to solve the problem?  no 
		 * Do I have all informations to go to next step!! 
//		 * How big is your test data set will be?
		 * 
		 * 2) Test data set
		 * 
		 * Minimum of 3 data set !! 
		 * Positive, -->arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
		 *  Edge, --> s1 = arr[] = [9, 4,  5, 0,-2]
		 *   Negative -->arr[] = [ -2, -1, -5, -3]
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
		 *initilize I=0,j=0,k=0
initilize the output array of length arr

initialize a while loop till k< length of input
if(i==arr.length)output[k]=arr[j];j++;
else if (j==arr.length)output[k]=arr[i];i++;
else
if(arr[i]>-1 && k%2==0) output[k]=arr[i];k++; i++;
else if(arr[i]<0) i++;
if(arr[j]<0 && k%2!=0) output[k]=arr[j];k++;j++;
else if(arr[j]<0) j++;

		 * 
		 */
		/*
		 * Pull all negative numbers towards left, 
		 * then at the end of the process you will see the pointer on the first postive number, 
		 * then have another pointer at index 1 and swap the element at the pointer and element at index and 
		 * increment index +=2 do it till the pointer reaches end
		 */


		@Test
		public void testdata1()
		{
			int[] arr= {9, 4, -2, -1, 5, 0, -5, -3, 2};
			System.out.println(alternateNumbers(arr));
		}
		@Test
		public void testdata2()
		{
			int[] arr= {9, 4,  5, 0,-2};
			System.out.println(alternateNumbers(arr));
		
		}
		@Test
		public void testdata3()
		{
			int[] arr= { -2, -1, -5, -3};
			System.out.println(alternateNumbers(arr));
		}
		
		//TC: O(n)
		//SC: O(n)
		public int[] alternateNumbers(int[] arr)
		{
			int i=0,j=0,k=0;
			int[] output = new int[arr.length];
			while(k<arr.length)
			{
				if(i==arr.length) {output[k]=arr[j];j++;k++;}
				else if (j==arr.length) {output[k]=arr[i];i++;k++;}
				else {
					if(arr[i]>-1 && k%2==0) {output[k]=arr[i];k++; i++;}
					else if(arr[i]<0) i++;
					else if(arr[j]<0 && k%2!=0) {output[k]=arr[j];k++;j++;}
					else if(arr[j]>-1) j++;
				}
			}
			System.out.println(Arrays.toString(output));
			return output;
		}
		
}
