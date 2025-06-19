
package Collection;

import java.util.Stack;

/**
 *  extends Vector , Vector Implements List , List extends Collection , Collection extends Iterable
 * @author Ahmed Mansour
 */
/**
 * A stack is a Last-In-First-Out (LIFO) data structure in Java that 
 * allows you to push (add) and pop (remove) elements from the top of the stack
 * is Synchronized
 */
public class StackClass {
    
    private Stack<Integer> stack = new Stack<>();
    
    // add to stack by method push
    public void addElement(int element)
    {
        this.stack.push(element);
    }
    
   
    //  Removes and returns the top element
    public int getElementByPOP()
    {
        return this.stack.pop();
    }
    
    // Returns (but does not remove) the top element
    public int getElementByPeek()
    {
        return this.stack.peek();
    }
    
    // Checks if the stack is empty
    public void isEmpty()
    {
        boolean isEmpty = stack.empty();
        System.out.println(isEmpty);
    }
    
    // search(Object o) - Finds the 1-based position of an element
    // Returns -1 if the element is not found.
    // The top element has position 1.
    
    public void isExist(int num)
    {
        int position = stack.search(num); 
        System.out.println(position);
    }
    
    public void display()
    {
        System.out.println(stack);
    }
    
}

