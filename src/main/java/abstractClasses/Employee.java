
package abstractClasses;

/**
 * abstract class con not make an instantiated from it
 * include an abstract class must be override by subclass
 * get object from subclasses
 * @author Ahmed Mansour
 */
public abstract class Employee {
    private String name;
    private int age;
    private double salary;
    private String rank;
    private String job;

    public Employee() {
    }

    public Employee(String name, int age, double salary, String rank, String job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rank = rank;
        this.job = job;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + ", rank=" + rank + ", job=" + job + '}';
    }
    
    
    public abstract double get_Abstract_Salary();
    
}
