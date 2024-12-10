package dsa.day6;

import java.util.HashMap;

import org.junit.Test;

public class LongestSubStringWithoutRepeatingChars_3 {

	@Test
	public void testdata1()
	{
		String s= "abcabcbb";
		System.out.println(longestSubString(s));
	}
	@Test
	public void testdata2()
	{
		String s= "bbbbb";
		System.out.println(longestSubString(s));

	}
	@Test
	public void testdata3()
	{
		String s= "pwwkew";
		System.out.println(longestSubString(s));

	}

	public static int longestSubString(String s)
	{
		// p1-slow
		// p2-fast
		int p1=0 , p2=0, maxLen=Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		while (p2<s.length()){
			// load the occurrence of every char in the map
			// {a:1, b:1, c:1}
			map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2),0)+1);
			while (map.get(s.charAt(p2))>1){
				// kept reducing the occurrences of char at left
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1),0)-1);
				p1++;
			}
			maxLen = Math.max(maxLen, p2 - p1 + 1);
			p2++;
		}
	    return maxLen;


	}
}
