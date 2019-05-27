package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * break the sentence using given words
 * 
 * @author makad
 *
 */
public class Problem22 {

	public static void main(String[] args) {

		String[] setOfWords = { "quick", "brown", "the", "fox" };
		String sentence = "thequickbrownfox";
		List<String> brokenSentence = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sentence.length(); i++) {
			sb.append(sentence.charAt(i));
			
			for (String word : setOfWords) {
				if(word.equals(sb.toString())) {
					brokenSentence.add(word);
					sb.delete(0, sb.length());
				}
			}
		}
		
		
		if (brokenSentence.size() == 0) {
			System.out.println("null");
		} else {
			System.out.println(brokenSentence);
		}
	}

}
