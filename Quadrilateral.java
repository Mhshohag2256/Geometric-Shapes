/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.awt.*;

public class Quadrilateral extends Shape2D {
    public Quadrilateral(Integer id, String name, String description, Color color, double height, double width) {
        super(id,name,description,color,height, width);
    }

    public double area() {
        return width*height;
    }
    public double perimeter() {
        return (2*(width+height));
    }
}