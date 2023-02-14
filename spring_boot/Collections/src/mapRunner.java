import java.util.HashMap;
import java.util.Map;

public class mapRunner {
	
	//Exercise to count the number of times of a letter on a phrase

	public static void main(String[] args) {
		String str = "This is and awesone ocassion "
				+ "this has never happened before";
		
		Map<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		for(char character:characters) { 
			//Get the character
			//if it is here, we increment the count
			// if it´s not there inicialice to one
			Integer integer = occurances.get(character);
			if(integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}

		}
		
		// same exercice but with words
		// to count works
		Map<String, Integer> StringOccurances = new HashMap<>();
		String[] words = str.split(" "); //split with space
		

		for(String word:words) { 
			Integer integer = StringOccurances.get(word);
			if(integer == null) {
				StringOccurances.put(word, 1);
			} else {
				StringOccurances.put(word, integer + 1);
			}

		}
		
		
	System.out.println(occurances);
	System.out.println(StringOccurances);

	}

}
