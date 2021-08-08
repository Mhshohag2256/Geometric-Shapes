/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.awt.*;

public abstract class Shape implements Comparable<Shape> {

    protected final Integer id;
    protected final String name;
    protected final String description;
    protected Color color;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Color getColor(){
        return color;
    }

    protected Shape(Integer id, String name, String description, Color color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color=color;
    }
    public int compareTo(Shape shape){
        if(this.name.compareTo(shape.name)==0 && this.color.equals(shape.getColorName())){
            return 0;
        }
        else return 1;
    }

    @Override
    public String toString() {
        return  " " + id +
                " " + name +
                " " + description +
                " " + color;
    }

    public String getColorName() {
        if(this.color.equals(Color.BLACK))
            return "Black";
        else if(this.color.equals(Color.BLUE))
            return "Blue";
        else if(this.color.equals(Color.GREEN))
            return "Green";
        else if(this.color.equals(Color.RED))
            return "Red";
        else if(this.color.equals(Color.WHITE))
            return "White";
        else if(this.color.equals(Color.CYAN))
            return "Cyan";
        else if(this.color.equals(Color.YELLOW))
            return "Yellow";
        else
            return "Color doesn't exist";


    }

    public abstract double perimeter();
    public abstract double area();
}