
package InheritancAndPolymorphism;

/**
 *
 * @author Ahmed Mansour
 */
public class Student extends Person {
    
    private int study_level;
    private String specialization;
    private double GPA;

    public Student() {
        System.out.println("This is a student");
    }

    public Student( String name, int age, String address, String nationality , int study_level, String specialization, double GPA) {
        super(name, age, address, nationality);
        this.study_level = study_level;
        this.specialization = specialization;
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "study_level=" + study_level + ", specialization=" + specialization + ", GPA=" + GPA + '}';
    }

    /**
     *
     */
    @Override
    public void printAllDetails()
    {
        super.printAllDetails();
        System.out.println("Study_level=" + study_level + ", Specialization=" + specialization + ", GPA=" + GPA );
    }
    
    
    
    
    
}
