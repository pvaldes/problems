package net.morphism.training;

import java.util.Hashtable;

public class ReverseWords {
	
	public static String solution(final String inputString) {
	
		inputString = inputString.trim();
		String[] words = inputString.split(" ");

		int numberOfWords = words.length;
		
		Hashtable<Integer,String> H = new Hashtable<Integer,String>();
		int pivot = numberOfWords -1;
		int key = 0;

        	// Add non-empty words in inverse order to Hashtable H from String[] words.
		while(pivot>=0 && key < numberOfWords) {
			if(!words[pivot].isEmpty()) {
				H.put(key, words[pivot]);
				key++; pivot--;
			}
			else {
				pivot--;
			}
		}
		
		// Append elements of Hashtable H to StringBuffer buffer, separated with a space.
		StringBuffer buffer = new StringBuffer();
		for (int i=0; i< H.size(); i++) {
			buffer.append(H.get(i));
			buffer.append(" ");
		}
		return buffer.toString().trim();
	}
}
