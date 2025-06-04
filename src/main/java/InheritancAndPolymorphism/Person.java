
package InheritancAndPolymorphism;

/**
 *
 * @author Ahmed Mansour
 */
public class Person {
    
    private String name;
    private int age;
    private String address;
    private String nationality;

    public Person() {
//       when make instantiated  from subclass . this constructor of  super class
//                                is executed first
        System.out.println("This is a person");
    }

    public Person(String name, int age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", address=" + address + ", nationality=" + nationality + '}';
    }

    public void printAllDetails()
    {
        System.out.print("Name=" + name + ", Age=" + age + ", Address=" + address + ", Nationality=" + nationality +", ");
    }
    
    
    
    
    
    
}
