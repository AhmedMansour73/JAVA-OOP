
package woringWithObjects;

/**
 * coping object
 * retern object
 * Comparing object
 * passing object as argument in method
 * 
 * @author Ahmed Mansour
 */
public class RectPassing {
    
    private int width;
    private int hight;

    
    public RectPassing()
    {}
    
    public RectPassing(int width, int hight) {
        this.width = width;
        this.hight = hight;     
    }
    
    ///// passing object as argument in method
    ///// in this stautes call by refrence
    ///
    
    public void mdifyObjects(RectPassing rect)
    {
        rect.hight=40;
        rect.width=40;
    }
    
    
    
    //// method retern object
    ////
    
    public RectPassing addTwoRect(RectPassing r1 , RectPassing r2)
    {
        RectPassing result =new RectPassing();
        result.hight=r1.hight+r2.hight;
        result.width = r1.width + r2.width;
        return result;
        
    }
    
    public RectPassing addTwoRect( RectPassing r2)
    {
        
        r2.hight += this.hight;
        r2.width += this.width;
        return r2;
        
    }
    
    
    ////   Comparing object
    ///
    ///
    
    public boolean isEqual(RectPassing r2)
    {
        if(this.hight == r2.hight && this.width == r2.width)
            return true;
        else
            return false;
    }
    
    //// coping object
    ///
    ///
    
    public RectPassing(RectPassing r2)
    {
        this.hight =r2.hight;
        this.width=r2.width;
    }
    public void copingObject(RectPassing r2)
    {
        this.hight =r2.hight;
        this.width=r2.width;
    }
    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", hight=" + hight + '}';
    }
    
    public String area()
    {
        return "Area of Rectangle = " + (width*hight) ;
    }
}
