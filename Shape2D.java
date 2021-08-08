/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.awt.*;

public abstract class Shape2D extends Shape {

    public final double height;
    public final double width;

    Shape2D(Integer id, String name, String description, Color color, double height, double width) {
        super(id,name,description,color);
        this.height = height;
        this.width = width;
    }
    public String toString() {
        return super.toString() + " " + this.height + " " + this.width;
    }

    public int compareTo(Shape shape) {

        int result = -1;

        if (shape instanceof Shape2D) {

            Shape2D shape2d = (Shape2D) shape;

            if (shape.id == shape2d.id
                    && this.name.compareTo(shape2d.getName()) == 0
                    && this.description.compareTo(shape2d.getDescription()) == 0
                    && this.width == shape2d.width
                    && this.height == shape2d.height)
                result = 0;
        }

        return result;
    }

    public String getDimensions(){
        return String.format("%.2f",width)+"X"+String.format("%.2f",height);
    }


}