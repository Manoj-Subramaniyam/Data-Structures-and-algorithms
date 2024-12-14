package week3.day1;

import org.junit.Test;

public class ShuffleString_1528 {
	//Question
		//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

//Return the shuffled string.
		/*
		 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, input string of lowercase having same length as array of integers, need to shuffle string based on value of array  
		 * 
		 * What is the input(s) type? --> string and array of integers
		 * What is the expected output? --> String 
		 * Do I have constraints to solve the problem? 
		 * Do I have all informations to go to next step!! 
//		 * How big is your test data set will be?
		 * 
		 * 2) Test data set
		 * 
		 * Minimum of 3 data set !! 
		 * Positive, Edge, Negative
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
		 * pseudo code
		 * initialize a String array
		 * initialize the for loop and iterate through the integer array given on input
		 * get value of string at the ith character, and store it in ith position(value of the integer array ) at the new string array
		 * at the end convert array to string and return
		 * 
		 */
		@Test
		public void testdata1()
		{
			String s = "codeleet";
			int[] indices= {4,5,6,7,0,2,1,3};
			System.out.println(shuffleString(s,indices));
		}
		@Test
		public void testdata2()
		{
			String s = "t";
			int[] indices= {0};
			System.out.println(shuffleString(s,indices));
		}
		@Test
		public void testdata3()
		{
			String s = "leaf";
			int[] indices= {0,1,2,3};
			System.out.println(shuffleString(s,indices));
		}
		public String shuffleString(String input,int[] indices)
		{
			char[] s= new char[indices.length];
			for (int i = 0; i < indices.length; i++) 
				s[indices[i]]=input.charAt(i);
			return String.valueOf(s);
		}
		
}
