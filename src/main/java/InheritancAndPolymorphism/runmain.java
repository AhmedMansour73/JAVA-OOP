
package InheritancAndPolymorphism;

/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
     public static void main(String[] args) {
     
         Student ss = new Student("Ahmed" ,24 , "Fayoum" , "Egyption" , 4 , "epsd" , 3.5);
//       System.out.println(ss.toString());
         ss.printAllDetails();

         Salaried_Employee SE = new Salaried_Employee("Ahmed" ,24 , "Fayoum" , "Egyption" , 18000,"rank" ,"job", 5000,1000);
         System.out.println(SE.getSalary());
         SE.printAllDetails();
         
     
     }
    
}
