
package Enumerated;

/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
    
    public static void main(String[] args) {
    
//        operaton on enum
        
        Semester sum =Semester.Winter;
        Semester sm =Semester.Fall;
        
        System.out.println(sum.toString());
        System.out.println(sum.ordinal());
        System.out.println(sum.compareTo(sm));
        System.out.println(sum.equals(sm));
        
        
         Register re = new Register();
         System.out.println(re.toString());
        
    }
    
}
