/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.awt.*;

public class Quadrilateral3D extends Shape3D {
    public Quadrilateral3D(Integer id, String name, String description, Color color, double height, double width,double length) {
        super(id,name,description,color,height, width,length);
    }

    public double area() {
        return 2*(width*height+width*length+height*length);
    }

    public double perimeter() {
        return (4*(width+height+length));
    }

}