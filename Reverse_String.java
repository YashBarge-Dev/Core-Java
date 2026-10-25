package practice_assignment;

import java.util.Scanner;
import java.util.Stack;

class Reverse_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read word
        System.out.print("Enter a word: ");
        String word = sc.next();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push each character into Stack
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);      // charAt denotes each value per index 

            stack.push(ch);
        }
        
        

        // Pop characters and print reversed word
        System.out.print("Reversed word: ");

        while (!stack.isEmpty()) {

            System.out.print(stack.pop());
        }
        
        sc.close();
    }
}

