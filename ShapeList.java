/*****************************
 * Author : Mehedi H Shohag  *
 * Assignment : 4            *
 * CSC 221-Section F         *
 * EMPLID:23614013           *
 *****************************/
package Assignment4;

import java.util.TreeSet;

public class ShapeList extends TreeSet<Shape> {
    TreeSet<Shape> shapes;

    public ShapeList() {
        this.shapes = new TreeSet<>();
    }

    public boolean add(Shape shape) {
        if (shapes.contains(shape)) {
            return false;
        } else {
            shapes.add(shape);
        }
        return true;
    }
    public ShapeList get2DShapes(){
        ShapeList shape2d = new ShapeList();
        for(Shape shape: shapes) {
            if(shape instanceof Shape2D) {
                shape2d.add((Shape2D) shape);
            }
        }
        return shape2d;
    }
    public ShapeList get3DShapes(){
        ShapeList shape3d=new ShapeList();
        for(Shape shape: shapes) {
            if(shape instanceof Shape3D) {
                shape3d.add((Shape3D) shape);
            }
        }
        return shape3d;
    }
    public int getSize() {
        return shapes.size();
    }

    public void printFormatted() {
        System.out.println("+------+-------------+-------+-----------------------+-------------------+");
        System.out.println("| ID   | Name        | Color | Dimensions            | Description       |");
        System.out.println("+------+-------------+-------+-----------------------+-------------------+");
        Object[] obj=new Object[5];
        for(Shape shape: shapes) {
            if (shape instanceof Quadrilateral) {

                Quadrilateral shape2D = (Quadrilateral) shape;

                obj[0] = shape2D.getId();
                obj[1] = shape2D.getName();
                obj[2] = shape2D.getColorName();
                obj[3] = shape2D.getDimensions();
                obj[4] = shape2D.getDescription();
            }
            else if (shape instanceof Quadrilateral3D) {

                Quadrilateral3D shape3D = (Quadrilateral3D) shape;

                obj[0] = shape3D.getId();
                obj[1] = shape3D.getName();
                obj[2] = shape3D.getColorName();
                obj[3] = shape3D.getDimensions();
                obj[4] = shape3D.getDescription();
            }

            System.out.printf("| %-4s | %-11s | %-5s | %-20s | %-17s |%n", obj[0],obj[1], obj[2],obj[3], obj[4]);
            System.out.println("+------+-------------+-------+-----------------------+-------------------+");
        }
    }

}