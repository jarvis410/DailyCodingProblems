package easy;

import java.util.Stack;

/**
 * check for balanced brackets in a given string
 * 
 * @author makad
 *
 */
public class Problem27 {

	/**
	 * test cases ([])[]({}) ([)] ((() True False False
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Stack<Character> stack;

		for (String string : args) {
			int len = string.length();
			stack = new Stack<Character>();
			int i = 0;

			while (i < len) {
				char current = string.charAt(i++);
				if (stack.empty()) {
					stack.push(current);
					continue;
				}
				char top = stack.peek();

				switch (current) {
				case ')':
					if (top == '(') {
						stack.pop();
					}
					break;
				case ']':
					if (top == '[') {
						stack.pop();
					}
					break;
				case '}':
					if (top == '{') {
						stack.pop();
					}
					break;
				default:
					stack.push(current);
				}
			}

			if (!stack.empty())
				System.out.println(string + ": False");
			else
				System.out.println(string + ": True");
		}

	}

}
