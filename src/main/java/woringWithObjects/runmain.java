
package woringWithObjects;

/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
    public static void main(String[] args) {
    
        RectPassing rr= new RectPassing();
        RectPassing rect1= new RectPassing(70,80);
        // passing
        // call by refrence
        rr.mdifyObjects(rect1);
        System.out.println(rect1.getHight());
        
        
        System.out.println("**************** return object ******************");
        RectPassing rect2= new RectPassing(70,80);
        RectPassing rect3= new RectPassing(17,26);
 
        rr=rr.addTwoRect(rect2, rect3);
        System.out.println(rr.getHight());
        System.out.println(rr.getWidth());
          
        rect2 = rect2.addTwoRect(rect3);
        System.out.println(rect2.getHight());
        System.out.println(rect2.getWidth());
        
        rr = rect2.addTwoRect(rect3);
        System.out.println(rr.getHight());
        System.out.println(rr.getWidth());
        
         
        System.out.println("**************** Comparing object ******************"); 
        
        RectPassing rect4= new RectPassing(22,40);
        RectPassing rect5= new RectPassing(22,40);
        
        System.out.println(rect4.isEqual(rect5));
        
        
        System.out.println("**************** coping object ******************"); 
        RectPassing rect6= new RectPassing(220,410);
        RectPassing rect7= new RectPassing();
        
        rect7.copingObject(rect6);
        System.out.println(rect7.getHight());
        System.out.println(rect7.getWidth());
        
        
        RectPassing rect8 = new RectPassing(rect6);
        System.out.println(rect8.getHight());
        System.out.println(rect8.getWidth());
        
       
    }
    
}
