// import java.util.Stack;
// public class stack {
//     public static void main(String[] args){
//         Stack<Integer>stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println(stack);
//         stack.pop();
//         System.out.println(stack);
//         }
// }
import java.util.Stack;
public class stack {
    public static void main(String args []){
        Stack <Integer> stack = new Stack <> ();
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //Pop elements
        System.out.println("Popped: " + stack.pop());
        //Peek element
        System.out.println("Top Element: " + stack.peek());
        //Last element
        System.out.println("Last Element: " + stack.getLast());
        //isEmpty
        System.out.println("Checking for empty stack: " + stack.isEmpty());
        //isFull
        System.out.println("Checking for full array: " + stack.getLast());
    }
}