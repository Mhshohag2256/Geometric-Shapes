/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.awt.*;
import java.awt.Shape;

public abstract class Shape3D extends Shape2D {

    public final double length;

    Shape3D(Integer id, String name, String description, Color color, double height, double width,double length) {
        super(id,name,description,color,height, width);
        this.length=length;
    }

    public String getDimensions(){
        return String.format("%.2f",width)+"X"+String.format("%.2f",height)+"X"+String.format("%.2f",length);
    }
    public String toString() {
        return super.toString() + " " + this.length;
    }
    public int compareTo(Shape shape) {

        int result = -1;

        if (shape instanceof Shape3D) {

            Shape3D shape2d = (Shape3D) shape;

            if (this.id == shape2d.id
                    && this.name.compareTo(shape2d.getName()) == 0
                    && this.description.compareTo(shape2d.getDescription()) == 0
                    && this.width == shape2d.width
                    && this.height == shape2d.height
                    && this.length == shape2d.length)

                result = 0;
        }

        return result;
    }


}
