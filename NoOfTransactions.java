package dsa.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class NoOfTransactions {
	/*
	 * Pseudo code
	 * iterate the list
load the entries into tree map
get the entryset into an arraylist (hint: create arrayList object and pass entryset inside the constructor)
sort the array list using below lamda expression
entries.sort((i1, i2) -> i2.getValue().compareTo(i1.getValue()));
iterate the entry set 
and add the key value pair in the needed format <key>+" "+<value>

	 * 
	 */

	@Test
	public void testData()
	{
		List<String> asList = Arrays.asList("notebook","notebook", "mouse","keyboard", "mouse");
		
		noOfTransaction(asList);
	}
	//TC: O(nlogn)
	//SC: O(n+m) --> O(n)
	public void noOfTransaction(List<String> asList)
	{
		TreeMap<String, Integer> treeMap = new TreeMap<String,Integer>();
		for (int i = 0; i < asList.size(); i++) {
			treeMap.put(asList.get(i),treeMap.getOrDefault(asList.get(i), 0)+1);
		}
		System.out.println(treeMap);
		ArrayList<Entry<String, Integer>> arrayList = new ArrayList<>(treeMap.entrySet());//m

		arrayList.sort((i1, i2) -> i1.getValue().compareTo(i2.getValue())); //O(nlogn)
		
		//(i1, i2) temporary variable

		System.out.println(arrayList);
		for (Entry<String, Integer> entry : arrayList) {
			System.out.println( entry.getKey() +" "+entry.getValue());
		}
	}


}
