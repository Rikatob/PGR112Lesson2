package org.pgr112.step7;

import java.awt.*;

public class Square extends Rectangle{

    private double side;

    public Square(){
        super(1.0,1.0,Color.GREEN,true);
        this.side = 1.0;
    }

    public Square(double side){
        super(side,side);
        this.side = side;
    }

    public Square(double side, Color color, boolean filled){
        super(side,side,color,filled);
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
}
