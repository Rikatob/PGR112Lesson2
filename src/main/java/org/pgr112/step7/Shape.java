package org.pgr112.step7;

import java.awt.*;
import java.util.HashMap;

abstract class Shape {
    private boolean filled;
    private Color color;
    private final int shapeIdentifier;
    private static int counter = 0;


    public Shape(){
        this.filled = true;
        this.color = Color.RED;
        this.shapeIdentifier = counter;
        counter++;

    }
    public Shape(Color color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.shapeIdentifier = counter;
        counter++;

    }
    @Override
    public String toString() {
        return " color: " + color
                + " Filled: " + filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();


    public abstract double getPerimeter();

    public int getShapeIdentifier(){
        return shapeIdentifier;
    }

}