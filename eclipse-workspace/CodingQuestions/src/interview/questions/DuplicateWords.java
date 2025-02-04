package interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String sentence=sc.nextLine();	
		
		//duplicate words in a sentence
		String[] words=sentence.split(" ");
		
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		for(String word:words) {
			hmap.put(word, hmap.getOrDefault(word, 0)+1);
		}
		
		for(Map.Entry<String, Integer> mp:hmap.entrySet()) {
			if(mp.getValue()>1) {
				System.out.println(mp.getKey());
			}
		}
		
		//duplicate characters in a string
		String word=sc.nextLine();
		sc.close();
		char ch;
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		for(int i=0;i<word.length();i++) {
			ch=word.charAt(i);
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> it:mp.entrySet()) {
			if(it.getValue()>1) {
				System.out.println(it.getKey());
			}
		}
		
		
	}

}
