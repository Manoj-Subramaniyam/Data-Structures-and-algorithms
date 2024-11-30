package dsa.day4;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class FindAnagram_1832 {
/*
 *Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different.

Input: s1 = “geeks” s2 = “kseeg”

Output: true

Explanation: Both the string have same characters with same frequency. So, they are anagrams.

Input: s1 = “allergy” s2 = “allergic”

Output: false

Explanation: Characters in both the strings are not same. s1 has extra character ‘y’ and s2 has extra characters ‘i’ and ‘c’, so they are not anagram
 */


	/*
	 * 1) Did I understand the problem? -> If yes, go to next step !! -->yes,we need to return boolean if the two strings are anagram
	 * 
	 * What is the input(s) type? --> two strings
	 * What is the expected output? --> boolean
	 * Do I have constraints to solve the problem?  no 
	 * Do I have all informations to go to next step!! 
//	 * How big is your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! 
	 * Positive, --> s1 = “geeks” s2 = “kseeg”
	 *  Edge, --> s1 = “geeks” s2 = “ksewe”
	 *   Negative --> s1 = “allergy” s2 = “allergic”
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
	 *- Initialise hashmap
- iterate the array and load entries
- before adding check if nums[i] is already there and i-map.get(nums[i])<=k
	- if yes return true
	- else return false
}
	 *
	 * 
	 */
	/*
	 * pseudo code2
	 *- Initialise hashmap

	 *
	 * 
	 */


	@Test
	public void testdata1()
	{
		String s1= "geeks";
		String s2="kseeg";
		System.out.println(findAnagram(s1,s2));
	}
	@Test
	public void testdata2()
	{
		String s1= "geeks";
		String s2="ksewe";
		System.out.println(findAnagram(s1,s2));
	
	}
	@Test
	public void testdata3()
	{
		String s1= "allergy";
		String s2="allergic";
		System.out.println(findAnagram(s1,s2));
	
	}
//	//TC--> O(nlogn)
//	//SC --> O(n)
//	public boolean findAnagram(String s1, String s2)
//	{
//		int i=0,j=0, temp=0;
//		char[] charArray1= s1.toCharArray();
//		char[] charArray2= s2.toCharArray();
//		Arrays.sort(charArray1);
//		Arrays.sort(charArray2);
//		if(charArray1.length!=charArray2.length) return false;
//		else
//		{
//			while(i<charArray1.length)
//			{
//				if(charArray1[i]==charArray2[j]) temp+=1;
//				else return false;
//				i++;
//				j++;
//			}
//		}
//		if(temp==s1.length()) return true;
//		return false;
//	}
	public boolean findAnagram(String s1, String s2)
	{
		int len = s1.length();
		int len2= s2.length();
		Map<Character,Integer> input= new TreeMap<Character,Integer>();
		if(len==len2)
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				input.put(s1.charAt(i), input.getOrDefault(s1.charAt(i), 0)+1);
				input.put(s2.charAt(i), input.getOrDefault(s2.charAt(i), 0)-1);
			}
			//System.out.println(input);
			for(Map.Entry<Character,Integer> m1:input.entrySet())
				if(m1.getValue()!=0) return false;
			return true;
		}
		return false;
	}
}
