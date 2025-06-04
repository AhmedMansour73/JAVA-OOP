
package staticClass;

/**
 *
 * @author Ahmed Mansour
 */

///   has fild static is shard to objects
//////  can access by class name not instance
public class Car {
    
    private int model;
    private String name;
    
    ///// static variable
    private static int counter=0;

    public Car() {
        counter ++;
    }

    public Car(int model, String name) {
        this.model = model;
        this.name = name;
        counter ++;
       
    }
    
    public static void getNumberOfObjects()
    {
        System.out.println("Nubmer of instance = "+ counter);
       
    }
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", name=" + name + '}';
    }
    
    
    
    
    
}
