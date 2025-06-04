
package Collection;

/**
 *
 * @author Ahmed Mansour
 */
import java.util.ArrayList;

public class Arraylist {
    
   ArrayList<String> nameList = new ArrayList<>();
    
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
       this.nameList.get(index) ;
   }
    
     public void addInPositionToArray(int index , String name)
   { 
       this.nameList.add(index,name) ;
   }  
      
     public void replaceItemInArray(int index , String new_name )
   { 
       this.nameList.set(index,new_name) ;
   }
    
    public void display(String name)
   { 
       System.out.println(nameList);
   }
}
