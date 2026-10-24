package problemsolving;
import java.util.Scanner;
import java.util.Stack;

public class WellFormedParenthesis {

	    public static boolean isWellFormed(String expr) {

	        Stack<Character> stack = new Stack<>();

	        for (int i = 0; i < expr.length(); i++) {

	            char ch = expr.charAt(i);

	            // Opening bracket
	            if (ch == '(' || ch == '{' || ch == '[') {

	                stack.push(ch);

	            }

	            // Closing bracket
	            else if (ch == ')' || ch == '}' || ch == ']') {

	                // No opening bracket available
	                if (stack.isEmpty()) {
	                    return false;
	                }

	                char top = stack.pop();

	                // Check matching brackets
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {

	                    return false;
	                }
	            }
	        }

	        // Check for unmatched opening brackets
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter expression: ");
	        String expr = sc.next();
	        boolean response = isWellFormed (expr);

	        if (response) {
	            System.out.println("Well-Formed Parentheses");
	        } else {
	            System.out.println("Not Well-Formed Parentheses");
	        }

	        sc.close();
	    }
	}

