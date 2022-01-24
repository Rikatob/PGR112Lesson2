package org.pgr112.step7;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] arg) {
        System.out.println();

        System.out.println("========================================================================");
        Circle circle1 = new Circle(Color.ORANGE,true,5,16,24);
        System.out.println("CIRCLE1: ");
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1);
        System.out.println();
        System.out.println(circle1.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle1 = new Rectangle(5,3,Color.BLUE,true,2.0,10);
        System.out.println("Rectangle1: ");
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.toString());
        System.out.println();
        System.out.println(rectangle1.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square1 = new Square(5.0, Color.BLUE, true,5,4);
        System.out.println("SQUARE1: ");
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
        System.out.println(square1);
        System.out.println(square1.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle2 = new Circle(Color.MAGENTA,true,10,33,51);
        System.out.println("CIRCLE2: ");
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());
        System.out.println(circle2);
        System.out.println();
        System.out.println(circle2.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle2 = new Rectangle(10,5,Color.WHITE,true,20,10);
        System.out.println("Rectangle2: ");
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.toString());
        System.out.println();
        System.out.println(rectangle2.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square2 = new Square(12.0, Color.YELLOW, true,8,2);
        System.out.println("SQUARE2: ");
        System.out.println(square2.getPerimeter());
        System.out.println(square2.getArea());
        System.out.println(square2);
        System.out.println(square2.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle3 = new Circle(Color.PINK,true,8,62,53);
        System.out.println("CIRCLE3: ");
        System.out.println(circle3.getPerimeter());
        System.out.println(circle3.getArea());
        System.out.println(circle3);
        System.out.println();
        System.out.println(circle3.getShapeIdentifier());

        System.out.println("========================================================================");
        Rectangle rectangle3 = new Rectangle(9,15,Color.DARK_GRAY,true,1,1);
        System.out.println("Rectangle3: ");
        System.out.println(rectangle3.getPerimeter());
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle3.toString());
        System.out.println();
        System.out.println(rectangle3.getShapeIdentifier());

        System.out.println("========================================================================");
        Square square3 = new Square(13.0, Color.green, true,2,2);
        System.out.println("SQUARE3: ");
        System.out.println(square3.getPerimeter());
        System.out.println(square3.getArea());
        System.out.println(square3);
        System.out.println(square3.getShapeIdentifier());

        System.out.println("========================================================================");
        Circle circle4 = new Circle(Color.black,true,20,14,34);
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

        System.out.println("==========================WAYS TO GO THROUGH A HASHMAP======================================");

        System.out.println("\n========Using iterator========");
        Iterator hmIterator = shapeRegister.entrySet().iterator();

        while(hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            Shape area = ((Shape)mapElement.getValue());
            System.out.println(mapElement.getKey() + "::::" + area.getArea());
        }

        System.out.println("\n========Using for-each loop========");
        for (Map.Entry mapElement : shapeRegister.entrySet()){
            String key = (String)mapElement.getKey();
            Shape value = (Shape)mapElement.getValue();

            System.out.println(key+"::::"+value);
        }

        System.out.println("\n========Using forEach() method========");

        shapeRegister.forEach((k,v)
                                  -> System.out.println(k+"::::"+v));


        System.out.println("\n=======================Circle=======================================");
        System.out.println(circle1.center);
        circle1.center.moveUp(1);
        System.out.println(circle1.center);

        System.out.println("\n=======================Rectangle=======================================");
        System.out.println(rectangle3.topLeft);
        System.out.println(rectangle3.bottomRight);
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("\n=======================MoveUp=======================================");
        rectangle3.moveUp(5);
        System.out.println(rectangle3.topLeft);
        System.out.println(rectangle3.bottomRight);
        System.out.println("\n=======================MoveRight=======================================");
        rectangle3.moveRight(5);
        System.out.println(rectangle3.topLeft);
        System.out.println(rectangle3.bottomRight);
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Width: " + rectangle3.getWidth());

        System.out.println("\n============================UpCasting============================================");
        Shape s1 = new Circle(Color.MAGENTA,true,5,10,10);
        Shape s2 = new Rectangle(1,5,Color.BLUE,true,5,5);
        Shape s3 = new Square(1,Color.GREEN,true,5,5);
        ArrayList<Shape> shapeArray = new ArrayList<>();

        System.out.println("\n============================DownCasting============================================");
        //One way of DownCasting:
        ((Circle)s1).uniqueMethod();
        //Another way of downcasting.
        Circle circle5=((Circle)s1);
        circle5.uniqueMethod();

        shapeArray.add(s1);
        shapeArray.add(s2);
        shapeArray.add(s3);
        System.out.println("\n===============================InstanceOf=========================================");
        for(Shape s : shapeArray){
            System.out.println(s.getArea()+"::"+s.getPerimeter());
            if(s instanceof Circle){
                ((Circle)s).uniqueMethod();
            }else if(s instanceof Square){
                ((Square)s).uniqueSquareMethod();
            }else if(s instanceof Rectangle){
                ((Rectangle)s).uniqueRectangleMethod();
            } else{
                System.out.println("Error");
            }
        }
        System.out.println("\n===============================Extra task=========================================");
        Rectangle rec2 = new Rectangle(-5,5,Color.green,true,2,2);
        System.out.println(rec2);
    }
}
