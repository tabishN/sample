package SDET_18;

import java.util.LinkedHashSet;

public class FIndNumberOfOccurencesOfEachWord {

	public static void main(String[] args) {
		String s="welcome to tyss";
		String[] str=s.split(" ");
		
		//step1: create set collection and add all words of array
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0 ; i<str.length; i++) {
			set.add(str[i]);
		}
		System.out.println(set);
		//set[t y s]
				//step2: compare each word of set with all word of  given string array
				
				for(String word:set)  
				{
					int count=0; //0 1 2
					for(int i=0; i<str.length; i++)
					{
						if(word.equals(str[i])) {
						count++;	
						}
					}
					//print word and count
					System.out.println(word+" "+count);
				}

	}

}
