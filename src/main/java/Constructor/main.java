/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author ACTIVE
 */
public class main {
    public static void main(String[] args) {
        
//        DefaultConstructor object1= new DefaultConstructor();
//        System.out.println(object1.toString());
//        
//        ParameterizedConstructor object2= new ParameterizedConstructor(999,"vvvvv");
//        System.out.println(object2.toString());
        
          // PrivateConstructor object3 =new PrivateConstructor();  // private constructor can not make inctant 
          
          
          //  ruuunn 
        //PrivateConstructor object3=new PrivateConstructor(77,"anaaj");
       // object3.print();
        
//        PrivateConstructor.id=555;
//        PrivateConstructor.name="njh";
//        PrivateConstructor.print();


        
        CopyConstructor obj4 = new CopyConstructor(4444,"OMAR");
        CopyConstructor obj5 = new CopyConstructor(obj4);
        System.out.println(obj4.toString());
        System.out.println(obj4.toString());
        
        
        
        
        
        
    }
    
}
