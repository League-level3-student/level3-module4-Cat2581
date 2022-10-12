package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
    	Random rand = new Random();
    	Stack<Double> numbers = new Stack<Double>();
    	numbers.add(null);
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
    	for (int i = 0; i < args.length; i++) {
		}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
    	
        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.
    	System.out.println();

        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
System.out.println("Here is a Stack of Strings: \n");

Stack<String> flavors = new Stack<String>();
flavors.push("Strawberry");
flavors.push("Mint");
flavors.push("Chocolate");
flavors.push("Apple");
flavors.push("Vanilla");
flavors.push("Mango");
flavors.push("Cookies and Cream");

/*
 * Since Mango was the last one pushed, it will be the first one popped.
 * The pop() method reduces the size of the Stack by 1
 */
System.out.println("Stack size: " + flavors.size());
System.out.println("Popping 2 elements off the top of the stack:");

String topOfStack = flavors.pop();
System.out.println(topOfStack);
System.out.println(flavors.pop());
System.out.println();
System.out.println();
System.out.println();

/*
 * Getting the size of the Stack
 * Notice the size is smaller by 2 after two pop() methods are called 
 *  * regardless of whether the return value of the pop() was saved into
 * a variable.
 * 
 */
System.out.println("Stack size: " + flavors.size());

/*
 * Looping through the Stack and clearing it
 */
System.out.println("\nPopping all the Strings off the Stack:");
while( ! flavors.isEmpty() ) {
    System.out.println(flavors.pop());
}

System.out.println("Stack size: " + flavors.size());










