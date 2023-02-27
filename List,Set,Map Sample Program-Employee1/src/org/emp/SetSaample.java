package org.emp;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetSaample {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(2);
		s.add(3);
		s.add(5);
		s.add(8);
		s.add(50);
		s.add(60);
		int size =s.size();
		System.out.println(size);
		boolean b =s.contains(2);
		
		System.out.println(b);
	    for (Integer x: s) {
		    System.out.println(x);}
		
			
			
		}
			
		}
		
	


