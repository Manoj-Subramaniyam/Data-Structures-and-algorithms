package dsa.day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class FindAllanagramsInaString_438 {
	/*
	 * initialize a for loop till the length of p
find the sum of lettter usin char atp - small a
store it on the sum variable


initialize variables I, j=0 temp=sum , initialize a list
initialize the while loop where j< s.length()
temp-=s.charAt(j)-a
if(temp<0)
if(temp==0) list.add(i); temp=sum;
j++

	 */
	@Test
	public void testdata1()
	{
		String s= "abca";
		String p="abc";
		System.out.println(findAllAnagrams(s,p));

	}
	@Test
	public void testdata2()
	{
		String s= "abab";
		String p="ab";
		System.out.println(findAllAnagrams(s,p));
	}
	@Test
	public void testdata3()
	{
		String s= "cbaebabacd";
		String p="abc";
		System.out.println(findAllAnagrams(s,p));

	}

	public List<Integer> findAllAnagrams(String s, String p)
	{
		  HashMap<Character, Integer> pMap = new HashMap<>();
	        HashMap<Character, Integer> sMap = new HashMap<>();
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0;i<p.length();i++){
	            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
	            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
	        }
	        if(sMap.equals(pMap)) list.add(0);
	        for (int i=p.length();i<s.length();i++){
	            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
	            char ch = s.charAt(i - p.length());
	            if (sMap.containsKey(ch)){
	                if(sMap.get(ch)>1)
	                    sMap.put(ch, sMap.getOrDefault(ch,0)-1);
	                else
	                    sMap.remove(ch);
	            }
	            if(sMap.equals(pMap))
	                list.add(i-p.length()+1);
	        }
	        return list;
//		int left=0,right=0;
//		List<Integer> list = new ArrayList<Integer>();
//		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
//		HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
//		for (int i = 0; i < p.length(); i++) {
//			map.put(s.charAt(i),map.getOrDefault(map.get(s.charAt(i)),0)+1);
//			
//		}
//		//System.out.println(map);
//		while(right< s.length())
//		{
//			map1.put(s.charAt(right),map1.getOrDefault(s.charAt(right),0)+1);
//			while( (right-left+1>p.length()))
//			{
//				map1.put(s.charAt(left),map1.getOrDefault(s.charAt(left),0)-1);
//				if(map1.get(s.charAt(left))==0) map1.remove(s.charAt(left));
//				left++;
//			}
//			if(map.equals(map1))
//				list.add(left);
//			right++;
//		}
	
	      
	

		//		int sum=0, left=0,right=0;
		//		for (int i = 0; i < p.length(); i++) {
		//			sum+=(p.charAt(i)-'a'+1);
		//		}
		//		int temp=0;
		//		List<Integer> list = new ArrayList<Integer>();
		//
		//		while(right< s.length())
		//		{
		//			temp+=(s.charAt(right)-'a'+1);
		//			while( (right-left+1>p.length()))
		//			{
		//				temp-=s.charAt(left)-'a'+1;
		//				left++;
		//			}
		//			if(temp==sum) 
		//			{
		//				list.add(left);
		//				//temp=sum;
		//			}
		//			right++;
		//		}
		//return list;
	}
}
