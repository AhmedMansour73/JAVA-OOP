
package InheritancAndPolymorphism;

/**
 *
 * @author Ahmed Mansour
 */
public class Salaried_Employee extends Employee{
    
    private double bonus;
    private double deduction;

    public Salaried_Employee() {
    }

    public  Salaried_Employee(String name, int age, String address, String nationality, double salary, String rank, String job , double bonus, double deduction) {
        super(name, age, address, nationality, salary, rank, job);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "Salaried_Employee{" + "bonus=" + bonus + ", deduction=" + deduction + '}';
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getSalary() {
        return super.getSalary() + bonus - deduction ;
    }
    
    /**
     *
     */
    @Override
     public void printAllDetails()
    {
        super.printAllDetails();
        System.out.println(", Bonus=" + bonus + ", Deduction=" + deduction);
    }
    
}
