package problemsolving;
import java.util.Scanner;
import java.util.Stack;
public class StackMenu 
{
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Create Stack
	        Stack<Integer> stack = new Stack<>();

	        int choice;
	        int value;

	        do {

	            System.out.println("\n===== STACK MENU =====");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Size");
	            System.out.println("6. Search");
	            System.out.println("7. Check Empty");
	            System.out.println("8. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    // Push
	                    System.out.print("Enter value: ");
	                    value = sc.nextInt();

	                    stack.push(value);

	                    System.out.println("Element inserted.");
	                    break;

	                case 2:
	                    // Pop
	                    if (!stack.isEmpty()) {

	                        System.out.println(
	                            "Deleted element: " + stack.pop());
	                  

	                    } else {

	                        System.out.println("Stack is Empty.");
	                    }

	                    break;

	                case 3:
	                    // Peek
	                    if (!stack.isEmpty()) {

	                        System.out.println(
	                            "Top element: " + stack.peek());
	                       

	                    } else {

	                        System.out.println("Stack is Empty.");
	                    }

	                    break;

	                case 4:
	                    // Display
	                    System.out.println(
	                        "Stack: " + stack);
	                   

	                    break;

	                case 5:
	                    // Size
	                    System.out.println(
	                        "Stack Size: " + stack.size());
	                    

	                    break;

	                case 6:
	                    // Search
	                    System.out.print("Enter value to search: ");
	                    value = sc.nextInt();

	                    int position = stack.search(value);

	                    if (position == -1) {

	                        System.out.println("Element not found.");

	                    } else {

	                        System.out.println(
	                            "Element found at position from TOP: "
	                            + position
	                        );
	                    }

	                    break;

	                case 7:
	                    // Check Empty
	                    if (stack.isEmpty()) {

	                        System.out.println("Stack is Empty.");

	                    } else {

	                        System.out.println("Stack is NOT Empty.");
	                    }

	                    break;

	                case 8:
	                    System.out.println("Program Ended.");
	                    break;

	                default:
	                    System.out.println("Invalid Choice.");
	            }

	        } while (choice!=8);

	        sc.close();
	    }
	    
}


	    


