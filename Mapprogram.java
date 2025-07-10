package Collectionsprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap <Integer,String> ();
		m1.put(01, "Ramu");
		m1.put(02, "somu");
		m1.put(03, "Anu");
		m1.put(04, "meenu");
	Set<Integer>	     key   =   m1.keySet();
	for(int keys:key)
	{
		System.out.println(keys);
	}

	Collection<String> values = m1.values();
	for(String value:values)
	{
		System.out.println(value);
	}
	
	Set <Entry <Integer, String>> 	Entries =m1.entrySet();
	
	for(Entry <Integer, String> entry:Entries)
	{
	String s1=entry.getValue();
int s2=entry.getKey();
System.out.println(s1+">>>>>>"+s2);
	}
	}

}
