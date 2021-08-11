package SDET_18;

import java.util.HashSet;

public class FindNumOfOccurences {

	public static void main(String[] args) {
		String s="tyss";
		//0123
		
		//step1: create set collection and add all char of string
		
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0 ; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		//set[t y s]
				//step2: compare each char of set with all char of given string
				
				for(Character ch:set)  //t y s
				{
					int count=0; //0 1 2
					for(int i=0; i<s.length(); i++)
					{
						if(ch==s.charAt(i)) {
						count++;	
						}
					}
					System.out.println(ch+" "+count);
				}
	}}
					
