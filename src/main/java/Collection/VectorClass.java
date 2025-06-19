
package Collection;


import java.util.Vector;

/**
 * Implements List , List extends Collection , Collection extends Iterable
 * @author Ahmed Mansour
 */
/**
 * 
 * A Vector in Java is a dynamic array (similar to ArrayList) that implements the List interface. Unlike ArrayList, 
 * Vector is synchronized (thread-safe), making it slower but safer for multi-threaded environments.
 * 
 */
public class VectorClass {
   private Vector<Integer> vector = new Vector<>(); 
   
   public void addElemente(int element)
   {
       this.vector.add(element);
   }
   public void addElementeByIndex(int index , int element)
   {
       this.vector.add(index , element);
       
   }
   
   public int getElementByIndex(int index)
   {
       return this.vector.get(index);
               
   }
   public int getFirstElement()
   {
       return this.vector.firstElement();
   }
   
   public int getLastElement()
   {
       return this.vector.lastElement();
   }
   
   // Remove
   public void removeByIndex(int index)
   {
       this.vector.remove(index);
   }
   public void removeByElement(int element)
   {
       this.vector.removeElement(element);
   }
   
   // search 
   public boolean search(int elem)
   {
       return this.vector.contains(elem);
   }
   
   public int searchReturnFirstIndex(int elem)
   {
       return this.vector.indexOf(elem);
   }
}
