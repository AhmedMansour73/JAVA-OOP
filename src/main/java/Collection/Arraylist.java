
package Collection;

/**
 * Implements List , List extends Collection , Collection extends Iterable
 * 
 * ArrayList is a dynamic array
 * Allows duplicate elements
 * 
 * 
 * Not synchronized (not thread-safe by default)
 * Allows random access via index
 * 
 * 
 * @author Ahmed Mansour
 */
import java.util.ArrayList;

public class Arraylist {
    
   private ArrayList<String> nameList = new ArrayList<>();
    
   public void addToArray(String name)
   { 
       this.nameList.add(name);
   }
   
   
   public int getSize()
   { 
       return this.nameList.size();
   }  
   
     public String accessItemInArray(int index)
   { 
      return this.nameList.get(index) ;
   }
    
      public void removeToArray(int index)
   { 
       this.nameList.remove(index) ;
   }
    
     public void addInPositionToArray(int index , String name)
   { 
       this.nameList.add(index,name) ;
   }  
      
     public void replaceItemInArray(int index , String new_name )
   { 
       this.nameList.set(index,new_name) ;
   }
    
    public void display()
   { 
       System.out.println(nameList);
   }
}

/**
 * Methods
 * 
 * arr.add(items) --> add in the end of array list
 * arr.get(index) --> select item by has index
 * arr.size() --> Current number of elements
 * arr.trimToSize();       // Trims capacity to current size
 * arr.remove(index) --> remove by index
 * arr.add(index , newValue) --> add in a position
 * arr.set(index , newvalue) --> replace item by has index
 * 
 * arr.addAll(Arrays.asList("Orange", "Mango")); // Adds multiple elements
 * 
 * arr.indexOf("Apple"); // Find index of element return integer
 * arr.contains("Mango"); // Check if element exists return boolean
 * 
 * arr.removeAll(Arrays.asList("Apple", "Banana")); // Remove multiple
 * arr.clear();           // Remove all elements
 * 
 * arr.isEmpty(); --> return boolean
 * 
 * 
 */
