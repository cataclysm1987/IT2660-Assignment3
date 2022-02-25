import java.io.IOException;

public class Assignment3 {

    public static void main(final String[] args) throws IOException {
        System.out.println("Hello world - this is assignment 3 in Java!");
        System.out.println("Let's create a generic stack and add 3 items with a maximum of 3.");
        GenericStack<Thing> stack = new GenericStack<Thing>(3);
        for (int i = 1; i <= 3; i++){
            stack.push(new Thing(i, "Thing"));
        }
        
        stack.showAll();
        System.out.println("Size: " + stack.getSize());
        System.out.println("Top: " + stack.getTop());
        System.out.println("Now let's try to add more and utilize the push operation past its overflow limit.");
        for (int i = 4; i <= 6; i++){
            stack.push(new Thing(i, "Thing"));
        }
        stack.showAll();
        System.out.println("Size: " + stack.getSize());
        System.out.println("Top: " + stack.getTop());
        System.out.println("Exiting program. Have a nice day!");
    }


}