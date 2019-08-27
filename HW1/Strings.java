import java.util.ArrayList;

public class Strings {
	
	public static String uniqueLetters(String str) {
		String[] wordSplitting = str.split(""); //Empty string with split method

		ArrayList<String> uniqueLetters = new ArrayList<>();  //ArrayList to store unique letters

		int iterable = 0; // variable is used to keep track of how often a letter appears in the string

		for (int i = 0; i < wordSplitting.length; i++) {

			for (int j = 0; j < wordSplitting.length; j++) {
				
				if (iterable >= 0)
				{
				if (wordSplitting[i].equals(wordSplitting[j])) {
					iterable++;
				}
				}
			}
if (iterable > 0)
{
			if (iterable == 1) { 
				uniqueLetters.add(wordSplitting[i]);
			}
			
}

			iterable = 0; // The variable is reset for the next letter
		}

		String letters = "";

		for (int i = 0; i < uniqueLetters.size(); i++) {
			
			if (uniqueLetters.size() > 0)
			letters = letters + uniqueLetters.get(i);
		}

		return letters;
	}

}
