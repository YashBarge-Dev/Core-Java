package problemsolving;
import java.util.Scanner;
import java.util.Stack;

class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read decimal number
        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        // Create Stack
        Stack<Integer> stack = new Stack<>();

        int n = num;

        // Convert Decimal to Binary
        while (n!=0) {

            int remainder = n%2;

            n = n/2;;

            stack.push(remainder);
        }

        // Display Binary Number
        System.out.print("Binary: ");

        while (stack.isEmpty()) {

            System.out.print(stack.pop());
        }

        sc.close();
    }
}
