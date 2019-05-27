package medium;

/**
 * convert the given string to palindrome by inserting minimum number of characters
 * race -> ecarace
 * google -> elgoogle
 * @author makad
 *
 */
public class Problem34 {

	public static void main(String[] args) {
		
		String[] input = {"race", "google"};
		StringBuilder sb;
		
		for (String string : input) {
			int length = string.length();
			sb = new StringBuilder();
			
			int si; // start index
			int ei; // end index
			int dir; // to create lexicographically satisfied string
			
			// setting direction and indices
			if(string.charAt(0) > string.charAt(length-1)) {
				dir = -1;
				si = length - 1;
				ei = 0;
			} else {
				dir = 1;
				si = 0;
				ei = length - 1;
			}
			
			// creating new palindrome
			while (si*dir < ei*dir) {
				if(string.charAt(si) != string.charAt(ei)) {
					sb.append(string.charAt(si));
					si += dir;
				} else if(string.charAt(si) == string.charAt(ei)) {
					sb.append(string.charAt(si));
					si += dir;
					ei -= dir;
				}
			}
			
			// appending remaining characters if any
			if(dir == -1) {
				while (ei != length) {
					sb.append(string.charAt(ei));
					ei -= dir;
				}
			} else {
				while (si != length) {
					sb.append(string.charAt(si));
					si += dir;
				}
			}
			
			System.out.println(string + " -> " + sb);
		}
		
	}

}
