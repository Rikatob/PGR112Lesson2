package org.pgr112.step7;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    public MovablePoint center;

    public Circle(){
        super();
        this.radius = 1.0;
        this.center = new MovablePoint(5,10);
    }

    public Circle(double radius){
        super();
        this.radius = radius;
        this.center = new MovablePoint(5,10);
    }

    public Circle(Color color, boolean filled, double radius, double x, double y){
        super(color, filled);
        this.radius= radius;
        this.center = new MovablePoint(x,y);
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

    @Override
    public void moveUp(double distance) {
        center.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        center.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        center.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        center.moveLeft(distance);
    }

    public void uniqueMethod(){
        System.out.println("This is the circle unique method!");
    }
}
