
package Enumerated;

/**
 *
 * @author Ahmed Mansour
 */
public class Register {
    private String stdname;
    private gender stdgender;
    private course course_;
    private Semester semester ;

    public Register() {
        this.stdname = "none";
        this.stdgender = stdgender.Male;
        this.course_ = course_.Database;
        this.semester = semester.Winter;
    }
    
    

    public Register(String stdname, gender stdgender, course course_, Semester semester) {
        this.stdname = stdname;
        this.stdgender = stdgender;
        this.course_ = course_;
        this.semester = semester;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public gender getStdgender() {
        return stdgender;
    }

    public void setStdgender(gender stdgender) {
        this.stdgender = stdgender;
    }

    public course getCourse_() {
        return course_;
    }

    public void setCourse_(course course_) {
        this.course_ = course_;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Register{" + "stdname=" + stdname + ", stdgender=" + stdgender + ", course_=" + course_ + ", semester=" + semester + '}';
    }
    
    
    
    
    
}
