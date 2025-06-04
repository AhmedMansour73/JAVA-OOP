/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.opp;

/**
 *
 * @author Ahmed Mansour
 */


////   Seter method in ather books is Mutator
///    geter method ............... is Accessors
public class Rectangle {
    private int width;
    private int hight;

    ///  defaulta constructor
    // 1- set all object numeric  fields by 0
    // 2- ---------- boolean by false
    // 3- ----------- referenc variable  by  null
    public Rectangle()
    {
        System.out.println("default constructor --------------->");
    }
    
    public Rectangle(int width, int hight) {
        this.width = width;
        this.hight = hight;
        System.out.println("parameter constructor *******///******");
        
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
