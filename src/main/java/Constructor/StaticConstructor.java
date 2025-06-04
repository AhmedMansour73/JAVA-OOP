
package Constructor;

/**
 *
 * @author Ahmed Mansour
 *  
 * not allow in java 
 * 
 * can make
 * 
 * make initialization for any static variable
 * call him once if make more than on instance
 * 
 * 
 * 
 */
public class StaticConstructor {
    private static int staticCounter=0;
    private static int staticInstance=0;
    private int id;
    private String name;
    
//     static StaticConstructor() {
//        staticCounter++;
//        System.out.println("static Counter is call: "+ staticCounter);
//        
//    }

    public StaticConstructor(int id ,String name) {
        staticInstance++;
        System.out.println("static instance is call: "+ staticInstance);
    }
    
    

    
}
