package dsa.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class UnCommonCharacters {

	/*
	 * Find and print the uncommon characters of the two given strings in sorted order. Here uncommon character means that either the character is present in one string or it is present in another string but not in both. The strings contain only lowercase characters and can contain duplicates. 
        Input: str1 = “characters”, str2 = “alphabets” 
        Output: b c l p r
        Input: str1 = “geeksforgeeks”, str2 = “geeksquiz” 
        Output: f i o q r u z

	 */

	/*
	 * Pseudo code
	 * initalize the map
iterate through the first String  and add it to the map with key as char and value as 1
Now iterate through the second satring and use get  the value and -1
else put the value as 2
now initilize another for loop and stor the keys on list whose value is greater than zero
return the list

	 * 
	 */

	@Test
	public void testData()
	{
		String str1= "characters";
		String str2="geeksquiz";
		System.out.println( findUncommonCharacters(str1,str2));
	}
	@Test
	public void testData1()
	{
		String str1= "a";
		String str2="aaa";
		System.out.println( findUncommonCharacters(str1,str2));
	}
	@Test
	public void testData2()
	{
		String str1= "charactlers";
		String str2="charactersxyz";
		System.out.println( findUncommonCharacters(str1,str2));
	}
	@Test
	public void testData3()
	{
		String str1= "characters";
		String str2="alphabets";
		System.out.println( findUncommonCharacters(str1,str2));
	}
	@Test
	public void testData4()
	{
		String str1= "geeksforgeeks";
		String str2="geeksquiz";
		System.out.println( findUncommonCharacters(str1,str2));
	}
	//TC: O(n+m)
	//SC: O(1)
	public ArrayList  findUncommonCharacters(String str1, String str2)
	{
		TreeMap<Character,Integer> input= new TreeMap<>();
		ArrayList<Character> arayList = new ArrayList<>();
		for (int i = 0; i < str1.length(); i++) 
		input.put(str1.charAt(i),1);
		for (int i = 0; i < str2.length(); i++) 
			if(input.containsKey(str2.charAt(i))) input.put(str2.charAt(i), -1);
			else input.put(str2.charAt(i), 2);
		for (Map.Entry<Character, Integer> temp :input.entrySet()) {
			if(temp.getValue()!=-1) arayList.add(temp.getKey());
		}
		return arayList;
	}
}
