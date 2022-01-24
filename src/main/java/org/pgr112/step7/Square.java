package org.pgr112.step7;

import java.awt.*;

public class Square extends Rectangle{

    private double side;

    public Square(){
        super(1.0,1.0,Color.GREEN,true,2,3);
        this.side = 1.0;
    }

    public Square(double side){
        super(side,side);
        this.side = side;
    }

    public Square(double side, Color color, boolean filled, double topX, double topY){
        super(side,side,color,filled,topX,topY);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        double area = side * side;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = side * 4;
        return perimeter;
    }

    @Override
    public String toString(){
        return " Side: " + side
                + " Color: " + this.getColor()
                + " Filled: " + this.isFilled();
    }

    public void uniqueSquareMethod(){
        System.out.println("This is the unique SquareMethod!");
    }
}

