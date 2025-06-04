
package Collection;

/**
 *
 * @author Ahmed Mansour
 */
public class runmain {
    
    public static void main(String[] args) {
        
        Arraylist arr =new Arraylist();
        
        arr.nameList.add("Ahmed");
        arr.nameList.add("Ail");
        arr.nameList.add("Mohamed");
         System.out.println(arr.nameList);
        System.out.println(arr.nameList.size());
        arr.nameList.get(1);
        arr.nameList.remove(0);
         System.out.println(arr.nameList);
        arr.nameList.add(1,"Said");
         System.out.println(arr.nameList);
        arr.nameList.set(1, "Moize");
        System.out.println(arr.nameList);
        
    }
    
}
