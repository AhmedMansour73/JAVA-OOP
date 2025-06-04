
package Constructor;

/**
 *
 * @author Ahmed Mansour
 * 
 * can noooooot make instance from this class
 * can noooooot make inheritance from this class
 * get items by class name
 * 
 * 
 */
public class PrivateConstructor {
    
     static int id;
     static String name;

    private PrivateConstructor() {
        
    }
    
    public PrivateConstructor(int id, String name) {
        this.id=id;
        this.name=name;
    }
    
    public static void print()
    {
        System.out.println("id="+id + ", name="+name);   
    }
    
}
