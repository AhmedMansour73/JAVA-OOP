
package Collection;

/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
    
    public static void main(String[] args) {
        
        Arraylist arr =new Arraylist();
        
        arr.addToArray("Ahmed");
        arr.addToArray("Ail");
        arr.addToArray("Mohamed");
         arr.display();
        System.out.println(arr.getSize());
        arr.accessItemInArray(1);
        arr.removeToArray(0);
         arr.display();
        arr.addInPositionToArray(1,"Said");
         arr.display();
        arr.replaceItemInArray(1, "Moize");
        arr.display();
        
        System.out.println("----------************************--------------------\n\n");
        
        System.out.println("*\t\tSTACK\t\t*");
        StackClass stack =new StackClass();
        stack.addElement(20);
        stack.addElement(30);
        stack.addElement(20);
        stack.addElement(40);
        stack.addElement(50);
        System.out.println(stack.getElementByPeek());
        System.out.println(stack.getElementByPOP());
        System.out.println(stack.getElementByPeek());
        stack.isEmpty();
        stack.isExist(20);
        stack.display();
        
        
    }
    
}
