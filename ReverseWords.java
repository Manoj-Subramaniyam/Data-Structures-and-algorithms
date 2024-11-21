package dsa.day1;

import org.junit.Test;

public class ReverseWords {
	
//Write a program to reverse each word in a String
//	Input: Welcome To Testleaf
//	Output: emocleW oT fealtesT
	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes, we need to swap the reverse the words and then swap
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
	 * initialize an char array and conver the input to char array
	 * reverse the entire sentence in a loop using two pointer with i at start and j at the end
	 * initialize another while using teo pointer with i at start and j at the end
	 * return the final string
	 */
	@Test
	public void testdata1()
	{
		String input=  "Welcome To Testleaf";
		swapWords(input);
	}
	@Test
	public void testdata2()
	{
		String input= "a";
		swapWords(input);
	}
	@Test
	public void testdata3()
	{
		String input= "dca 1  ";
		swapWords(input);
	}
	
	public String swapWords(String input)
	{
		char[] chars= input.toCharArray();//o(n)
		int i=0,j=chars.length-1;
		char temp;
		while(i<j)//o(n)
		{
			temp=chars[i];
			chars[i]=chars[j];
			chars[j]=temp;
			i++;
			j--;
		}
		String value = String.valueOf(chars);//o(n)
		String[]result= value.split(" ");//o(n)
		String temp1;
		i=0;j=result.length-1;
		while(i<j)//o(n)
		{
			temp1=result[i];
			result[i]=result[j];
			result[j]=temp1;
			i++;
			j--;
		}
		//System.out.println(String.join(" ",result));
		return String.join(" ",result);//o(n)
	}
	
}
