package org.emp;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Map {
	public static void main(String[] args) {
		
	
		HashMap<Integer, String> m = new LinkedHashMap<Integer,String>();
		m.put(10,"java");
		m.put(20,"python");
		m.put(30,"ruby");
		m.put(40,"sql");
		m.put(50,"selenium");
		m.put(60,"c++");
		m.put(70,"c");
		m.put(80,"html");
		System.out.println(m);
		int s =m.size();
		System.out.println(s);
		String t =m.get(40);
		System.out.println(t);
		Set<Integer>e =m.keySet();
		System.out.println(e);
		Collection<String>c=m.values();
		System.out.println(c);
		
		System.out.println("Iterate the Entries:");
		for (Entry<Integer, String> entry :m.entrySet()) {
			System.out.println(entry);}
		
		System.out.println("\n Ierate only the Key:");
		for (Integer key  : m.keySet()) {
			System.out.println(key);}
			//System.out.println("key : " +key);}
		
		System.out.println("\nValues:");	
		for (String string : m.values()) {
			System.out.println(string);}
		
		System.out.println("\nIterate the both key and values:");
		for (HashMap.Entry<Integer,String>entry:m.entrySet()) {
			
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());}}}
		    
		
		
			
		
			
		
		
		
		
	


