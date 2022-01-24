package org.pgr112.step7;

import java.awt.*;

public class Rectangle extends Shape{

    private double width;
    private double length;
    public MovablePoint topLeft;
    public MovablePoint bottomRight;


    public Rectangle(){
        super(Color.GREEN,true);
        this.width = 1.0;
        this.length = 2.0;
        this.topLeft = new MovablePoint(5,5);
        this.bottomRight=new MovablePoint((5+1),(5+2));
    }

    public Rectangle(double width, double length){
        super(Color.GREEN, true);
        this.width = width;
        this.length = length;
        this.topLeft = new MovablePoint(5,5);
        this.bottomRight=new MovablePoint(10+width,2+length);

    }

    public Rectangle(double width, double length, Color color, boolean filled,double topX, double topY){
        super(color,filled);
        if(topX<topX+width){
            this.width = width;
            this.length = length;
            this.topLeft = new MovablePoint(topX,topY);
            this.bottomRight = new MovablePoint(topX+width,topY+length);
        } else{
            System.out.println("unacceptable coordinates!");
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        double area = width * length;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = (width + length) * 2;
        return perimeter;
    }


    @Override
    public String toString(){
        Color color = this.getColor();
        boolean filled = this.isFilled();
        return "Width: " + width
                + " Length: " + length
                + " Color: " + color
                + " IsFilled: " + filled;
    }

    @Override
    public void moveUp(double distance) {
        topLeft.moveUp(distance);
        bottomRight.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        topLeft.moveDown(distance);
        bottomRight.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        topLeft.moveRight(distance);
        bottomRight.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        topLeft.moveLeft(distance);
        bottomRight.moveLeft(distance);
    }

    public void uniqueRectangleMethod(){
        System.out.println("This is the unique rectangleMethod!");
    }
}
