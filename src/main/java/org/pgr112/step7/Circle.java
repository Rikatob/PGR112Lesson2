package org.pgr112.step7;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(Color color, boolean filled, double radius){
        super(color, filled);
        this.radius= radius;
    }

    @Override
    public double getArea(){
        double area = (radius * radius) * Math.PI;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = (radius * 2 ) * Math.PI;
        return perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
