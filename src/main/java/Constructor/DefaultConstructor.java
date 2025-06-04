
package Constructor;

/**
 *
 * @author Ahmed Mansour
 * 
 * call when make instance from class
 * get no argument 
 * 
 */
public class DefaultConstructor {
    
    private int id;
    private String name;

    public DefaultConstructor() {
        System.out.println("This is Default constructor");
        this.id=77;
        this.name="Ahmed";
       
    }

    @Override
    public String toString() {
        return "DefaultConstructor{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
    
}
