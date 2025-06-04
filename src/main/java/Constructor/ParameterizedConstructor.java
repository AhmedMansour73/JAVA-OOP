
package Constructor;

/**
 *
 * @author Ahmed Mansour
 * 
 * call when make instance 
 * get arguments
 * 
 * 
 */
public class ParameterizedConstructor {
    private int id;
    private String name;

    public ParameterizedConstructor(int id ,String name) {
        System.out.println("This is Parameter constructor");
        this.id=id;
        this.name=name;
       
    }

    @Override
    public String toString() {
        return "ParameterizedConstructor{" + "id=" + id + ", name=" + name + '}';
    }
    
    

   
    
}
