package org.pgr112.step7;

import java.awt.*;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(){
        super(Color.GREEN,true);
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length){
        super(Color.GREEN, true);
        this.width = width;
        this.length = length;

    }

    public Rectangle(double width, double length, Color color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
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

}
