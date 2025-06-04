
package oop.opp;

/**
 *
 * @author Ahmed Mansour
 */
public class Employee {
    private int eid;
    private String ename;
    private String dpname;
    private double esalary;
    private double ebonus;
    private boolean resident;
    
    public Employee()
    {}
    
    public Employee(int id ,String name)
    {
        this.eid=id;
        this.ename=name;
    }
    
    public Employee(int id ,String name , boolean resid)
    {
        this.eid=id;
        this.ename=name;
        this.resident=resid;
    }
    
    public Employee(int id ,String name,String dpt , double sal , double bonu ,boolean resid)
    {
        this.eid=id;
        this.ename=name;
        this.dpname=dpt;
        this.esalary=sal;
        this.ebonus=bonu;
        this.resident=resid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    public double getEbonus() {
        return ebonus;
    }

    public void setEbonus(double ebonus) {
        this.ebonus = ebonus;
    }

    public boolean isResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }
    
    public void setSalAndBonus(double sal ,double bon)
    {
        this.esalary=sal;
        this.ebonus=bon;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", ename=" + ename + ", dpname=" + dpname + ", esalary=" + esalary + ", ebonus=" + ebonus + ", resident=" + resident + '}';
    }
    
    public void printEmpData()
    {
        System.out.println("Employee{" + "eid=" + eid + ", ename=" + ename + ", dpname=" + dpname + ", esalary=" + esalary + ", ebonus=" + ebonus + ", resident=" + resident + '}');
    }    
    
    
    
}
