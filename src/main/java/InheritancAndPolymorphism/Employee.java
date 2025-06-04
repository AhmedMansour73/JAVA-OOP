
package InheritancAndPolymorphism;

/**
 *
 * @author Ahmed Mansour
 */
public class Employee extends Person {
    
    private double salary;
    private String rank;
    private String job;

    public Employee() {
    }

    public Employee( String name, int age, String address, String nationality , double salary, String rank, String job) {
        super(name, age, address, nationality);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
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
        return "Employee{" + "salary=" + salary + ", rank=" + rank + ", job=" + job + '}';
    }
    
    /**
     *
     */
    @Override
     public void printAllDetails()
    {
        super.printAllDetails();
        System.out.println("Salary=" + salary + ", Rank=" + rank + ", Job=" + job);
    }
    
    
    
    
}
