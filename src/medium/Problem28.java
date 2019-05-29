package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * justify text
 *
 * @author makad
 *
 */
public class Problem28 {

	public static void main(String[] args) {

		// inputs
		String[] wordList = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
		int lineLength = 16;

		StringBuilder sb = new StringBuilder();

		int usedSpace = 0;
		int spaces = 0;
		int noOfWordsInLine = 0;
		List<Integer> wordCount = new ArrayList<>();
		boolean startWord = true;


		for (int i = 0; i < wordList.length; i++) {
            String word = wordList[i];
//			System.out.println("::" + word);

			if (startWord) {
//				sb.append(word);
				noOfWordsInLine++;
				usedSpace += word.length();
				startWord = false;
			} else {
				if (word.length() + usedSpace + 1 <= lineLength) {
//					sb.append(word);
					noOfWordsInLine++;
					spaces++;
					usedSpace += word.length() + 1;
				} else {
					spaces = lineLength - usedSpace;
                    System.out.println(usedSpace);
					usedSpace = 0;
					--i;

					startWord = true;
				}
			}

			if (startWord || ((i + 1) == wordList.length)) {
				wordCount.add(noOfWordsInLine);
				noOfWordsInLine = 0;
			}
//			System.out.println(wordCount);

		}
		System.out.println(wordCount);
	}

	public void justifyText(List wordCount) {

    }

}
