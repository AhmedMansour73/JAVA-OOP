
package oop.opp;

/**
 *
 * @author Ahmed Mansour
 */
public class Opp {

    public static void main(String[] args) {
    
        
        Rectangle rec = new Rectangle();
        rec.setHight(42);
        rec.setWidth(25);
        System.out.println(rec.toString());
         System.out.println(rec.area());
        
         Rectangle rec1 = new Rectangle(12,16);
         System.out.println(rec1.toString());
         System.out.println(rec1.area());
         
         
         
         System.out.println("*************************************");
         
         Employee emp1 = new Employee();
         emp1.printEmpData();
         
          Employee emp2 = new Employee(44,"Ahmed");
         emp2.printEmpData();
         
         Employee emp3 = new Employee(44,"Ali",true);
         emp3.printEmpData();
         Employee emp4 = new Employee(44,"Mohamed","CS",25555,2000,false);
         emp4.printEmpData();
         
         
          System.out.println("*************************************");
         
    }
}
