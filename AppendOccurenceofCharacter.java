package dsa.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class AppendOccurenceofCharacter {
	/*
	 *given a string containing only alphabets, return a string with append occurrences of each character
 ex-1
 I/p:-aabbccddde 
 O/p:-a2b2c2d3e1
 ex-2
 I/p:"a";
 O/p:"a1";
 */


		/*
		 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,we need to return the string with number of occurence of each character
		 * 
		 * What is the input(s) type? --> two strings
		 * What is the expected output? --> boolean
		 * Do I have constraints to solve the problem?  no 
		 * Do I have all informations to go to next step!! 
//		 * How big is your test data set will be?
		 * 
		 * 2) Test data set
		 * 
		 * Minimum of 3 data set !! 
		 * Positive, --> s1 = “aabbccddde”
		 *  Edge, --> s1 = “AaBB” 
		 *   Negative --> s1 = “a” 
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
		 *initialize the map 
		 *initialize new string as output="";
		 *iterate through the string and add character as key and number of occurence as value 
		 *iterate through the map  ana appened the key and value on the same string
		 *return output 
		 * 
		 */
		


		@Test
		public void testdata1()
		{
			String s1= "aabbccddde";
			System.out.println(appendNoofOccurence(s1));
		}
		@Test
		public void testdata2()
		{
			String s1= "a";
			System.out.println(appendNoofOccurence(s1));
		
		}
		@Test
		public void testdata3()
		{
			String s1= "AaBB";
			System.out.println(appendNoofOccurence(s1));
		}
		
		//TC: O(n)
		//SC: O(1)
		public String appendNoofOccurence(String s1)
		{
			String output="";
			HashMap<Character,Integer> hashMap = new HashMap<>();
			for (int i = 0; i < s1.length(); i++) {
				hashMap.put(s1.toLowerCase().charAt(i),hashMap.getOrDefault(s1.toLowerCase().charAt(i), 0)+1);
			}
			for(Map.Entry<Character, Integer> temp: hashMap.entrySet())
			{
				output+=temp.getKey()+String.valueOf(temp.getValue());
			}
			return output;
		}
}
