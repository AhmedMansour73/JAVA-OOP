
package Constructor;

/**
 *
 * @author Ahmed Mansour
 * 
 * like parameter constructor but parameter is object from the same class
 * 
 */
public class CopyConstructor {
    private int id;
    private String name;

    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CopyConstructor(CopyConstructor copy) {
        this.id = copy.id;
        this.name = copy.name;
    }

    @Override
    public String toString() {
        return "CopyConstructor{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
