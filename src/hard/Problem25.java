package hard;

import java.util.regex.Pattern;

public class Problem25 {

	public static void main(String[] args) {
		
		System.out.println(checkMatch("ra.", "ray"));
		System.out.println(checkMatch("ra.", "raymond"));
		System.out.println(checkMatch(".*at", "chat"));
		System.out.println(checkMatch(".*at", "chats"));
		
	}
	
	public static boolean checkMatch(String pattern, String text) {
		return Pattern.matches(pattern, text);
	}

}
