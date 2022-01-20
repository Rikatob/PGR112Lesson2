package org.pgr112.step7;

import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] arg) {
        System.out.println();

        System.out.println("========================================================================");
        Circle circle1 = new Circle(Color.ORANGE,true,5);
        System.out.println("CIRCLE1: ");
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1);
        System.out.println();
        System.out.println(circle1.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle1 = new Rectangle(5,3,Color.BLUE,true);
        System.out.println("Rectangle1: ");
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.toString());
        System.out.println();
        System.out.println(rectangle1.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square1 = new Square(5.0, Color.BLUE, true);
        System.out.println("SQUARE1: ");
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
        System.out.println(square1);
        System.out.println(square1.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle2 = new Circle(Color.MAGENTA,true,10);
        System.out.println("CIRCLE2: ");
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());
        System.out.println(circle2);
        System.out.println();
        System.out.println(circle2.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle2 = new Rectangle(10,5,Color.WHITE,true);
        System.out.println("Rectangle2: ");
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.toString());
        System.out.println();
        System.out.println(rectangle2.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square2 = new Square(12.0, Color.YELLOW, true);
        System.out.println("SQUARE2: ");
        System.out.println(square2.getPerimeter());
        System.out.println(square2.getArea());
        System.out.println(square2);
        System.out.println(square2.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle3 = new Circle(Color.PINK,true,8);
        System.out.println("CIRCLE3: ");
        System.out.println(circle3.getPerimeter());
        System.out.println(circle3.getArea());
        System.out.println(circle3);
        System.out.println();
        System.out.println(circle3.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle3 = new Rectangle(9,15,Color.DARK_GRAY,true);
        System.out.println("Rectangle3: ");
        System.out.println(rectangle3.getPerimeter());
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle3.toString());
        System.out.println();
        System.out.println(rectangle3.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square3 = new Square(13.0, Color.green, true);
        System.out.println("SQUARE3: ");
        System.out.println(square3.getPerimeter());
        System.out.println(square3.getArea());
        System.out.println(square3);
        System.out.println(square3.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle4 = new Circle(Color.black,true,20);
        System.out.println("CIRCLE4: ");
        System.out.println(circle4.getPerimeter());
        System.out.println(circle4.getArea());
        System.out.println(circle4);
        System.out.println();
        System.out.println(circle4.getShapeIdentifier());

        System.out.println("========================================================================");
        HashMap<String,Shape> shapeRegister = new HashMap<>();
        shapeRegister.put("circle1",circle1);
        shapeRegister.put("circle2",circle2);
        shapeRegister.put("circle3",circle3);
        shapeRegister.put("circle4",circle4);
        shapeRegister.put("rectangle1",rectangle1);
        shapeRegister.put("rectangle2",rectangle2);
        shapeRegister.put("rectangle3",rectangle3);
        shapeRegister.put("square1",square1);
        shapeRegister.put("square2",square2);
        shapeRegister.put("square3",square3);

        System.out.println("========================================================================");
        for(Shape i : shapeRegister.values()){
            System.out.println(i);
        }

        System.out.println("========================================================================");
        System.out.println(shapeRegister.get("square3"));


     /*   System.out.println(shape);
        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(square1);
*/
    }
}
